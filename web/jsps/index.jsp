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
            <jsp:include page="../partjsp/topmenu.jsp" />

            <div class="text-right">
                <a href="${pageContext.request.contextPath}/jsps/testDB.jsp" >Тест соединения</a>    
                <a href="${pageContext.request.contextPath}/jsps/login.jsp" >Войти</a> 
            </div>  

            <p>  <jsp:text> На этом ресурсе можно узнать самые популярные 
                    сайты в интернете, разбитые по категориям для удобства
                </jsp:text>
            </p>    

            <div class="style-table">                        
                <table>
                    <!--                    <thead>
                    
                                        </thead>-->
                    <tbody>
                        <!--                        <tr>
                                                    <td> 
                        
                                                        <img src="${pageContext.request.contextPath}/images/promo1.bmp" width="350" height="200"/> 
                                                    </td>
                                                    <td> 
                                                        <img src="${pageContext.request.contextPath}/images/promo1.bmp" width="350" height="200"/>        
                                                    </td>
                                                    <td>
                                                        <img src="${pageContext.request.contextPath}/images/promo1.bmp" width="350" height="200"/>        
                                                    </td>
                                                </tr> -->
                        <tr>
                            <td>  <h1>Главное меню</h1>  </td>
                            <td>   <h1>Содержание</h1>  </td>
                            <td>  <h1>Реклама</h1>  </td>
                        </tr>
                    </tbody>                    
                </table>

            </div>

            <div class="promo-box-left">
                <img src="${pageContext.request.contextPath}/images/promo1.bmp" />                     
            </div>

            <ul id="mainmenu"> 
                <li> <a href="#"> Спорт     </a></li>
                <li> <a href="#"> Магазины  </a></li>
                <li> <a href="#"> Кино      </a></li>
            </ul> 


            <div class="promo-box-right">
                <img src="${pageContext.request.contextPath}/images/promo1.bmp" />
                <br/>
                <img src="${pageContext.request.contextPath}/images/promo1.bmp" />
            </div>

            <jsp:include page="../partjsp/bottom.jsp"/>    
        </div>
    </body>
</html>
