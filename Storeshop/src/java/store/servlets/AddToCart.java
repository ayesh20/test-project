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

@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productId = request.getParameter("productId");
        String productName = request.getParameter("productName");
        String productPrice = request.getParameter("productPrice");
        String productImage = request.getParameter("image");
        String productSize = request.getParameter("size");

       try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/funkyboyz.store", "root", "")) {
    String sql = "INSERT INTO cart (product_id, name, price, image, size) VALUES (?, ?, ?, ?, ?)";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, productId);
        stmt.setString(2, productName);
        stmt.setString(3, productPrice);
        stmt.setString(4, productImage);
        stmt.setString(5, productSize);
        stmt.executeUpdate();
    } catch (SQLException ex) {
        // Handle any SQL exceptions here
        ex.printStackTrace();
        // You might want to redirect to an error page or display an error message to the user
        // For example:
        // response.sendRedirect("errorPage.jsp");
    }

    // Redirect to the referring page
    String referer = request.getHeader("referer");
    response.sendRedirect(referer);
} catch (SQLException ex) {
    // Handle any SQL exceptions related to establishing the database connection
    ex.printStackTrace();
    // You might want to redirect to an error page or display an error message to the user
    // For example:
    // response.sendRedirect("errorPage.jsp");
}

    }
}
