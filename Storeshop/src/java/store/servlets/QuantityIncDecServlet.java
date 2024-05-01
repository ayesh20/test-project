package store.servlets;

import store.connection.DbConnection;
import store.dao.CartDao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/quantity-inc-dec")
public class QuantityIncDecServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        int id = Integer.parseInt(request.getParameter("id"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        try (Connection con = DbConnection.getConnection()) {
            if (action != null) {
                PreparedStatement pst;
                if (action.equals("inc")) {
                    pst = con.prepareStatement("UPDATE cart SET quantity = quantity + ? WHERE id = ?");
                    pst.setInt(1, quantity);
                    pst.setInt(2, id);
                    pst.executeUpdate();
                } else if (action.equals("dec")) {
                    pst = con.prepareStatement("UPDATE cart SET quantity = quantity - ? WHERE id = ? AND quantity > 1");
                    pst.setInt(1, quantity);
                    pst.setInt(2, id);
                    int rowsUpdated = pst.executeUpdate();
                    if (rowsUpdated == 0) {
                        pst = con.prepareStatement("DELETE FROM cart WHERE id = ?");
                        pst.setInt(1, id);
                        pst.executeUpdate();
                    }
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(QuantityIncDecServlet.class.getName()).log(Level.SEVERE, "Error updating cart quantity", e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuantityIncDecServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.sendRedirect("cart.jsp");
    }
}