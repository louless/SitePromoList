<%-- 
    Document   : mainMenu
    Created on : 20.01.2016, 16:04:04
    Author     : VGLukin
--%>

<!--основное (левое) меню-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/siteList.js"></script>        
        <ul id="mainmenu"> 
            <li value="1">  <a href="#"> Спорт         </a></li>
            <li value="2">  <a href="#"> Кино          </a></li>
            <li value="3">  <a href="#"> Магазины      </a>
                <!--<img src="${pageContext.request.contextPath}/images/down.png" />-->
            </li> 
            <div class="mainmenusub">
                <li value="18"> <a href="#"> Бытовая техника </a></li>
                <li value="19"> <a href="#"> Косметика       </a></li>
                <li value="20"> <a href="#"> Электроника     </a></li>
                <li value="21"> <a href="#"> Украшения       </a></li>
            </div>

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
        </ul> 
    </body>
</html>
