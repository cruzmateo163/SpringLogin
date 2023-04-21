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
	<h1>Clientes</h1>

	<form:form action="del" modelAttribute="cliente" method="GET">
		<form:hidden path="idCliente"/>
		
		<strong>¿Desea eliminar el registro?</strong>
		<button type="submit">Eliminar</button>
		<button type="buttom" id="btnCancelar" onclicK="window.location.href='/spring-crud-web/clientes'; return false;">Cancelar</button>
		
	</form:form>

</body>
</html>