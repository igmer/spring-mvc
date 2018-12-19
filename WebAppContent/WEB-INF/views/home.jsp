<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="panel panel-default">
  <div class="panel-heading">Peliculas</div>
  <div class="panel-body">
	<table class="table table-striped table-bordered table-hover">
		<thead>
			<tr>
				<th>Id</th>
				<th>Titulo</th>
				<th>Duracion</th>
				<th>clasificacion</th>
				<th>Fecha Estreno</th>
				<th>Imageb</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${ peliculas}" var="pelicula">
			<tr><td> ${pelicula.id }</td>
				<td> ${pelicula.titulo }</td>
				<td> ${pelicula.duracion }</td>
				<td> ${pelicula.clasificacion }</td>
				<td> ${pelicula.fechaEstreno }</td>
				<td> ${pelicula.imagen }</td>
				
			</tr>
		
		</c:forEach>
			
		</tbody>

	</table>
	 </div>
</div>
	
</body>
</html>