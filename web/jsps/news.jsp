<%-- 
    Document   : index
    Created on : 14.01.2016, 9:00:06
    Author     : VGLukin
--%>
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



            <p> Сайт создан в январе 2016 года и продолжает обновляться по настоящее время.</br>
            <p> По всем вопросам обращаться lvg135@yandex.ru.





            <%@include file="../partjsp/bottom.jsp"%>  
        </div>
    </body>
</html>
