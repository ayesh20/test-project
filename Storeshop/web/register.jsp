<%-- register.jsp --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Register - FUNKYBOYZ</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="style.css" />
    <link href="https://cdn.jsdelivr.net/npm/remixicon@3.2.0/fonts/remixicon.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="shortcut icon" href="images/fav.png">
    <style>
        body {
            background-image: url("images/1112.jpg");
            background-attachment: fixed;
            background-repeat: no-repeat;
            background-position: center;
            backface-visibility: hidden;
        }
    </style>
    <script>
        function validateForm() {
            var name = document.forms["registrationForm"]["name"].value;
            var email = document.forms["registrationForm"]["email"].value;
            var password = document.forms["registrationForm"]["password"].value;
            var confirmPassword = document.forms["registrationForm"]["confirmPassword"].value;
            var country = document.forms["registrationForm"]["country"].value;

            if (name === "") {
                alert("Name is required");
                return false;
            }
            if (email === "") {
                alert("Email is required");
                return false;
            }
            if (password.length < 6) {
                alert("Password should be at least 6 characters");
                return false;
            }
            if (password !== confirmPassword) {
                alert("Passwords do not match");
                return false;
            }
            if (country === "") {
                alert("Country is required");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <center>
        <div class="logo">
            <img src="images/logo1.png" alt="Logo">
        </div>
    </center>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery-3.4.1.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap-4.4.1.js"></script>

    <br><br>

    <div class="container" id="form1">
        <form name="registrationForm" action="signup" method="post" onsubmit="return validateForm()">
            <h3 id="heading3">Register Now</h3>
            <div class="inputbox1">
                <input type="text" name="name" required>
                <label>Name</label>
            </div>
            <div class="inputbox1">
                <input type="email" name="email" required>
                <label>Email</label>
            </div>
            <div class="inputbox1">
                <input type="password" name="password" required>
                <label>Password</label>
            </div>
            <div class="inputbox1">
                <input type="password" name="confirmPassword" required>
                <label>Confirm Password</label>
            </div>
            <div class="inputbox1">
                <input type="text" name="country" required>
                <label>Country</label>
            </div>
            <div class="team">
                <div>
                    <button type="submit" name="submit" id="butt" class="form-btn">Register</button>
                    <div class="register">
                        <p>Already have an account? <a href="login.jsp">Log in</a></p>
                    </div>
                </div>
            </div>
            <p><a href="index.jsp"><font color="white"><i class="fa fa-home" aria-hidden="true"></i></font></a></p>
        </form>
    </div>

    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
</body>
</html>