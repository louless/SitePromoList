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
        <title>Sitez.site|Лучшие сайты</title>
    </head>
    <body>        
        <div class="mainframe">
            <%@include file="../partjsp/topmenu.jsp" %>

            <div class="right">
                <div class="right">   
                    <s:form action="testDB">
                        <s:submit value="Тест соединения"/>
                    </s:form>  
                </div> 
                <div class="right">       
                    <s:form action="testJQuery">
                        <s:submit value="Тест JQuery"/>
                    </s:form>
                </div>    
                <div class="right">       
                    <s:form action="validate">
                        <s:submit value="админ"/>
                    </s:form>
                </div> 
                <div class="clear-float"></div>
                <!--<a href="${pageContext.request.contextPath}/private/jsps/admin.jsp">прямой админ</a>--> 
            </div>

            <div class="promo-box-left">
                <img src="${pageContext.request.contextPath}/images/promo1.bmp" />                     
            </div>
            <h1>
                Самые популярные сайты в интернете, разбитые по категориям для удобства на любой вкус!
            </h1>                  
            <div class="clear-float-left"></div>
            <div class="promo-box-right">
                <img src="${pageContext.request.contextPath}/images/promo1.bmp" />
            </div>  

            <%@include file="../partjsp/mainMenu.jsp"%>    


            <div id="content_center" > </div> 
            <div class="clear-float-left"></div>


            <div class="promo-box-left">
                <img src="${pageContext.request.contextPath}/images/promo1.bmp" />                     
            </div>



            <div class="clear-float"></div>
            <%@include file="../partjsp/bottom.jsp"%>           
        </div>

        <script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/siteList.js"></script>  
    </body>
</html>
