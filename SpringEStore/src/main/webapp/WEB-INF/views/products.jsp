<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List products</title>
</head>
<body>
	<table cellpadding= "2" cellspacing="2" border="1">
	    <tr>
			<th>Name</th>
			<th>Price</th>
			<th>Buy</th>
		</tr>
		<c:forEach var="p" items="${listProducts}">
			<tr>
				<td>${p.name}</td>
				<td>${p.price}</td>
				<td align="center"><a href= "${pageContext.request.contextPath}/ordernow/${p.id}">Order Now</a></td>
				
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>