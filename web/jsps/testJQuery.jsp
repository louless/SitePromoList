<%-- 
    Document   : index
    Created on : 14.01.2016, 9:00:06
    Author     : VGLukin
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/style.css">
        <script type="text/javascript" src="../lib/jquery.js"></script>
        <title>Testing JQuery</title>
    </head>
    <body>
        <div class="mainframe">
            <%@include file="../partjsp/topmenu.jsp" %>        
            <script type="text/javascript">
                $(document).ready(function () {
//                    обработка при нажатии на текст в <h1>
                    $("h1").click(function () {
                        $(this).addClass("blue");
                    });
//                    обработка при нажатии на текст в <h2>
                    $("h2").click(function () {
                        $(this).addClass("blue").fadeOut("slow");
                    });
//                    обработка при нажатии на кнопку button1
                    $('#button1').click(function () {
                        $.ajax({
                            url: "../partjsp/center.jsp",
                            cache: false,
                            success: function (html) {
                                $("#MyContent").html(html);
                            }
                        });
                    });

                    $('#formPostName').submit(function () {
                        $.ajax({
                            type: 'POST',
                            url: "../partjsp/center.jsp",
                            data: "idname=" + $("#namePost").val() + "&idrubric=2",                           
                            success: function (html) {
                                $("#MyContent").html(html);
                            }
                        });
                        return false;
                    });
                });
            </script>

            <style type="text/css">
                .blue { color: blue;  }
                h1 { cursor: pointer; }
            </style>

            <h1>Синеющая проверка</h1>
            <h2>Исчезающая проверка</h2>

            <p>проверка на добавление данных с другой страницы</p>  
            <form>  
                <input id="button1" type="button" value="Страница в центр">   
                <!--<input id="button2" type="button" value="Страница в центр с динам. данными">-->  
            </form>  

            <div id="MyContent"></div>  

            <form id="formPostName" >
                <p>Введите имя</p>
                <input type="text" id="namePost" >
                <input type="submit" value="Попробовать">            
            </form>








            <%@include file="../partjsp/bottom.jsp"%>   
        </div>
    </body>
</html>
