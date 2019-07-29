<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>

<h1 class="title2">Input Mileage (MPG) and amount of fuel (Gallons) left in tank.</h1>

 	<form action="/mileage-result">
	<p> Mileage(MPG):<input type="number" step= .01 name = "mpg"/> </p>
	<p> Gallons in tank:<input type="number" step = .01 name = "gallons" /> </p>
	<p> <button type="submit"> Calculate Range </button> </p>
	</form>
	
	<a href="/">Home</a>

</body>
</html>