/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $('#mainmenu li').click(function () {
        $.ajax({
            type: 'POST',
//             url: "../partjsp/center.jsp",
            url: "siteList",
            data: "idrubric=" + $(this).val(),
            success: function (html) {
                $("#content_center").html(html);
            }
        });
        return false;
    });
});

