/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import Model.InsertNew;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author VGLukin
 */
public class InsertNewAction extends ActionSupport implements ModelDriven<InsertNew>{

    private InsertNew insertNew = new InsertNew();
    public static final String ADMIN = "admin";

    public String InsertNewSite(HttpServletRequest request) throws Exception{
        boolean resultInsert = false;
        resultInsert = insertNew.insertSite(request);
        
        return ADMIN;
    }

    @Override
    public InsertNew getModel() {
        return insertNew;
    }

}
