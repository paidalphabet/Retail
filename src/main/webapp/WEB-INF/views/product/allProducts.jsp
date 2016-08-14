<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all">
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
	<title>Store</title>
</head>
<body>
<div class="header">
			<div class="header-grid">
					<div class="container">
				<div class="header-left animated wow fadeInLeft animated" data-wow-delay=".5s" style="visibility: visible; animation-delay: 0.5s; animation-name: fadeInLeft;">
					<ul>
					<li><i class="glyphicon glyphicon-headphones"></i><a href="#">24x7 live support</a></li>
						<li><i class="glyphicon glyphicon-envelope"></i><a href="mailto:info@example.com">@example.com</a></li>
						<li><i class="glyphicon glyphicon-earphone"></i>+1234 567 892</li>
						
					</ul>
				</div>
				<div class="header-right animated wow fadeInRight animated" data-wow-delay=".5s" style="visibility: visible; animation-delay: 0.5s; animation-name: fadeInRight;">
				<div class="header-right1 ">
					<ul>
		
						<li><i class="glyphicon glyphicon-log-in"></i><a href="login.html">Login</a></li>
						<li><i class="glyphicon glyphicon-book"></i><a href="register.html">Register</a></li>
					</ul>
				</div>
				<div class="header-right2">
					<div class="cart box_1">
						<a href="checkout.html">
							<h3> <div class="total">
								<span class="simpleCart_total">$0.00</span> (<span id="simpleCart_quantity" class="simpleCart_quantity">0</span> items)</div>
								<img src="images/cart.png" alt="">
							</h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
						<div class="clearfix"> </div>
					</div>	
				</div>
				<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>
			</div>
			<div class="container">
			<div class="logo-nav">
				
					<nav class="navbar navbar-default">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header nav_2">
						<button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>

					
					</div> 
					<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
						<ul class="nav navbar-nav">
							<li><a href="index.html" class="act">Home</a></li>	
							<!-- Mega Menu -->
							<li class="dropdown active">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">Women <b class="caret"></b></a>
								<ul class="dropdown-menu multi">
									<div class="row">
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<h6>Submenu1</h6>
												
												<li><a href="products.html">Accessories</a></li>
												<li><a href="products.html">Bags</a></li>
												<li><a href="products.html">Caps &amp; Hats</a></li>
												<li><a href="products.html">Hoodies &amp; Sweatshirts</a></li>
										
											</ul>
										</div>
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<h6>Submenu2</h6>
												<li><a href="products.html">Jackets &amp; Coats</a></li>
												<li><a href="products.html">Jeans</a></li>
												<li><a href="products.html">Jewellery</a></li>
												<li><a href="products.html">Jumpers &amp; Cardigans</a></li>
												<li><a href="products.html">Leather Jackets</a></li>
												<li><a href="products.html">Long Sleeve T-Shirts</a></li>

											</ul>
										</div>
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<h6>Submenu3</h6>
												<li><a href="products.html">Shirts</a></li>
												<li><a href="products.html">Shoes, Boots &amp; Trainers</a></li>
												<li><a href="products.html">Sunglasses</a></li>
												<li><a href="products.html">Sweatpants</a></li>
												<li><a href="products.html">Swimwear</a></li>
												<li><a href="products.html">Trousers &amp; Chinos</a></li>

											</ul>
										</div>
										<div class="clearfix"></div>
									</div>
									<div class="row-top">
										<div class="col-sm-6 row1">
											<a href="products.html"><img src="images/me.jpg" alt="" class="img-responsive"></a>
										</div>
										<div class=" col-sm-6 row2">
											<a href="products.html"><img src="images/me1.jpg" alt="" class="img-responsive"></a>
										</div>
										<div class="clearfix"></div>
									</div>
								</ul>
							</li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">Men <b class="caret"></b></a>
								<ul class="dropdown-menu multi multi1">
									<div class="row">
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<h6>Submenu1</h6>
												
												<li><a href="products1.html">Accessories</a></li>
												<li><a href="products1.html">Bags</a></li>
												<li><a href="products1.html">Caps &amp; Hats</a></li>
												<li><a href="products1.html">Hoodies &amp; Sweatshirts</a></li>
										
											</ul>
										</div>
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<h6>Submenu2</h6>
												<li><a href="products1.html">Jackets &amp; Coats</a></li>
												<li><a href="products1.html">Jeans</a></li>
												<li><a href="products1.html">Jewellery</a></li>
												<li><a href="products1.html">Jumpers &amp; Cardigans</a></li>
												<li><a href="products1.html">Leather Jackets</a></li>
												<li><a href="products1.html">Long Sleeve T-Shirts</a></li>

											</ul>
										</div>
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<h6>Submenu3</h6>
												<li><a href="products1.html">Shirts</a></li>
												<li><a href="products1.html">Shoes, Boots &amp; Trainers</a></li>
												<li><a href="products1.html">Sunglasses</a></li>
												<li><a href="products1.html">Sweatpants</a></li>
												<li><a href="products1.html">Swimwear</a></li>
												<li><a href="products1.html">Trousers &amp; Chinos</a></li>

											</ul>
										</div>
										<div class="clearfix"></div>
									</div>
									<div class="row-top">
										<div class="col-sm-6 row1">
											<a href="products1.html"><img src="images/me2.jpg" alt="" class="img-responsive"></a>
										</div>
										<div class=" col-sm-6 row2">
											<a href="products1.html"><img src="images/me3.jpg" alt="" class="img-responsive"></a>
										</div>
										<div class="clearfix"></div>
									</div>
								</ul>
							</li>
							
							<li><a href="codes.html"> Codes</a></li>
							<li><a href="contact.html">Contact Us</a></li>
						</ul>
					</div>
					</nav>
				</div>
				
		</div>
	</div>

	<div class="col-md-9 animated wow fadeInRight animated" data-wow-delay=".5s" style="visibility: visible; animation-delay: 0.5s; animation-name: fadeInRight;">
		<div class="mid-popular">
			<c:if test="${not empty products}">

					<c:forEach var="product" items="${products}">
						<div class="col-sm-4 item-grid item-gr  simpleCart_shelfItem">
							<div class="grid-pro">
								<div class="grid-product">
									<figure>
										<div class="grid-img">
											<img src="${product.thumbNail1}" class="img-responsive" alt="${product.productName}">
										</div>
									</figure>
									<input type="hidden" value="${product.productID}"/>
									<div>${product.productDisplayName}</div>
									<div>${product.productSellingPrice}</div>
									<a href="javascript:void(0)" onclick="addToCart(${product.productID},1,'${product.productName}',${product.productSellingPrice},'${product.thumbNail1}')"
									       data-text="Add To Cart" class="but-hover1 item_add">Add To Cart</a>
								</div>
							</div>
						</div>
					</c:forEach>				
			</c:if>
		</div>
	</div>
</body>
</html>
