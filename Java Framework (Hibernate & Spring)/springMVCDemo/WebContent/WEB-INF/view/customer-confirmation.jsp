<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
	<head>
		<title>Customer COnfirmation</title>
		<style>
			.error {
				color: red;
			}
		</style>
	</head>

	<body>
		The customer is confirmed: ${customer.firstName} ${customer.lastName}
	</body>
</html>