<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org" xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Login page</title>
<style>
.error {
	color: red;
}

.col-centered{
float: none;
margin: 0 auto;
}
	.login-form {
		width: 340px;
    	margin: 50px auto;
	}
    .login-form form {
    	margin-bottom: 15px;
        background: #f7f7f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
    .login-form h2 {
        margin: 0 0 15px;
    }
    .form-control, .btn {
        min-height: 38px;
        border-radius: 2px;
    }
    .btn {        
        font-size: 15px;
        font-weight: bold;
    }
</style>
</head>


<body style="background-color: #4b5257">



<div class="login-form">
	<h2 class="text-center">Log in</h2> 

	<form action="POST" method="post" modelAttribute="user">       
		       
	
		
		<div class="form-group">
		<p>
			<label for="username">Username</label>
			<input type="text" class="form-control" id="username" name="username"/>	
		</p>
		</div>
		
		<div class="form-group">
		<p>
			<label for="password">Password</label>
			<input type="password" class="form-control" id="password" name="password"/>	
		</p>
		</div>
        <div class="custom-checkbox">
        <label><input type="checkbox"> Remember me</label>
     	 </div>
     	 
		<input type="hidden"                        
			
		<button type="submit" class="btn-primary form-control">Log in</button>
	</form>	
</div>

</body>
</html>