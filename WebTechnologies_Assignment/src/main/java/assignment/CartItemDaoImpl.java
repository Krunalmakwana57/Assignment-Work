package assignment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CartItemDaoImpl implements CartItemDao {
    private final Connection connection;

    public CartItemDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addItem(Item item) {
        String query = "INSERT INTO items (itemId, itemTotal, quantity, cartId) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, item.getItemId());
            preparedStatement.setDouble(2, item.getItemTotal());
            preparedStatement.setInt(3, item.getQuantity());
            preparedStatement.setInt(4, item.getCart().getCartId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateItem(Item item) {
        String query = "UPDATE items SET itemTotal = ?, quantity = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setDouble(1, item.getItemTotal());
            preparedStatement.setInt(2, item.getQuantity());
            preparedStatement.setInt(3, item.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteItem(int itemId) {
        String query = "DELETE FROM items WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, itemId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Item getItem(int itemId) {
        String query = "SELECT * FROM items WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, itemId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Item item = new Item();
                item.setId(resultSet.getInt("id"));
                item.setItemId(resultSet.getString("itemId"));
                item.setItemTotal(resultSet.getDouble("itemTotal"));
                item.setQuantity(resultSet.getInt("quantity"));
                int cartId = resultSet.getInt("cartId");
                Cart cart = getCart(cartId);
                item.setCart(cart);
                return item;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        String query = "SELECT * FROM items";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Item item = new Item();
                item.setId(resultSet.getInt("id"));
                item.setItemId(resultSet.getString("itemId"));
                item.setItemTotal(resultSet.getDouble("itemTotal"));
                item.setQuantity(resultSet.getInt("quantity"));
                int cartId = resultSet.getInt("cartId");
                Cart cart = getCart(cartId);
                item.setCart(cart);
                items.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

}

