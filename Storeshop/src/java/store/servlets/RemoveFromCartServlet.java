package store.servlets;

import store.connection.DbConnection;
import store.dao.CartDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/remove-from-cart")
public class RemoveFromCartServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int productId = 0; // Initialize productId

        // Retrieve the productId from the request
        String productIdStr = request.getParameter("productId");
        if (productIdStr != null) {
            try {
                productId = Integer.parseInt(productIdStr);
            } catch (NumberFormatException e) {
                // Handle the exception, e.g., log the error or display an error message
                e.printStackTrace();
            }
        }

        // Call your DAO method to remove the product from the cart
        CartDao cartDao = null;
        try {
            cartDao = new CartDao(DbConnection.getConnection());
            cartDao.removeFromCart(productId); // Call the method to remove the product
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RemoveFromCartServlet.class.getName()).log(Level.SEVERE, null, ex);
            // Handle exceptions appropriately, e.g., display error message to user
        }

        // Redirect back to the cart page
        response.sendRedirect("cart.jsp");
    }
}
