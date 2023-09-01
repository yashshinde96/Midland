<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title> Login Page </title>
    <link rel="shortcut icon" href="/midland/images/fav.png" type="image/x-icon">
   <link href="https://fonts.googleapis.com/css2?family=Ubuntu:wght@400;500&display=swap" rel="stylesheet">
    <link rel="shortcut icon" href="/midland/images/fav.jpg">
    <link rel="stylesheet" href="/midland/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/midland/css/style.css" />
</head>

<body>
    <form action="login" method="post">
    <div class="container-fluid">
        <div class="container">
            <div class="col-xl-10 col-lg-11 mx-auto login-container">
                <div class="row">
                   
                    <div class="col-lg-5 col-md-6 no-padding">
                        <div class="login-box">
                            <h5>Welcome Back!</h5>

                            <div class="login-row row no-margin">
                                <label for=""><i class="fas fa-envelope"></i> Username</label>
                                <input id="username" name="username" type="text" class="form-control form-control-sm">
                            </div>

                             <div class="login-row row no-margin">
                                <label for=""><i class="fas fa-unlock-alt"></i> Password</label>
                                <input id="password" name="password" type="text" class="form-control form-control-sm">
                            </div>

                             <div class="login-row row forrr no-margin">
                               <p> <input type="checkbox"> Remember Me</p>
                               <p><a class="vgh" href="">Forget Password?</a></p>
                            </div>

                             <div class="login-row btnroo row no-margin">
                               <button type="submit" class="btn btn-primary btn-sm"> Sign In</button>
                               <button class="btn btn-success  btn-sm"> Create Account</button>
                            </div>
                            <div class="login-row donroo row no-margin">
                               <p>Don't have an Account ? <a href="">Sign Up</a></p>
                            </div>
                        </div>
                    </div>
                    
                     <div class="col-lg-7 col-md-6 img-box">
                        <img src="/midland/images/sideimg.png" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div>
</form>    

</body>

<script src="/midland/js/popper.min.js"></script>
<script src="/midland/js/bootstrap.min.js"></script>
<script src="/midland/js/script.js"></script>

</html>