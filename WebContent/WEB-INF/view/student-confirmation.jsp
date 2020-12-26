<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>List of Registered Students</title>
</head>
<body>
	<h3>New student was registered: ${student.firstName}
		${student.lastName}, country: ${student.country}</h3>
	<h3>Favorite language is: ${student.favoriteLanguage}</h3>
	<h3>Operating systems:</h3>
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
		<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>