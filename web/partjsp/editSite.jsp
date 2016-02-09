<%-- 
    Document   : editSite
    Created on : 09.02.2016, 15:44:58
    Author     : VGLukin
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<sql:query var="sites" dataSource="jdbc/userdb" >
    SELECT idsite, url, namesite FROM sitelist where 
</sql:query> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <select multiple>
            
            
            
        </select>
        
    </body>
</html>
