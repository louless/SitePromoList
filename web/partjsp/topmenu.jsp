<%-- 
    Document   : topmenu
    Created on : 15.01.2016, 14:38:57
    Author     : VGLukin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/styles/style.css" type="text/css" rel="stylesheet">
        
    </head>
    <body> 
        <div class="mainframe">
        <ul id="topmenu">
                <li> <a href="${pageContext.request.contextPath}/jsps/index.jsp">Главная</a> </li>
                <li> <a href="${pageContext.request.contextPath}/jsps/news.jsp">Новости</a> </li>
                <li> <a href="${pageContext.request.contextPath}/jsps/aboutUs.jsp">О нас</a> </li>
        </ul>
        </div>        
    </body>
</html>
