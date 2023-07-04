package assignment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CartDaoImpl implements CartDao {
    private final Connection connection;

    public CartDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addCart(Cart cart) {
        String query = "INSERT INTO cart (name, total) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, cart.getName());
            preparedStatement.setDouble(2, cart.getTotal());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                int cartId = resultSet.getInt(1);
                cart.setCartId(cartId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateCart(Cart cart) {
        String query = "UPDATE cart SET name = ?, total = ? WHERE cartId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, cart.getName());
            preparedStatement.setDouble(2, cart.getTotal());
            preparedStatement.setInt(3, cart.getCartId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCart(int cartId) {
        String query = "DELETE FROM cart WHERE cartId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, cartId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cart getCart(int cartId) {
        String query = "SELECT * FROM cart WHERE cartId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, cartId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Cart cart = new Cart();
                cart.setCartId(resultSet.getInt("cartId"));
                cart.setName(resultSet.getString("name"));
                cart.setTotal(resultSet.getDouble("total"));
                return cart;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Cart> getAllCarts() {
        List<Cart> carts = new ArrayList<>();
        String query = "SELECT * FROM cart";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Cart cart = new Cart();
                cart.setCartId(resultSet.getInt("cartId"));
                cart.setName(resultSet.getString("name"));
                cart.setTotal(resultSet.getDouble("total"));
                carts.add(cart);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carts;
    }
}

