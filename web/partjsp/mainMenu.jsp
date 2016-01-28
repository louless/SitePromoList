<%-- 
    Document   : mainMenu
    Created on : 20.01.2016, 16:04:04
    Author     : VGLukin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <script type="text/javascript" src="../lib/jquery.js"></script>
    </head>
    <body>
        <!--<form id="mainMenuForm">-->
        <ul id="mainmenu"> 
            <li id="sport" value="1"> <a href="#"> Спорт         </a></li>
            <li> <a href="#"> Магазины      </a></li>
            <li id="idrubric" value="2"> <a href="#"> Кино          </a></li>
            <li> <a href="#"> Искусство     </a></li>
            <li> <a href="#"> Хай-тек       </a></li>
            <li> <a href="#"> Наука         </a></li>
            <li> <a href="#"> Юмор          </a></li>
            <li> <a href="#"> Политика      </a></li>
            <li> <a href="#"> Музыка        </a></li>
            <li> <a href="#"> Авто и мото   </a></li>
            <li> <a href="#"> Информатика   </a></li>
            <li> <a href="#"> Мода          </a></li>
            <li> <a href="#"> Красота       </a></li>
            <li> <a href="#"> Природа       </a></li>
            <li> <a href="#"> История       </a></li>
        </ul> 
        <!--        </form>-->

        <script type="text/javascript">
            $(document).ready(function () {
                $('li').click(function () {
                    $.ajax({
                        type: 'POST',
                        url: "../partjsp/center.jsp",
                        data: "idrubric=" +$(this).val(),
                        success: function (html) {
                            $("#content_center").html(html);
                        }
                    });
                    return false;
                });
            });
        </script>


    </body>
</html>
