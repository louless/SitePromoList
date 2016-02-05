<%-- 
    Document   : center
    Created on : 21.01.2016, 16:26:30
    Author     : VGLukin
--%>

<!--центральная часть страницы для index.jsp - тут определяется список сайтов на выбранный пункт левого меню-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/styles/style.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="center">

            
            <table>
                <c:forEach var="site" items="${sites}">
                    <tr>
                        <td>${site.imagePath}</td>
                        <td>${pageContext.request.contextPath}icons <c:out value="${site.idSite}"/>.jpg </td>
                        <td> <img src="${pageContext.request.contextPath}icons<c:out value="${site.idSite}.jpg" />"</td>
                        <td> <img src="<c:out value="${site.imagePath}"/>" />  </td>  
                        <td> <a href="http://<c:out value="${site.url}" default="#"/>" > <c:out value="${site.nameSite}"/> </a> (${site.idSite})</td>
                    </tr>
                </c:forEach>
            </table>  
            
            
            <img src="${pageContext.request.contextPath}/icons/44.jpg" />
            <img src="/icons/44.jpg" />   
            <img src="icons/44.jpg" /> 
            <img src="${pageContext.session.servletContext.contextPath}/icons/44.jpg" /> 
            <img src="${pageContext.session.servletContext.getRealPath("/")}/icons/44.jpg" /> 
       
            
        </div>

    </body>
</html>
