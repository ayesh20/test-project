package store.servlets;

import store.connection.DbConnection;
import store.dao.CartDao;
import java.io.IOException;
import java.sql.Connection;
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
        int productId = Integer.parseInt(request.getParameter("id"));

        try {
            Connection con = DbConnection.getConnection();
            CartDao cartDao = new CartDao(con);
            boolean removed = cartDao.removeFromCart(productId);
            con.close();

            if (removed) {
                // Item removed successfully
                // You can add any additional logic here, such as displaying a success message
            } else {
                // Failed to remove item
                // You can add any additional logic here, such as displaying an error message
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RemoveFromCartServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.sendRedirect("cart.jsp");
    }
}