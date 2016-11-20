<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>

<head>
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Login</title>
<!-- Custom Theme files -->
<link href="../../resources/css/login.css" rel="stylesheet" type="text/css" media="screen" />

</head>
<body>
	<div class="login">
		<h2>Yanjun Wang's Blog</h2>
		<div class="login-top">
			<h1>LOGIN FORM</h1>
			<form>
				<input type="text" value="User Id" onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'User Id';}"> <input
					type="password" value="password" onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'password';}">
			</form>
			<div class="forgot">
				<a href="#">forgot Password</a> <input type="submit" value="Login">
			</div>
		</div>
		<div class="login-bottom">
			<h3>
				New User &nbsp;<a href="#">Register</a>&nbsp Here
			</h3>
		</div>
	</div>
	<div class="copyright">

		<p>Copyright &copy; 2011-2016 www.yanjun-wang.com All rights
			reserved.</p>
	</div>


</body>
</html>