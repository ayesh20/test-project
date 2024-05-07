// UserDao.java
package store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import store.connection.DbConnection;
import store.model.User;

public class UserDao {
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    public UserDao(Connection con) {
        this.con = con;
    }

    public User userLogin(String email, String password) {
        User user = null;
        try {
            String query = "SELECT * FROM users WHERE email=? AND password=?";
            pst = con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return user;
    }

    public boolean addUser(User newUser) {
        boolean success = false;
        try {
            String query = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
            pst = con.prepareStatement(query);
            pst.setString(1, newUser.getName());
            pst.setString(2, newUser.getEmail());
            pst.setString(3, newUser.getPassword());
            int rowsAffected = pst.executeUpdate();
            success = rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return success;
    }
    
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            String query = "SELECT * FROM users";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                  user.setPassword(rs.getString("password"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return users;
    }

    // Method to close PreparedStatement and ResultSet
    public void closeResources() {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // UserDao.java
    public boolean isEmailExists(String email) {
        try (Connection con = DbConnection.getConnection()) {
            String query = "SELECT COUNT(*) FROM users WHERE email = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, email);
            return stmt.executeQuery().getInt(1) > 0;
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace(); // Add proper error logging
            return false;
        }
    }
}
