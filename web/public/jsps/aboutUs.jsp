<%-- 
    Document   : index
    Created on : 14.01.2016, 9:00:06
    Author     : VGLukin
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/style.css">
        <title>Welcome for you!</title>
    </head>
    <body>
        <div class="mainframe">
            <jsp:include page="../partjsp/topmenu.jsp" />        


            <h1></h1>
            <p>Проект является помощником при поиске информации на определенную тематику. </p>
            <p>Часто при поиске в интернете часть сайтов, которые могут заинтересовать, остаются без внимания, </br>
                это может произойти по разным причинам, например, из-за повторов в выдаче поисковика. </p>
            <p>Удобное меню навигации по рубрикам поможет Вам найти отыскать необходимую информацию на просторах сети. </p>
<!--            <p>В планах создание индивидуального меню на каждого пользователя: </br>
            возможность добавлять любимые сайты в категории и удалять не интересующие </p>-->



            <%@include file="../partjsp/bottom.jsp"%>      
        </div>
    </body>
</html>
