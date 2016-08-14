<html>
<head>
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all">
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
	<title>Admin</title>
</head>
<body>
        <form name="loginForm" method="post" action="login" onsubmit="javascript:submitForm()">
	          <div id="login">
	            <label>Login ID:</label>
	            <input type="text" name="loginID" class="input" id ="loginID" />
	            <div class="clear"></div>
	            <label>Password:</label>
	            <input type="password" name="password"  class="input" id="password" />
	            <input type="submit" name="submit" value="Login" class="submit" />
	            <div class="clear"></div>
	          </div>
          </form>
</body>
</html>
