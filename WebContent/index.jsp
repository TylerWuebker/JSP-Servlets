<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Earth to Mars Weight Converter!</title>
</head>
<body>
	<h1>Hello! Welcome to the Earth to Mars Weight Converter!</h1>
	<h1>Earth to Mars Weight</h1>
	<form action= "getWeightServlet" method= "post">
	Enter the weight in lbs whole number:
	<input type="text" name="EarthWeight" size="10">
	<input type="submit" value="CalculateWeight" />
	</form>
</body>
</html>