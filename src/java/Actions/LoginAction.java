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
    private CheckLogin checkLogin;
    private String userLogin;
    private String userPass;

    public String doLogin() throws Exception {
        boolean isUserCorrect = false;    
        // проверка логин/пароль
        isUserCorrect = CheckLogin.execute(userLogin, userPass);
        
        if (isUserCorrect) {
            return MAINPAGE;
        } else {  
            checkLogin.setError("Error value(s). Try again");
            return LOGINPAGE;
        }
    }

    @Override
    public CheckLogin getModel() {
        return checkLogin;
    }
    
    
    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
    
}
