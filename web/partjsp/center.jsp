<%@page import="java.util.List"%>
<%@page import="Model.Site"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : center
    Created on : 21.01.2016, 16:26:30
    Author     : VGLukin
--%>

<!--центральная часть страницы для index.jsp - тут определяется список сайтов на выбранный пункт левого меню-->

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
        <link href="${pageContext.request.contextPath}/styles/style.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <sql:query var="result" scope="session" dataSource="jdbc/userdb"> 
            SELECT idsite, url, namesite FROM sitelist where idrubric = ${param.idrubric}
        </sql:query>

        <!--<p>Check</p>-->
        <div class="center">
            <table>
                <c:forEach var="row" items="${result.rows}">
                    <tr>     
                        <td> <img src="returnImage?idsite=${row.idsite}" />        
                        </td>
                        <td> <a href="http://<c:out value="${row.url}" default="#"/>" > <c:out value="${row.namesite}"/> </a> </td>
                    </tr>
                </c:forEach>
            </table>

            <%
                List<Site> sites1 = (List<Site>) request.getAttribute("sites");
                if (sites1 != null) {
                    for (Site site : sites1) {
                        out.println("<br/>" + site.getUrl());
                    }
                }
            %>


            <table>
                <c:forEach var="site" items="${sites1}">
                    <tr>     
                        <td> <a href="http://<c:out value="${site.url}" default="#"/>" > <c:out value="${site.namesite}"/> </a> </td>
                    </tr>
                </c:forEach>
            </table>



        </div>


    </body>
</html>
