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

    private CheckLogin checkLogin = new CheckLogin();

    @Override
    public String execute() throws Exception {
        boolean isUserCorrect = false;    
        // проверка логин/пароль
            System.out.println("userPass=" + checkLogin.getUserPass());
            System.out.println("userLogin=" + checkLogin.getUserLogin());        
        isUserCorrect = checkLogin.execute();
        
        if (isUserCorrect) {
            return SUCCESS;
        } else {  
            System.out.println("error=" + checkLogin.getError());
            System.out.println("userLogin=" + checkLogin.getUserLogin());
            return LOGIN;
        }
    }

    @Override
    public CheckLogin getModel() {
        return checkLogin;
    }
}
