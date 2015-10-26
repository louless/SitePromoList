/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import MyClasses.CheckLogin;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 *
 * @author VGLukin
 */
public class LoginAction extends ActionSupport implements ModelDriven<CheckLogin>{

    private static final String MAINPAGE = "main";
    private static final String LOGINPAGE = "login";
    private CheckLogin CheckLogin;

    public String doLogin() throws Exception {
        boolean isUserCorrect = false;    
        // проверка логин/пароль
        isUserCorrect = CheckLogin.execute();
        if (isUserCorrect) {
            return MAINPAGE;
        } else {  
            return LOGINPAGE;
        }
    }

    @Override
    public CheckLogin getModel() {
        return CheckLogin;
    }
    
}
