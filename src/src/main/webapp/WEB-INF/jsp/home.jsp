<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Loja de venda de material esportivo</title>
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

	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<h4>Olá, ${user}!!!</h4>
		</div>
		<div class="col-sm-4"></div>
	</div>
	
	<p class="bg-warning">
		<a href="/clientelista">Lista de clientes</a>
	</p>
	<p class="bg-warning">
		<a href="/cliente/cadastro">Cadastro de clientes</a>
	</p>
	<br><br>
	<p class="bg-success">
		<a href="/produtos/bicicleta/lista">Lista de Bicicletas</a>
	</p>
	<p class="bg-success">
		<a href="/produtos/skate/lista">Lista de Skates</a>
	</p>
	</p>
	<p class="bg-success">
		<a href="/produtos/bodyboard/lista">Lista de Pranchas de Bodyboard</a>
	</p>
		<br>
	<br>
	<p class="bg-info">
		<a href="/venda/lista">Lista de vendas</a>
	</p>
	<p class="bg-info">
		<a href="/venda/vender">Vender produtos</a>
	</p>
</body>
</html>