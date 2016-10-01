<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page session="false" %>
<html>
<head>
	<title>Result Page</title>
</head>
<body>
<h3>
	SignUp Successfully.
</h3>

<strong>Your Name : ${signup.userName}</strong><br>
<strong>Your Email : ${signup.email}</strong><br>
<strong>Your Mobile No : ${signup.mobileNo}</strong><br>

</body>
</html>
