package store.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import store.connection.DbConnection;
import store.dao.UserDao;
import store.model.User;

@WebServlet("/user-login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            UserDao userDao = new UserDao(DbConnection.getConnection());
            User user = userDao.userLogin(email, password);

            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("auth", user); // Update session attribute name
                response.sendRedirect("index.jsp");
            } else {
                request.setAttribute("errorMessage", "Failed to log in. Please try again.");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Add proper error logging
            request.setAttribute("errorMessage", "An error occurred during login. Please try again later.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}