<%-- 
    Document   : login
    Created on : 26.10.2015, 17:21:10
    Author     : VGLukin
--%>

<%@taglib prefix="s" uri="/struts-tags" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form name="LoginForm" action="LoginForm" method="post" >
            <table border="0" cellspacing="2" >
                <thead>
                    <tr >Введите свои данные </tr>
                </thead>
                <tbody>
                    <tr>
                            <s:textfield label="Введите имя пользователя:" key="userLogin"/> 
                            <%--<input type="text" name="userLogin" key="userLogin"</input> --%>
                    </tr>
                    <tr>
                            <s:password label="Введите пароль:" key="userPass"/>
<!--                            <input type="password" name="userPass" key="userPass"</input> -->
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="OK" name=" OK" </input>
        </s:form>
    <%--    <jsp:useBean class="MyClasses.CheckLogin" id="error" scope="request"/> --%>
    <s:property value="error"/>    
    </body>
</html>
