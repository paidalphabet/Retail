<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
	    <title>Product Details</title>
	</head>
	<body>
	
	<h2>Product Details</h2>
	<form:form method="POST" action="product">
		<div>
			<form:hidden path="productID" id="productID"/>
		</div>
		<div>
			<label>Name : </label>
			<form:input path="productName" id="productName"/>
		</div>
		<div>
			<label>Display Name : </label>
			<form:input path="productDisplayName" id="productDisplayName"/>
		</div>
		<div>
			<label>Selling Price : </label>
			<form:input path="productSellingPrice" id="productSellingPrice"/>
		</div>
		<div>
			<label>Cost Price : </label>
			<form:input path="productCostPrice" id="productCostPrice"/>
		</div>
		<div>
			<label>Margin : </label>
			<form:input path="margin" id="margin"/>
		</div>
		<div>
			<input type="submit"/>
		</div>
	</form:form>
	</body>
</html>