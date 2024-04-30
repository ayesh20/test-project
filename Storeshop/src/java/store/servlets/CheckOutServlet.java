package store.servlets;

import store.connection.DbConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkoutservlet")
public class CheckOutServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String contactNo = request.getParameter("contactNo");
        String zipCode = request.getParameter("zipCode");

        // Establish database connection
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DbConnection.getConnection();

            // Prepare SQL statement to insert order details into order table
            String query = "INSERT INTO orders (full_name, email, address, city, contact_no, zip_code) VALUES (?, ?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, fullName);
            pstmt.setString(2, email);
            pstmt.setString(3, address);
            pstmt.setString(4, city);
            pstmt.setString(5, contactNo);
            pstmt.setString(6, zipCode);

            // Execute the SQL statement
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                // Order placed successfully, you can redirect to a confirmation page
                response.sendRedirect("cart.jsp");
            } else {
                // Handle case where order insertion failed
                response.sendRedirect("checkout.jsp?error=1");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            // Handle database connection or SQL exception
            ex.printStackTrace();
            response.sendRedirect("checkout.jsp?error=1");
        } finally {
            // Close database resources
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
