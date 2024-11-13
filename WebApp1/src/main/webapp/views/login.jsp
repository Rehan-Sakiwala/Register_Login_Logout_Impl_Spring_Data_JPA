<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body class="body_bg">
    <h4>Login Here<h4>

    <c:if test="${not empty errorMsg}">
      <h4>${errorMsg}</h4>
    
    </c:if>

    <form method="post" action="loginForm">
      Email : <input type="text" name="email"> <br/><br/>
      Password : <input type="text" name="password"> <br/><br/>
      <input type="submit" value="Login"/>

     <a href="register"><h3>Registration Page</h3></a><br/><br/>
    </form>
</body>
</html>