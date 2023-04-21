<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>LOGIN</h1>
	 INGRESE SU CEDULA COMO USUARIO Y SU CLAVE RESPECTIVA
	
 	 <form action="login" method="post">
		<label for="usuario">Username:</label>
		<input type="text" id="usuario" name="usuario" placeholder="USUARIO"><br>
		<label for="contrasena">Password:</label>
		<input type="text" id="contrasena" name="contrasena" placeholder = "CONTRASEÑA"><br>
		
		<input type="submit" value="Login">
	</form> 
	
	<hr>
	
	<p>  </p>
	
</body>
</html>