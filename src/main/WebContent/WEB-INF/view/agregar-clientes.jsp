<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Ingresa Clientes</h1>
	
		<form:form action="add" modelAttribute="cliente" method="POST">
	
		<form:hidden path="idCliente"/>
		
		Cédula
		<form:input path="cedula" type="text" id="cedula" name="cedula" maxlength="10"/>
		<br></br>
		
		Nombres
		<form:input path="nombre" type="text" id="nombre" name="nombre" maxlength="20"/>
		<br></br>
		
		Apellidos
		<form:input path="apellido" type="text" id="apellido" name="apellido" maxlength="20"/>
		<br></br>
		
		
		Correo
		<form:input path="correo" type="mail" id="correo" name="correo" maxlength="40"/>
		<br></br>
		
		Clave
		<form:input path="clave" type="clave" id="clave" name="clave" maxlength="40"/>
		<br></br>
		
		<button type="submit" id="btnGuardar" >Guardar</button>
		<button type="buttom" id="btnCancelar" onclicK="window.location.href='/spring-crud-web/clientes'; return false;">Cancelar</button>
		
	</form:form>	
	

</body>
</html>