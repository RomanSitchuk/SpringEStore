<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart information</title>
</head>
<body>
	<table cellpadding= "2" cellspacing = "2" border="1">
	<tr>
		<th>Option</th>
		<th>Name</th>
		<th>Price</th>
		<th>Quantity</th>
		<th>Sub Total</th>
	</tr>
	
	<c:forEach var="order" items="${SessionScoped.cart}">
		<tr>
			<td align = "center">delete</td>
			<td>${order.product.name}</td>
			<td>${order.product.price}</td>
			<td>${order.product.name}</td>
			<td>${order.quantity}</td>
			<td>${order.product.price * order.quantity}</td>
		</tr>
	</c:forEach>
	
	</table>
</body>
</html>