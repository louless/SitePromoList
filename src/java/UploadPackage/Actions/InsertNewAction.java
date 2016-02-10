/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UploadPackage.Actions;

import UploadPackage.ModelClasses.OperationSite;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author VGLukin
 */
public class InsertNewAction extends ActionSupport implements ModelDriven<OperationSite>, ServletRequestAware {

    HttpServletRequest request;
    private final OperationSite operSite = new OperationSite();
    public static final String ADMIN = "admin";
    String result;

    /**
     * запись нового сайта: урл в базу и картинку в файл
     *
     * @return result
     *
     */
    @Override
    public String execute() {
        result = "";

        System.out.println("idRubric=" + request.getParameter("idRubric"));
        System.out.println("url=" + request.getParameter("url"));
        System.out.println("Site name=" + request.getParameter("siteName"));       
        result = operSite.insertSite(request);
        return ADMIN;
    }

    public String doDelSite(){
        System.out.println("id site =" + request.getParameter("idSite"));    
        result = operSite.DelSite();
              
        return ADMIN;
    }
    
    @Override
    public OperationSite getModel() {
        return operSite;
    }

    public HttpServletRequest getServletRequest() {
        return request;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String getResult() {
        return result;
    }

    public void setResultInsert(String result) {
        this.result = result;
    }

}
