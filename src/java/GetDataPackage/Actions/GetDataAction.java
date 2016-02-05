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
    private GetData getData = new GetData();    
    HttpServletRequest request;
    
    public String getSiteList(){
        System.out.println();
        String result = getData.getListSite(request);
        System.out.println(result);

        return CENTER;
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
