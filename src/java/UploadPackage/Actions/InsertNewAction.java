/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UploadPackage.Actions;

import UploadPackage.ModelClasses.InsertNew;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
/**
 *
 * @author VGLukin
 */
public class InsertNewAction extends ActionSupport implements ModelDriven<InsertNew>, ServletRequestAware {

    HttpServletRequest request;
    private final InsertNew insertNew = new InsertNew();
    public static final String ADMIN = "admin";
    String resultInsert;

    /**
     * запись нового сайта: урл в базу и картинку в файл
     *
     * @return result
     * 
     */
    @Override
    public String execute() {
        resultInsert = "";

        System.out.println("idRubric=" + request.getParameter("idRubric"));
        System.out.println("url=" + request.getParameter("url"));
        System.out.println("Site name=" + request.getParameter("siteName"));
        try {
            resultInsert = insertNew.insertSite(request);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            resultInsert = e.getMessage();
        }
        return ADMIN;
    }

    @Override
    public InsertNew getModel() {
        return insertNew;
    }

    public HttpServletRequest getServletRequest() {
        return request;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String getResultInsert() {
        return resultInsert;
    }

    public void setResultInsert(String resultInsert) {
        this.resultInsert = resultInsert;
    }

}
