/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPackage.Actions;

import LoginPackage.ModelClasses.CheckLogin;
import LoginPackage.ModelClasses.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author VGLukin
 */
public class LoginAction extends ActionSupport implements ModelDriven<CheckLogin>, SessionAware {

    private CheckLogin checkLogin = new CheckLogin();
    private Map session;
    private User user;
    private final String ADMIN = "admin";

    @Override
    public String execute() throws Exception {
        boolean isUserCorrect = false;
        // проверка логин/пароль       
        isUserCorrect = checkLogin.execute();

        if (isUserCorrect) {
            user = new User();
            user.setUserID(1);
            session.put("user", user);
            return SUCCESS;
        } else {
            System.out.println("userLogin=" + checkLogin.getUserLogin());
            return LOGIN;
        }
    }

    /**
     * перед переходом на некоторые страницы
     * проверка, что пользователь зашел под существующим логином
     * @return
     */
    public String validateUser() {
        if (session == null){
            System.out.println("session object is null");
        }
        User userTmp = (User) session.get("user");
        if ((userTmp != null) && (userTmp.getUserID() != 0)) {
            return ADMIN;
        } else {
            return LOGIN;
        }
    }

    @Override
    public CheckLogin getModel() {
        return checkLogin;
    }

    @Override
    public void setSession(Map session) {
        this.session = session;
    }
}
