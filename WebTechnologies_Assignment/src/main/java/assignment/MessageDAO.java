package assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MessageDAO {

    public void addMessage(MessegeModel message) {
        try {Connection connection = DBConnectivity.createConnection();
        	String sql = "INSERT INTO messages (uid, from_user, to_user, msg) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, message.getUid());
            statement.setString(2, message.getFrom());
            statement.setString(3, message.getTo());
            statement.setString(4, message.getMsg());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<MessegeModel> getAllMessages() {
        List<MessegeModel> messages = new ArrayList<>();

        try {Connection connection = DBConnectivity.createConnection();
        		String sql = "SELECT * FROM messages";
             PreparedStatement statement = connection.prepareStatement(sql); 

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
            	MessegeModel message = createMessageFromResultSet(resultSet);
                messages.add(message);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return messages;
    }

    public MessegeModel getMessageById(int uid) {
        try {Connection connection = DBConnectivity.createConnection();
        	String sql = "SELECT * FROM messages WHERE uid = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, uid);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return createMessageFromResultSet(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    private MessegeModel createMessageFromResultSet(ResultSet resultSet) throws SQLException {
    	MessegeModel message = new MessegeModel();
        message.setUid(resultSet.getInt("uid"));
        message.setFrom(resultSet.getString("from_user"));
        message.setTo(resultSet.getString("to_user"));
        message.setMsg(resultSet.getString("msg"));

        return message;
    }
}

