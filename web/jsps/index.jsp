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
        <script type="text/javascript" src="../lib/jquery.js"></script>
        <title>Welcome for you!</title>
    </head>
    <body>        
        <div class="mainframe">
            <%@include file="../partjsp/topmenu.jsp" %>

            <div class="text-right">              
                <a href="${pageContext.request.contextPath}/jsps/testJQuery.jsp" >Тест JQuery</a> 
                <a href="${pageContext.request.contextPath}/jsps/testDB.jsp" >Тест соединения</a> 
                <a href="${pageContext.request.contextPath}/jsps/admin.jsp">Администратор</a>
                <a href="${pageContext.request.contextPath}/jsps/login.jsp" >Войти</a> 
            </div>  

            <p>  <jsp:text> У нас самые популярные 
                    сайты в интернете, разбитые по категориям для удобства на любой вкус!
                </jsp:text>
            </p>    


            <div class="promo-box-left">
                <img src="${pageContext.request.contextPath}/images/promo1.bmp" />                     
            </div>

            <%@include file="../partjsp/mainMenu.jsp"%>              
           
<!--            <div class="center"> 
                <p>  Список сайтов на определенную тему</p>
            </div>            -->

            </br>
            <div class="promo-box-right">
                <img src="${pageContext.request.contextPath}/images/promo1.bmp" />
            </div>            

            <!--ajax-->
            
            <div id="content_center"> </div>   

            <div class="clear-float"></div>

            <div class="promo-box-left">
                <img src="${pageContext.request.contextPath}/images/promo1.bmp" />                     
            </div>        



            <%@include file="../partjsp/bottom.jsp"%>           
        </div>

    </body>
</html>
