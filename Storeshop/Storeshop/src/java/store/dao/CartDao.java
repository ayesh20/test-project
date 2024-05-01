
package store.dao;
   import store.model.Cart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartDao {
    private Connection con;

    public CartDao(Connection con) {
        this.con = con;
    }

    // Method to add an item to the cart
    public boolean addToCart(Cart cart) {
        boolean added = false;
        try {
            String query = "INSERT INTO cart (product_id, name, price, quantity, image) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, cart.getProductId());
            pst.setString(2, cart.getName());
            pst.setDouble(3, cart.getPrice());
            pst.setInt(4, cart.getQuantity());
            pst.setString(5, cart.getImage());

            int rows = pst.executeUpdate();
            if (rows > 0) {
                added = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return added;
    }

    // Method to get all items in the cart
    public List<Cart> getAllItems() {
        List<Cart> cartItems = new ArrayList<>();
        try {
            String query = "SELECT * FROM cart";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Cart cart = new Cart();
                cart.setProductId(rs.getInt("product_id"));
                cart.setName(rs.getString("name"));
                cart.setPrice(rs.getDouble("price"));
                cart.setQuantity(rs.getInt("quantity"));
                cart.setImage(rs.getString("image"));
                cartItems.add(cart);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cartItems;
    }

    // Method to remove an item from the cart
public boolean removeFromCart(int id) {
    boolean removed = false;
    try {
        String query = "DELETE FROM cart WHERE id=?"; // Updated query
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        int rows = pst.executeUpdate();
        if (rows > 0) {
            removed = true;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return removed;
}
    
     public void updateQuantity(int productId, int quantityChange) throws SQLException {
        String query = "UPDATE cart SET quantity = quantity + ? WHERE id = ?";
        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, quantityChange);
            pstmt.setInt(2, productId);
            pstmt.executeUpdate();
        }
    }
    // Method to clear all items from the cart
    public boolean clearCart() {
        boolean cleared = false;
        try {
            String query = "DELETE FROM cart";
            PreparedStatement pst = con.prepareStatement(query);
            int rows = pst.executeUpdate();
            if (rows > 0) {
                cleared = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cleared;
    }
}
 

