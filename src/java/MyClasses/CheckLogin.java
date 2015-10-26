/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

/**
 *
 * @author VGLukin класс для проверки корректности пользователя переменные
 * userLogin и userPass заносятся на login.jsp
 */
public class CheckLogin {

    private String userLogin;
    private String userPass;
    private String error = "";

    static public boolean execute() {
        boolean result = false;
        CheckLogin checkLogin = new CheckLogin();
        result = checkLogin.doCheckLogin();
        return result;
    }

    public boolean doCheckLogin() {
        final String LoginDefault = "user";
        final String PassDefault = "13";
        boolean result;
        
        result = false;
        if (CheckEmpty()) {
            error = "Одно или несколько полей не заполнены";
            System.out.println(error);
        } else {
            if ((userLogin.equals(LoginDefault)) && (userPass.equals(PassDefault))) {
                result = true;
            } else {
                error = "Неверный логин/пароль";
                System.out.println(error);
            }
        }
        return result;
    }

    private boolean CheckEmpty() {
        boolean result = true;
        result = (userLogin.isEmpty()) || (userPass.isEmpty());
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
