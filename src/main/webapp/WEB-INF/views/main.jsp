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
        <th>Tytuł</th>
        <th>Treść</th>
        <th>Stworzono</th>
        <th>Uaktualniono</th>
        <th>Autor</th>
        <th>Categorie</th>
    </tr>
    <c:forEach var="article" items="${articles}">
        <tr>
            <td>${article.id}</td>
            <td>${article.title}</td>
            <td>${article.content}</td>
            <td>${article.created}</td>
            <td>${article.updated}</td>
            <td>${article.author.firstName} ${article.author.lastName}</td>
            <td>
                <%--<c:forEach var="category" items="${article.categories}">--%>
                    <%--${category.name}--%>
                <%--</c:forEach>--%>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
