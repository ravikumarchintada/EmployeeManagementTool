<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Please Sign Up</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>

	<springForm:form method="POST" commandName="signup" action="signup.do">
		<table>
			<tr>
				<td>Name :</td>
				<td><springForm:input path="userName" /></td>
				<td><springForm:errors path="userName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><springForm:input path="password" /></td>
				<td><springForm:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><springForm:input path="email" /></td>
				<td><springForm:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Mobile No :</td>
				<td><springForm:input path="mobileNo" /></td>
				<td><springForm:errors path="mobileNo" cssClass="error" /></td>
			</tr>
			<tr>
				<td>DOB :</td>
				<td><springForm:input path="dob" /></td>
				<td><springForm:errors path="dob" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="SignUp"></td>
			</tr>
		</table>

	</springForm:form>

</body>
</html>