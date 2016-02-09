/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetDataPackage.Actions;

import GetDataPackage.ModelClasses.GetData;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.io.File;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author VGLukin
 */
public class GetDataAction extends ActionSupport implements ModelDriven<GetData>, ServletRequestAware{
    private static final String CENTER  = "center"; 
    private static final String EDIT  = "editSite";
    private GetData getData = new GetData();    
    HttpServletRequest request;
    
    public String getSiteList(){
     
    //  String directory = getDirectory();
  //      File dir  = new File(directory);
 //       if (!dir.exists()){
  //          dir.mkdir();
     ///   }
        String result = getData.getListSite(request);
        System.out.println(result);

        return CENTER;
    }
    
    public String getSiteEdit(){
        String result = getData.getListSite(request);
        return EDIT;
    }    
    
    // не используется (проверка на ОС)
    private String getDirectory(){
         //  String directory = File.separator + "home" + File.separator + "glassfish" + File.separator + "icons";
        String dir;
        String OS;
        OS = System.getProperty("os.name");        
        if (OS.contains("Windows")){
            dir = "c:" + File.separator + "home" + File.separator + "glassfish" + File.separator + "icons";
        }else{
            dir = File.separator + "home" + File.separator + "glassfish" + File.separator + "icons";
        } 
        System.out.print(OS); 
        System.out.print(dir); 
        
        return dir;
    }

    @Override
    public GetData getModel() {
        return getData;
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        this.request = hsr;
    }

    public HttpServletRequest getRequest() {
        return request;
    }
   
    
    
    
    
}
