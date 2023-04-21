<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
	<h1>Usuarios</h1>
	<div style="align-content: center;">
	<button onclicK="window.location.href='/spring-crud-web/clientes/frmAdd'; return false;">Agregar</button>
	<button onclicK="window.location.href='/spring-crud-web/clientes/findOne'; return false;">Buscar</button>
	<button type="buttom" onclicK="window.location.href='/spring-crud-web'; return false;">Salir</button>
	</div>
	
	<table border="1"> 
		<thead>
			<tr>
				<th>id Usuario</th>
				<th>Cedula</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Correo</th>
				<th>Clave</th>
				<th>Editar</th>
				<th>Eliminar</th>
			</tr>
		</thead>
		<tbody>
		
		<c:forEach var="item" items="${keyClientes}" >
		 	<tr>
				<td>${item.idCliente}</td>
				<td>${item.cedula}</td>
				<td>${item.nombre}</td>
				<td>${item.apellido}</td>
				<td>${item.correo}</td>
				<td>${item.clave}</td>
				<td>
					<button><a href="${pageContext.request.contextPath}/clientes/findOne?idCliente=${item.idCliente}&opcion=1">Editar</a></button>
				</td>
				<td>
					<button><a href="${pageContext.request.contextPath}/clientes/findOne?idCliente=${item.idCliente}&opcion=2">Eliminar</a></button>	
				</td>
				
			</tr>
		 </c:forEach>
			
		</tbody>
	
	</table>

</body> 
</html>