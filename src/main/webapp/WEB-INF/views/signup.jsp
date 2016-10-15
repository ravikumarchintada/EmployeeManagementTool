<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Party Fund Management Tool</title>
<link href="resources/css/pfmt.css" rel="stylesheet" media="screen">
<link href="resources/css/jquery-ui.css" rel="stylesheet">
<script src="resources/js/jquery-1.10.2.js"></script>
<script src="resources/js/jquery-ui.js"></script>
<script src="resources/js/pfmt.js"></script>
<style>
body {
	/* background: url(img/bg.png) center; */
	margin: 0 auto;
	width: 960px;
	padding-top: 50px
}

.footer {
	margin-top: 50px;
	text-align: center;
	color: #666;
	font: bold 14px Arial
}

.footer a {
	color: #999;
	text-decoration: none
}

.login-form {
	margin: 50px auto;
}
</style>
<meta name="robots" content="noindex,follow" />
</head>

<body>
	<!-- <img src="img/title.png" alt="title"> -->
	<div class="login-form">
		<h1>Sign Up</h1>
		<springForm:form method="POST" commandName="signup" action="signup.do">
			<input type="text" name="userName" placeholder="username">
			<input type="password" name="password" placeholder="password">
			<input type="text" name="email" placeholder="email">
			<input type="text" name="mobileNo" placeholder="mobileNo">
			<input type="text" name="dob" placeholder="dob" id="datepicker">
			<span>
				<input type="checkbox" name="checkbox">
				<label for="checkbox">remember</label>
			</span>
			<input type="submit" value="Sign up">
		</springForm:form>
	</div>
	<div class="footer">
		<p>
			By <a href="#">Ravikumar Chintada</a>.
		</p>
	</div>

</body>
</html>