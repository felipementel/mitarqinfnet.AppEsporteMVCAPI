<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Loja de venda</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<br>
	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<h2>Lista de Skates</h2>
		</div>
		<div class="col-sm-4"></div>
	</div>
	<br>
	<br>	
	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<p class="bg-warning">
				<c:forEach var="skate" items="${skates}">
					<h4>
						${skate} <br> <a href="/produtos/skate/excluir/${skate.id}">Excluir</a>
					</h4>
				</c:forEach>
			</p>
		</div>
		<div class="col-sm-4"></div>
	</div>
	<p class="bg-success">
		<a href="/produtos/skate/cadastro">Cadastro de Skate</a>
	</p>

	<br>
	<form action="/home" method="post">
		<input type="submit" value="Home" class="btn btn-warning"><br>
	</form>
</body>
</html>