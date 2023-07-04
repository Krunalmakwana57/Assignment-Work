package assignment;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReaderDaoImpl implements ReaderDao {
    private final Connection connection;

    public ReaderDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addReader(Reader reader) {
        String query = "INSERT INTO reader (email, firstName, lastName) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, reader.getEmail());
            preparedStatement.setString(2, reader.getFirstName());
            preparedStatement.setString(3, reader.getLastName());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                int readerId = resultSet.getInt(1);
                reader.setReaderId(readerId);
                insertReaderSubscriptions(reader);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertReaderSubscriptions(Reader reader) {
        String query = "INSERT INTO reader_subscription (readerId, subscriptionId) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            for (Subscription subscription : reader.getSubscriptions()) {
                preparedStatement.setInt(1, reader.getReaderId());
                preparedStatement.setInt(2, subscription.getSubscriptionId());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateReader(Reader reader) {
        String query = "UPDATE reader SET email = ?, firstName = ?, lastName = ? WHERE readerId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, reader.getEmail());
            preparedStatement.setString(2, reader.getFirstName());
            preparedStatement.setString(3, reader.getLastName());
            preparedStatement.setInt(4, reader.getReaderId());
            preparedStatement.executeUpdate();

            // Update the reader's subscriptions by deleting and re-inserting
            deleteReaderSubscriptions(reader.getReaderId());
            insertReaderSubscriptions(reader);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteReader(int readerId) {
        // Delete the reader's subscriptions first
        deleteReaderSubscriptions(readerId);

        // Delete the reader
        String query = "DELETE FROM reader WHERE readerId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, readerId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteReaderSubscriptions(int readerId) {
        String query = "DELETE FROM reader_subscription WHERE readerId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, readerId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Reader getReader(int readerId) {
        String query = "SELECT * FROM reader WHERE readerId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, readerId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Reader reader = new Reader();
                reader.setReaderId(resultSet.getInt("readerId"));
                reader.setEmail(resultSet.getString("email"));
                reader.setFirstName(resultSet.getString("firstName"));
                reader.setLastName(resultSet.getString("lastName"));
                reader.setSubscriptions(getReaderSubscriptions(readerId));
                return reader;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Set<Subscription> getReaderSubscriptions(int readerId) {
        Set<Subscription> subscriptions = new HashSet<>();
        String query = "SELECT * FROM subscription INNER JOIN reader_subscription " +
                "ON subscription.subscriptionId = reader_subscription.subscriptionId " +
                "WHERE reader_subscription.readerId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, readerId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Subscription subscription = new Subscription();
                subscription.setSubscriptionId(resultSet.getInt("subscriptionId"));
                subscription.setSubscriptionName(resultSet.getString("subscriptionName"));
                subscriptions.add(subscription);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return subscriptions;
    }

    @Override
    public List<Reader> getAllReaders() {
        List<Reader> readers = new ArrayList<>();
        String query = "SELECT * FROM reader";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Reader reader = new Reader();
                reader.setReaderId(resultSet.getInt("readerId"));
                reader.setEmail(resultSet.getString("email"));
                reader.setFirstName(resultSet.getString("firstName"));
                reader.setLastName(resultSet.getString("lastName"));
                reader.setSubscriptions(getReaderSubscriptions(reader.getReaderId()));
                readers.add(reader);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return readers;
    }
}

