
<%-- 
    Document   : testDB
    Created on : 06.01.2016, 11:56:34
    Author     : VGLukin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<sql:query var="users" dataSource="jdbc/userdb">
    SELECT iduser, username FROM userlist
</sql:query> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="${pageContext.request.contextPath}/styles/style.css" type="text/css" rel="stylesheet"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="mainframe">
            <%@include file="../partjsp/topmenu.jsp" %>  
            <h1>Hello World!</h1>

            <select name="FromCityID" key="FromCityID">
                <c:forEach var="row" items="${users.rows}">
                    <option value="${row.iduser}">${row.username}</option>
                </c:forEach>
            </select>

            <sql:query var="result" dataSource="jdbc/userdb">
                SELECT iduser, username FROM userlist
            </sql:query>

            <table border="1">
                <!-- column headers -->
                <tr>
                    <c:forEach var="columnName" items="${result.columnNames}">
                        <th><c:out value="${columnName}"/></th>
                        </c:forEach>
                </tr>
                <!-- column data -->
                <c:forEach var="row" items="${result.rowsByIndex}">
                    <tr>
                        <c:forEach var="column" items="${row}">
                            <td><c:out value="${column}"/></td>
                        </c:forEach>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </body>
</html>
