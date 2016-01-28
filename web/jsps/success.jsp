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
            <%@include file="../partjsp/topmenu.jsp" %>        
            </br>
            </br>
           
                <a href="${pageContext.request.contextPath}/jsps/admin.jsp">Администратор</a>
            






            <%@include file="../partjsp/bottom.jsp"%> 
        </div>
    </body>
</html>
