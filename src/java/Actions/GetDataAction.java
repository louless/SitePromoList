/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import Model.GetData;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 *
 * @author VGLukin
 */
public class GetDataAction extends ActionSupport implements ModelDriven<GetData>{
    private static final String CENTER  = "center"; 
    private GetData getData = new GetData();    
    
    public String getSiteList(){
        System.out.println();
        String result = getData.getListSite();
        System.out.println(result);
      
        return CENTER;
    }

    @Override
    public GetData getModel() {
        return getData;
    }
    
    
    
}
