 import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ... (imports and servlet annotation)

@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productId = request.getParameter("productId");
        String productName = request.getParameter("productName");
        String productPrice = request.getParameter("productPrice");
        String productQuantity = request.getParameter("quantity");
        String productImage = request.getParameter("image");
        String productSize = request.getParameter("size");

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/funkyboyz.store", "root", "")) {
            String sql = "INSERT INTO cart (product_id, name, price, image, size ,quantity) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, productId);
                stmt.setString(2, productName);
                stmt.setString(3, productPrice);
                // Include the product quantity
                stmt.setString(4, productImage);
                stmt.setString(5, productSize);
                stmt.setString(6, productQuantity); 
                stmt.executeUpdate();
            } catch (SQLException ex) {
                // Handle SQL exceptions related to the prepared statement
                ex.printStackTrace();
                // Redirect to an error page
            }

            // Redirect to the referring page
            String referer = request.getHeader("referer");
            response.sendRedirect(referer);
        } catch (SQLException ex) {
            // Handle SQL exceptions related to establishing the database connection
            ex.printStackTrace();
            // Redirect to an error page
        }
    }
}
