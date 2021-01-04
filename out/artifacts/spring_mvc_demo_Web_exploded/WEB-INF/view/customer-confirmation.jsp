<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>List of Registered Customers</title>
</head>
<body>
	<h3>New customer was registered: ${customer.firstName}
		${customer.lastName}</h3>
	<h3>Free pass number is: ${customer.freePass}</h3>
	<h3>Postal code is: ${customer.postalCode}</h3>
	<h3>Course code was: ${customer.courseCode}</h3>
</body>
</html>