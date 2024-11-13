<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body class="body_bg">
    <h4>Register Here<h4>

    <c:if test="${not empty successMsg}">
      <h4>${successMsg}</h4>
    </c:if>

    <c:if test="${not empty errorMsg}">
      <h4>${errorMsg}</h4>
    
    </c:if>

    <form method="post" action="regForm">
      Name : <input type="text" name="name"> <br/><br/>
      Email : <input type="text" name="email"> <br/><br/>
      Contact : <input type="text" name="contact"> <br/><br/>
      Password : <input type="text" name="password"> <br/><br/>
      <input type="submit" value="Register"/>
        <br><br>
      <a href="loginPage"><h3>Login Here</h3></a><br/><br/>
    </form>
</body>
</html>