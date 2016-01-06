/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPackage.ModelClasses;

/**
 *
 * @author VGLukin класс для проверки корректности пользователя переменные
 * userLogin и userPass заносятся login.jsp
 */
public class CheckLogin {

    private String userLogin;
    private String userPass;
    private String error;

    public boolean execute() {
        boolean result = authenticate();
        return result;
    }

    private boolean authenticate() {
        boolean result;

        error = "";
        result = false;
        if (CheckEmpty()) {
            error = "Одно или несколько полей не заполнены(логин/пароль)";
        } else {
            if (searchUser(userLogin, userPass)) {
                return true;
            }else{
                error = "Неверный логин или пароль";
            }
        }
        System.out.println(error);
        return result;
    }

    private boolean searchUser(String login, String pass) {
        final String LoginDefault = "adm";
        final String PassDefault = "13";
        if ((login.equals(LoginDefault)) && (pass.equals(PassDefault))) {
            return true;
        } else {
            return false;
        }
    }

    private boolean CheckEmpty() {
        boolean result = true;
        result = ((userLogin == null) || (userPass == null) || (userLogin.isEmpty()) || (userPass.isEmpty()));
        return result;
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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
