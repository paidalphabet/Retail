<html>
<head>
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all">
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<title><fmt:message key="com.rtms.admin.title" /></title>
</head>
<body>
	<section>
		<div class="header row-top">
			<div class="wrapper pull-right">
				<div class="row">
					<form name="loginForm" method="post" action="login"		onsubmit="javascript:submitForm()">
						<div class="row">
							<div class="form-group">
								<label><fmt:message key="com.rtms.login.loginID" /></label>
								<input type="text" class="login-mail form-control" name="loginID" id="loginID" />
							</div>
						</div>
						<div class="row">
							<div class="form-group">
								<label><fmt:message key="com.rtms.login.password" /></label>
								<input type="password" class="login-mail form-control" name="password"  id="password" />
								<input type="submit" name="submit" value="Login" class="btn" />
							</div>
						</div>
				</form>
			</div>
		</div>
		</div>
	</section>
</body>
</html>

