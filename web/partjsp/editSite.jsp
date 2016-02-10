<%-- 
    Document   : editSite
    Created on : 09.02.2016, 15:44:58
    Author     : VGLukin
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>        
        <s:form action="delSite">
            <table> 
                <tbody> 
                    <tr>
                        <td>
                            <select name="idSite" >
                                <c:forEach var="site" items="${sites}" >
                                    <option value="<c:out value="${site.idSite}"/>"><c:out value="${site.nameSite}"/> </option>
                                </c:forEach>   
                            </select>
                        </td>
                        <td>
                            <s:submit value="Удалить"></s:submit>             
                        </td>
                        </tr>
                    </tbody>
                </table>
        </s:form>





    </body>
</html>
