<%@page import= "store.connection.DbConnection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="store.model.Cart"%>
<%@page import="java.util.List"%>z
<%@page import="store.model.Product"%>
<%@page import="store.dao.ProductsDao"%>
<%@page import="store.model.User"%>
<%
    User auth = (User) request.getSession().getAttribute("auth");
    if (auth != null) {
        request.setAttribute("person", auth);
    }

    // Check if the user is logged in and adjust the navigation bar accordingly
    boolean isLoggedIn = auth != null; // Check if user is logged in
%>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="store.model.Cart" %>
<%@ page import="store.connection.DbConnection" %>
<%@ page import="store.dao.CartDao" %>

<%
    // Retrieve the current cart count from the session
    Integer cartCount = (Integer) session.getAttribute("cartCount");
    // If the cart count is null, initialize it to 0
    if (cartCount == null) {
        cartCount = 0;
    }
    // Increment the cart count by one
    cartCount++;
    // Set the updated cart count back into the session attribute
    session.setAttribute("cartCount", cartCount);

    // Your code to add the item to the cart goes here...
    // Redirect back to the previous page or wherever you want
    response.sendRedirect(request.getHeader("referer"));
%>

<header class="header" >
    <nav class="nav container">
        <div class="nav__data">
            <a href="#" class="nav__logo">
                <!-- Logo content here -->
            </a>
            <div class="nav__toggle" id="nav-toggle">
                <i class="ri-menu-line nav__burger"></i>
                <i class="ri-close-line nav__close"></i>
            </div>
        </div>
        <!--=============== NAV MENU ===============-->
        <div class="nav__menu" id="nav-menu">
            <ul class="nav__list">
                <li><a href="index.jsp" class="nav__link">Home</a></li>
                <li><a href="mshirt.jsp" class="nav__link">Shirts</a></li>
                <li><a href="t-shirts.jsp" class="nav__link">T-Shirts</a></li>
                <li><a href="mtrouser.jsp" class="nav__link">Pants</a></li>
                <li><a href="shorts.jsp" class="nav__link">Shorts</a></li>
                <li><a href="gallery.jsp" class="nav__link">Gallery</a></li>
                <li><a href="aboutus.jsp" class="nav__link">About us</a></li>
                <!-- Other menu items -->
                <% if (isLoggedIn) { %>
                <li><a href="logout.jsp" class="nav__link">Logout</a></li>
                    <% } else { %>
                <li><a href="login.jsp" class="nav__link">Login</a></li>
                    <% }%>
                <li class="dropdown__item">
                    <div class="nav__link">
                        <a href="cart.jsp" id="cdn"><span class="totalQuantity"  id="cart-count">0</span>
                            <i class="fa fa-cart-arrow-down" aria-hidden="true"></i>  <!-- Initial count is 0 -->My Cart
                        </a>
                    </div></li>

                <!-- Other menu items -->
            </ul>
        </div>
    </nav>
</header>
