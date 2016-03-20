/**
 * Login related js code.
 */

/**
 * submit form code. 
 */
function submitForm(){
	var loginID = document.getElementByID("loginID");
	var password = document.getElementById("password");
	if ((loginID != null && login.trim() > 0) && (password != null && password.trim > 0)){
		document.getElementById("loginForm").submit();
	}else{
		alert("Please enter data in all the fields");
	}
}