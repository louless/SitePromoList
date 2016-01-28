<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : center
    Created on : 21.01.2016, 16:26:30
    Author     : VGLukin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<sql:query var="sites" dataSource="jdbc/userdb">
    SELECT idsite, url from sitelist
</sql:query> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Список сайтов</h1> 


        <sql:query var="result" scope="session" dataSource="jdbc/userdb">
            SELECT idsite, url, namesite FROM sitelist where idrubric = ${param.idrubric}
        </sql:query>

        <table>
            <!--column headers--> 
            <!--            <tr>
            <c:forEach var="columnName" items="${result.columnNames}">
                <th><c:out value="${columnName}"/></th>
            </c:forEach>
            </tr>-->
            <!--column data--> 
            <c:forEach var="row" items="${result.rows}">
                <tr>         
                    <td> <a href="http://<c:out value="${row.url}" default="#"/>" > <c:out value="${row.namesite}" /> </a> </td>
                </tr>
            </c:forEach>
        </table>


    </body>
</html>
