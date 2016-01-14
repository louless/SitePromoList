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
        <h1>Hello World!</h1>



        <s:form name="login" action="login">
            <s:submit value="Войти"/>
        </s:form>
       ${pageContext.request.contextPath}/jsps/testDB.jsp
       <s:form name="testDataBase" action="/jsps/testDB.jsp">
       <s:submit value="тест соединения БД"/>
       </s:form>
     
    </body>
</html>
