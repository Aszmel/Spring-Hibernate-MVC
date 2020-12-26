<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Customer Form Registration</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<i>Fill out the form. (*) means required</i>
	<form:form action="processForm" modelAttribute="customer">
		<br>
		<br>
	First name: <form:input path="firstName" />
		<br>
		<br>
	Last name(*): <form:input path="lastName" />
		<br>
		<br>
	Free Pass: <form:input path="freePass" />
		<form:errors path="freePass" cssClass="error" />
		<br>
		<br>
	Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		<br>
		<br>
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>