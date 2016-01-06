<%-- 
    Document   : testDB
    Created on : 06.01.2016, 11:56:34
    Author     : VGLukin
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<sql:query var="users" dataSource="jdbc/M">
    SELECT iduser, username FROM userlist
</sql:query> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    <s:submit/>

    <select name="FromCityID" key="FromCityID">
        <c:forEach var="row" items="${users.rows}">
            <option value="${row.iduser}">${row.username}</option>
        </c:forEach>
    </select>

</body>
</html>
