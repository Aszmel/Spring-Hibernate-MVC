<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First Name: <form:input path="firstName" />
		<br><br>
	Last Name: <form:input path="lastName" />
		<br><br>
		Country:
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>	
			</form:select>
			<br><br>
		Favorite language:
		<form:radiobuttons path="favoriteLanguage" items="${student.languageOptions}"/>
		<br><br>
		Operating systems:
		Linux<form:checkbox path="operatingSystems" value="linux"/>
		Windows10<form:checkbox path="operatingSystems" value="windows10"/>
		MacOS<form:checkbox path="operatingSystems" value="macOS"/>
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>