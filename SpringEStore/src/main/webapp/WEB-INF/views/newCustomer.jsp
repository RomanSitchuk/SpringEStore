<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<p>Create new customer</p>
		<form action="showAllCustomers" method="post">
			Name<input type="text" name="name">
			E-mail<input type="text" name="email">
			Phone<input type="text" name="phone">
			City<input type="text" name="city">
			<button type="submit">Create customer</button>
		</form>
	</div>
	
</body>
</html>