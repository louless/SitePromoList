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
        <s:form name="LoginForm" action="LoginForm" method="doLogin">
            <table border="0" cellspacing="2" >
                <thead>
                    <tr >Введите свои данные </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Введите имя пользователя:</td>
                        <td>
                            <input type="text" name="userLogin" value="" </input> 
                        </td>
                    </tr>
                    <tr>
                        <td>Введите пароль:</td>
                        <td>
                            <input type="password" name="userPass" value="" </input> 
                        </td>
                    </tr>
                </tbody>
            </table>
            123123
            <s:property value="error"/>
            <input type="submit" value="OK" name="OK" </input>
        </s:form>
    </body>
</html>
