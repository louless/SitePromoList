<%-- 
    Document   : mainMenu
    Created on : 20.01.2016, 16:04:04
    Author     : VGLukin
--%>

<!--основное (левое) меню-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/siteList.js"></script>
    </head>
    <body>
        <!--<form action="siteList" >-->
        <ul id="mainmenu"> 
            <li value="1">  <a href="#"> Спорт         </a></li>
            <li value="2">  <a href="#"> Кино          </a></li>
            <li value="3">  <a href="#"> Магазины      </a></li>           
            <li value="4">  <a href="#"> Искусство     </a></li>
            <li value="5">  <a href="#"> Хай-тек       </a></li>
            <li value="6">  <a href="#"> Наука         </a></li>
            <li value="7">  <a href="#"> Юмор          </a></li>
            <li value="8">  <a href="#"> Политика      </a></li>
            <li value="9">  <a href="#"> Музыка        </a></li>
            <li value="10"> <a href="#"> Авто и мото   </a></li>
            <li value="11"> <a href="#"> Информатика   </a></li>
            <li value="12"> <a href="#"> Мода          </a></li>
            <li value="13"> <a href="#"> Красота       </a></li>
            <li value="14"> <a href="#"> Природа       </a></li>
            <li value="15"> <a href="#"> История       </a></li>
            <li value="16"> <a href="#"> Новости       </a></li>
            <li value="17"> <a href="#"> Недвижимость  </a></li>  
<!--            <li class='drop-link'><a href="#">Раздел 4</a>
                <ul class='drop-block'>
                    <li><a href="#">Раздел 4.1</a>
                    <li><a href="#">Раздел 4.2</a>
                    <li><a href="#">Раздел 4.3</a>
                    <li><a href="#">Раздел 4.4</a>
                    <li><a href="#">Раздел 4.5</a>
                </ul>
            </li>-->
        </ul> 

    </body>
</html>
