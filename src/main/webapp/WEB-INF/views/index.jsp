<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<style>
	th {text-align: left;
	color: blue;}
	td {background-color: SteelBlue;}
</style>
</head>
<body>
	<h1>Index</h1>
	<a href="/news">News</a><br />
	<h2>Weather for <i>${dailyWeather.location }</i></h2>
	<table>
		<thead>
			<tr>
				<th>Time</th>
				<th>H/L</th>
				<th>Temp</th>
				<th>Weather</th>
			</tr>
		</thead>
		<tbody>
			
				<tr>
					<td><c:forEach var="day" items="${days }">${day }-<br /><br /></c:forEach></td>
					<td><c:forEach var="templabel" items="${templabels }">${templabel }-<br /><br /></c:forEach></td>
					<td><c:forEach var="temp" items="${temps }">${temp }<br /><br /></c:forEach></td>
					<td><c:forEach var="weather" items="${weathers }">${weather }<br /><br /></c:forEach></td>
				</tr>
		</tbody>
	</table>
	<br />
	<a href="/news">News</a>
</body>
</html>