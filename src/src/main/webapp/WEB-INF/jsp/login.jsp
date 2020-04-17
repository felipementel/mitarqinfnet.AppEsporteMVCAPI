<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Loja de venda - Login</title>
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
	<div class="container-fluid">
		<font color="red">${msg}</font>
		<div class="row">
			<div class="col-sm-4"></div>
			<div class="col-sm-4">
				<h1>Loja de venda de material esportivo</h1>
				<p>Encontre tudo o que precisa para seu esporte favorito</p>
			</div>
			<div class="col-sm-4"></div>
		</div>
		<br> <br>
		<form action="/login" method="post">
			<div class="row">
				<div class="col-sm-4"></div>
				<div class="col-sm-4">
					<span><input type="text" name="login" placeholder="Login" required><br />
					</span><span><input type="password" name="senha"
						placeholder="Senha" required><br /> </span><br><br><span><input
						type="submit" value="Acessar" class="btn btn-success"></span>
				</div>
				<div class="col-sm-4"></div>
			</div>
		</form>
	</div>
</body>
</html>