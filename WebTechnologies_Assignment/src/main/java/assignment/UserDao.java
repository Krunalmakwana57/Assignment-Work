package assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public void addUser(UserModel user) {
        try {Connection connection = DBConnectivity.createConnection();
        String sql = "INSERT INTO users (fname, lname, email, mobile) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql); 
            statement.setString(1, user.getFname());
            statement.setString(2, user.getLname());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getMobile());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<UserModel> getAllUsers() {
        List<UserModel> users = new ArrayList<>();

        try {Connection connection = DBConnectivity.createConnection();
        		String sql = "SELECT * FROM users";
             PreparedStatement statement = connection.prepareStatement(sql); 

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
            	UserModel user = createUserFromResultSet(resultSet);
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public UserModel getUserById(int uid) {
        try {Connection connection = DBConnectivity.createConnection();
        String sql = "SELECT * FROM users WHERE uid = ?";
             PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, uid);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return createUserFromResultSet(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    private UserModel createUserFromResultSet(ResultSet resultSet) throws SQLException {
    	UserModel user = new UserModel();
        user.setUid(resultSet.getInt("uid"));
        user.setFname(resultSet.getString("fname"));
        user.setLname(resultSet.getString("lname"));
        user.setEmail(resultSet.getString("email"));
        user.setMobile(resultSet.getString("mobile"));

        return user;
    }
}

