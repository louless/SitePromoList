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
        <div class="style-table">
               <s:form name="login" action="login">
                            <s:submit value="Войти"/>
                        </s:form>
        <table>
            <thead>
                <tr>
                    <td>
                        <h1>МЕНЮ</h1>   
                    </td>
                    <td> 
                        <h1>Содержание</h1>                   
                    </td>
                    <td> 
                        <h1>Реклама</h1>                   
                    </td>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>       </td>
                    <td> </td>
                    <td>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td>
             <%--        ${pageContext.request.contextPath}/jsps/testDB.jsp--%>
                        <s:form name="testDataBase" action="/jsps/testDB.jsp">
                            <s:submit value="тест соединения БД"/>
                        </s:form>
                    </td>
                </tr>                
   
            </tbody>

        </table>
        </div>
    <td>
        <div class="style-text-center">         
            <p>Контакты:<br><a href="mailto:lvg135@yandex.ru">lvg135@yandex.ru</a>
            <p/> <br> 2016

        </div>     
    </td>





</body>
</html>
