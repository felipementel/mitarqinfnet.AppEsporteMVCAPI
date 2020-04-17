<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Loja de venda - Lista de Vendas</title>
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
			<h2>Lista de Vendas</h2>
		</div>
		<div class="col-sm-4"></div>
	</div>
	<br>
	<br>
	<c:set var="idcomprador" value="0" />

	<c:forEach var="venda" items="${listavendas}">
			<h4>${venda} <a href="/venda/excluir/${venda.id}">excluir</a> </h4>
	<br>
	<br>
		<%-- <c:choose>
			<c:when test="idcomprador == ${listavendas.cliente.id}">
				<h4>${listavendas.cliente}</h4>
				<h4>${listavendas}</h4>
			</c:when>
			<c:otherwise>
				<c:forEach var="compras" items="${venda.itensvenda}">
					<h4>${compras}</h4>
				</c:forEach>
				<c:set var="idcomprador" value="${listavendas.cliente.id}" />
			</c:otherwise>
		</c:choose> --%>
	</c:forEach>


	<%-- 	<c:forEach var="venda" items="${listavendas}">
		<h4>${listavendas.cliente}</h4>
		<h4>${listavendas}</h4>
		<c:forEach var="compras" items="${venda.itensvenda}">
			<h4>${compras}</h4>
		</c:forEach>
		<br>
		<br>
	</c:forEach> --%>
	<br>
	<br>
	<form action="/home" method="post">
		<br> <input type="submit" value="Home" class="btn btn-warning"><br>
	</form>
</body>
</html>