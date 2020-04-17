<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<form action="/produtos/bicicleta/cadastro" method="post">
		<br>
		<div class="row">
			<div class="col-sm-4"></div>
			<div class="col-sm-4">
				<h2>Cadastro de bicicletas</h2>
			</div>
			<div class="col-sm-4"></div>
		</div>
		<br> <br>
		<div class="row">
			<div class="col-sm-4"></div>
			<div class="col-sm-4">
				<span><input type="text" name="descricao" maxlength="200"
					class="form-control" placeholder="Descrição" required></span><br>
				<span><input type="text" name="cor" maxlength="200"
					class="form-control" placeholder="Cor" required></span><br> <span><input
					type="" name="tamanhoaro" class="form-control"
					placeholder="Tamanho Aro" maxlength="4" required></span><br>
				<span><input type="number" name="tamanhoquadro" maxlength="3"
					class="form-control" placeholder="Tamanho Quadro" required></span><br>
				<span><input type="text" name="preco" maxlength="10"
					class="form-control" placeholder="Preço" required></span> <br>
				<br> <span><input type="submit" value="Cadastrar"
					class="btn btn-primary"></span><br>
			</div>
			<div class="col-sm-4"></div>
		</div>
	</form>
	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<form action="/home" method="post">
				<input type="submit" value="Home" class="btn btn-warning"><br>
			</form>
		</div>
		<div class="col-sm-4"></div>
	</div>
</body>
</html>