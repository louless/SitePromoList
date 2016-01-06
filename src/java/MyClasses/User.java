/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

/**
 *
 * @author VGLukin
 */
public class User {
    private int userID;
    private String userName;
    private String userPass;
       
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPass() {
        return userPass;
    }
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }  
}
