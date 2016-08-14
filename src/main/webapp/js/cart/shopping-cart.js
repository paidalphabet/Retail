/**
 * cart 
 */
function Cart(){
	this.orderItems = [];
}

Cart.prototype.getOrderItems = function(){
	return this.orderItems;
}

Cart.prototype.addOrderItem = function(anOrderItem){
	return this.orderItems.push(anOrderItem);
}

/**
 * Order Item
 */
function OrderItem(aProductID, aQuantity, aProductName, theAmount, aThumbNail){
	this.productID = aProductID;
	this.quantity = aQuantity;
	this.productName = aProductName;
	this.amount = theAmount;
	this.thumbNail = aThumbNail;
}

OrderItem.prototype.getProductID = function(){
	return this.productID;
}

OrderItem.prototype.setProductID = function(aProductID){
	this.productID = aProductID;
}

OrderItem.prototype.getQuantity = function(){
	return this.quantity;
}

OrderItem.prototype.setQuantity = function(aQuantity){
	this.quantity = aQuantity;
}

OrderItem.prototype.getProductName = function(){
	return this.productName;
}

OrderItem.prototype.setProductName = function(aProductName){
	this.productName = aProductName;
}

OrderItem.prototype.getAmount = function(){
	return this.amount;
}

OrderItem.prototype.setAmount = function(theAmount){
	this.amount = theAmount;
}

OrderItem.prototype.getThumbNail = function(){
	return this.thumbNail;
}

OrderItem.prototype.setThumbNail = function(aThumbNail){
	this.thumbNail = aThumbNail;
}

function addToCart(productID, quantity, productName, amount, thumbNail){
	if (typeof(Storage) !== "undefined") {
		var orderItem = new OrderItem(productID, quantity, productName, amount, thumbNail);
		var cart = localStorage.getItem("cart");
		if(cart == null){
			cart = new Cart();
		}
		cart.addOrderItem(orderItem);
		localStorage.setItem("cart", cart);
	}
}