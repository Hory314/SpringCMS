<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Utworzono</th>
        <th>Zmodyfikowano</th>
        <th>Tytuł</th>
        <th>Treść</th>
        <th>Autorzy</th>
        <th>Kategorie</th>
    </tr>
    <c:forEach var="article" items="${articles}">
        <tr>
            <th>${article.id}</th>
            <th>${article.created}</th>
            <th>${article.updated}</th>
            <th>${article.title}</th>
            <th>${article.content}</th>
            <th>${article.author.firstName} ${article.author.lastName}</th>
            <th>
                <ul>
                    <c:forEach var="category" items="${article.categories}">
                        <li>${category.name}</li>
                    </c:forEach>
                </ul>
            </th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
