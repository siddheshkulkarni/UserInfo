<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Info</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type='text/javascript' src='js/registration.js'></script>
</head>
<body>
<h3>User Registration</h3>
<form id ="registrationForm"  action="Register" method="POST">
<table align="center" cellpadding = "10">
<tr>
<td>First Name*</td>
<td><input type="text" id="firstname" name="firstname" maxlength="30"/>
max 40 characters
</td>
<td><span id="firstname_error"></span></td>
</tr>
<tr>
<td>Last Name*</td>
<td><input type="text" id="lastname" name="lastname" maxlength="30"/>
max 40 characters
</td>
<td><span id="lastname_error"></span></td>
</tr>
<tr>
<td>Address*</td>
<td><input type="text" id="address" name="address" maxlength="30"/>
</td>
<td><span id="address_error"></span></td>
</tr>
<tr>
<td>Nationality</td>
<td><input type="text" id="nationality" name="nationality" maxlength="30"/>
</td>
<td></td>
</tr>
<tr>
<td>UserName*</td>
<td><input type="text" id="username" name="username" maxlength="100" /></td>
<td><span id="username_error"></span></td>
</tr>
<tr>
<td>Password*</td>
<td><input type="password" id="password" name="password" maxlength="100" /></td>
<td><span id="password_error"></span></td>
</tr>
<tr>
<td>Reenter Password*</td>
<td><input type="password" id="reenterpassword" name="reenterPassword" maxlength="100" /></td>
<td><span id="reenterpassword_error"></span></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" name = "submit" value="Submit">
<input type="reset" name="reset" value="Reset">
</td>
<td></td>
</tr>
</table>
</form>
</body>
</html>