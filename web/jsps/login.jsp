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
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/style.css">
        <title>Welcome to login</title>
    </head>
    <body>
        <s:form name="LoginForm" action="LoginForm" method="post" >
            <table border="0" cellspacing="2" >
                 <!--<div class="style-table">-->
                <thead >    
                    <tr>
                        <th>
                             Введите свои данные       
                        </th>
                    </tr>
                       
                </thead>
                 <!--</div>--> 
                <tbody>
                    <tr> 
                        <s:textfield label="Введите имя пользователя:" key="userLogin"/>              
                    </tr>
                    <tr>
                        <s:password label="Введите пароль:" key="userPass"/>           
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Войти" name="OK" </input> 
                        </td>
                    </tr>

                </tbody>
            </table>

        </s:form>

        <s:property value="error"/>           
    </body>
</html>
