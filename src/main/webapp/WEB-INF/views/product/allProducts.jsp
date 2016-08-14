<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Store</title>
</head>
<body>

	<c:if test="${not empty products}">

		<ul>
			<c:forEach var="product" items="${products}">
				<input type="hidden" value="${product.productID}"/>
				<li>${product.productName}</li>
				<li>${product.productSellingPrice}</li>
			</c:forEach>
		</ul>

	</c:if>

</body>
</html>
