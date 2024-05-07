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
import store.dao.UserDao;
import store.model.User;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Check if the email already exists
        try (Connection con = DbConnection.getConnection()) {
            UserDao userDao = new UserDao(con);
            if (userDao.isEmailExists(email)) {
                request.setAttribute("errorMessage", "An account with this email already exists. Please <a href='login.jsp'>Log In Here</a>");
                request.getRequestDispatcher("login.jsp").forward(request, response);
                return;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace(); // Add proper error logging
            request.setAttribute("errorMessage", "Error: Failed to sign up. Please try again later.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
            return;
        }

        try (Connection con = DbConnection.getConnection()) {
            con.setAutoCommit(false); // Disable auto-commit mode

            UserDao userDao = new UserDao(con);
            User newUser = new User(name, email, password);
            boolean success = userDao.addUser(newUser);

            if (success) {
                con.commit(); // Commit the transaction
                response.sendRedirect("login.jsp"); // Redirect to login page after successful signup
            } else {
                con.rollback(); // Rollback the transaction
                request.setAttribute("errorMessage", "Error: Failed to sign up. Please try again later.");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace(); // Add proper error logging
            request.setAttribute("errorMessage", "Error: Failed to sign up. Please try again later.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }
}