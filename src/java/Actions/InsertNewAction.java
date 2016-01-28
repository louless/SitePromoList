/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author VGLukin
 */
public class InsertNewAction extends ActionSupport {


    
    public static final String ADMIN = "admin";

    public String InsertNewSite() throws Exception{
        return ADMIN;
    }

}
