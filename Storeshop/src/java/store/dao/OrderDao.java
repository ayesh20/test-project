package store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import store.model.Order;
import store.model.Product;

public class OrderDao {

    private Connection con;

    public OrderDao(Connection con) {
        this.con = con;
    }

    public boolean insertOrder(Order order) {
    PreparedStatement pst = null;
    try {
        String query = "INSERT INTO orders (name, address, contact_number, total_price, payment_method, items) VALUES (?, ?, ?, ?, ?, ?)";
        pst = con.prepareStatement(query);
        pst.setString(1, order.getName());
        pst.setString(2, order.getAddress());
        pst.setString(3, order.getContactNumber());
        pst.setString(4, order.getTotalPrice());
        pst.setString(5, order.getPaymentMethod());
        pst.setString(6, order.getItems());
        pst.executeUpdate();
        return true;  // Insertion successful
    } catch (SQLException e) {
        // Log or handle the exception
        e.printStackTrace();
        return false;  // Insertion failed
    } finally {
        try {
            // Close PreparedStatement
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Log or handle the exception
        } 
    }
}

    public List<Order> getAllOrders() {
    List<Order> orders = new ArrayList<>();
    PreparedStatement pst = null;
    ResultSet rs = null;
    try {
        String query = "SELECT * FROM orders";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        while (rs.next()) {
            Order order = new Order();
            order.setOrderId(rs.getInt("id"));
            order.setName(rs.getString("name"));
            order.setAddress(rs.getString("address"));
            order.setContactNumber(rs.getString("contact_number"));
            order.setTotalPrice(rs.getString("total_price"));
            order.setPaymentMethod(rs.getString("payment_method"));
            order.setItems(rs.getString("items"));
            orders.add(order);
        }
    } catch (SQLException e) {
        // Log or handle the exception
        e.printStackTrace();
    } finally {
        // Close resources in reverse order of creation
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return orders;
}

public List<Order> getUserOrders(int userId) {
    List<Order> orders = new ArrayList<>();
    PreparedStatement pst = null;
    ResultSet rs = null;
    try {
        String query = "SELECT * FROM orders WHERE user_id=? ORDER BY order_id DESC";
        pst = con.prepareStatement(query);
        pst.setInt(1, userId);
        rs = pst.executeQuery();
        while (rs.next()) {
            Order order = new Order();
            order.setOrderId(rs.getInt("id"));
            order.setName(rs.getString("name"));
            order.setAddress(rs.getString("address"));
            order.setContactNumber(rs.getString("contact_number"));
            order.setTotalPrice(rs.getString("total_price"));
            order.setPaymentMethod(rs.getString("payment_method"));
            order.setItems(rs.getString("items"));
            orders.add(order);
        }
    } catch (SQLException e) {
        // Log or handle the exception
        e.printStackTrace();
    } finally {
        // Close resources in reverse order of creation
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return orders;
}

public boolean cancelOrder(int id) {
    PreparedStatement pst = null;
    try {
        String query = "DELETE FROM orders WHERE id=?";
        pst = con.prepareStatement(query);
        pst.setInt(1, id);
        int rowsDeleted = pst.executeUpdate();
        return rowsDeleted > 0;
    } catch (SQLException e) {
        // Log or handle the exception
        e.printStackTrace();
        return false;
    } finally {
        // Close PreparedStatement
        try {
            if (pst != null) pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

}
