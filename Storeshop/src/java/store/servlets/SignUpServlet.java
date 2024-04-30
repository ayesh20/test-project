package store.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import store.connection.DbConnection;


@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Check if the email already exists
        if (isEmailExists(email)) {
            request.setAttribute("errorMessage", "An account with this email already exists. Please <a href='login.jsp'>Log In Here</a>");
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;
        }

     

        try (Connection con = DbConnection.getConnection()) {
            String query = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, password);

            int rowsInserted = stmt.executeUpdate();

            if (rowsInserted > 0) {
                response.sendRedirect("login.jsp"); // Redirect to login page after successful signup
            } else {
                request.setAttribute("errorMessage", "Error: Failed to sign up. Please try again later.");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace(); // Add proper error logging
            request.setAttribute("errorMessage", "Error: Failed to sign up. Please try again later.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }

    private boolean isEmailExists(String email) {
        // Implement the logic to check if the email already exists in the database
        // Return true if the email exists, false otherwise
        // Example implementation:
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