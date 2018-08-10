<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type='text/javascript' src='js/script.js'></script>
<link rel="stylesheet" href="styles/loginFormStyle.css">
</head>
<body>
  <h2> Welcome to User Information System </h2> 
  <form id="loginForm" method="post" action="Login">
    <table>
      <tr>
        <td>UserName: </td>
        <td><input type="text" id="username" name="username"></td>
        <td><span id="username_error"></span></td>
      </tr>
       <tr>
        <td>Password: </td>
        <td><input type="password" id="password"  name="password"></td>
        <td><span id="password_error"></span></td>
      </tr>
       <tr>
        <td><a href="register.jsp">User Register</a></td>
        <td><input type="submit" name="login"></td>
      </tr>
    </table>
  </form>
</body>
</html>