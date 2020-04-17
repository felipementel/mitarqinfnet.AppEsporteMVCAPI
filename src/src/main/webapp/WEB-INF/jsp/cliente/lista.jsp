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
			<h2>Lista de usuários</h2>
		</div>
		<div class="col-sm-4"></div>
	</div>
	<br>
	<br>
	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<p class="bg-warning">
				<c:forEach var="cliente" items="${clientelista}">
					<h4>
					ID: ${cliente.id} <br>
					Nome: ${cliente.nome} <br>
					Data de cadastro ${cliente.datacadastro} <br>
					DDD e Telefone (${cliente.ddd})-${cliente.telefone} <br>
					Email: ${cliente.email} <br>
					Ativo: ${cliente.isativo} <br>
					<a href="/cliente/excluir/${cliente.id}">Excluir</a>
					</h4>
				</c:forEach>
			</p>
		</div>
		<div class="col-sm-4"></div>
	</div>
	<p class="bg-success">
		<a href="/cliente/cadastro">Cadastro de clientes</a>
	</p>

	<form action="/home" method="post">
		<br> <input type="submit" value="Home" class="btn btn-warning"><br>
	</form>
</body>
</html>