<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
	<head>
		<title>Customer Confirmation</title>
		<style>
			.error {
				color: red;
			}
		</style>
	</head>

	<body>
		<h3>The customer is confirmed </h3>
		<p>First Name: ${customer.firstName}</p> 
		<p>Last Name: ${customer.lastName}</p>
		<p>Free Passes: ${customer.freePasses}</p>
		<p>Postal Code: ${customer.postalCode}</p>
		
	</body>
</html>