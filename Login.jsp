<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Sign-Up/Login Form</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/bootstrap.css">
  <link rel="stylesheet" href="style.css">


</head>

<body>
  <div class="form">

<a class="button button-block" href="login.html" style="font-style: Menlo; text-align: center;background-color: black" />Log In</a>
      <div class="tab-content">

				<div id="login">
          <h1>Welcome Back!</h1>

          <form action="Loginserv" method="post">

            <div class="field-wrap">
            <label>
              Email Address<span class="req">*</span>
            </label>
            <input type="email"required autocomplete="off" name="email"/>
          </div>

          <div class="field-wrap">
            <label>
              Password<span class="req">*</span>
            </label>
            <input type="password"required autocomplete="off" name="pass"/>
          </div>

          <p class="forgot"><a href="#">Forgot Password?</a></p>

          <button class="button button-block"/>Log In</button>

          </form>
          <hr style="color: white"/>
        
        </div>

        

          <button class="button button-block" onclick="location.href='signup.html'" style="font-style: Menlo; text-align: center;" />Sign-Up</button>

        </form>
      </div>
    </div>
  </div>

  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="index.js"></script>

</body>
</html>
    