<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>News</title>
</head>
<body>
	<h1>U.S. News</h1>
	
	<table>
		<thead>
			<tr>
				<th>News Articles</th>
			</tr>
		</thead>
		<tbody>		
				<tr>
					<td><c:forEach var="article" items="${articles }">${article.getName() }<br />${article.getTitle() }<br />${article.getDescription() }<br /><a href="${article.getUrl() }">CLICK HERE FOR ARTICLE</a><br /><br /></c:forEach></td>
				</tr>
		</tbody>
	</table>
</body>
</html>