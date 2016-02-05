/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetDataPackage.ModelClasses;

import UploadPackage.ModelClasses.UploadFileStruts;
import dbPackage.WorkDB;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author VGLukin
 */
public class GetData {

    private ResultSet rs;
    private int idrubric;
    private List<Site> sites;

    public String getListSite(HttpServletRequest request) {
        String result = "";
    //    String directory = request.getContextPath() + File.separator + UploadFileStruts.filesPath;
        sites = new ArrayList();
        try {
            rs = WorkDB.getInstance().SimpleQuery("SELECT idsite, url, namesite FROM sitelist where idrubric = " + idrubric);
            while (rs.next()) {
                Site site = new Site();
                site.setIdSite(rs.getInt("idsite"));
                site.setUrl(rs.getString("url"));
                site.setNameSite(rs.getString("namesite"));
/*
                File dir = new File(directory, site.getIdSite() + ".jpg");
                site.setImagePath(dir.getPath());*/
          //      http://balusc.omnifaces.org/2007/04/imageservlet.html
            //    http://ru.vingrad.com/otobrazheniye-image-byte[]-ispolzuya-struts-2-id50bb5ef46ccc19482200700c
            // http://www.programcreek.com/2009/02/java-convert-image-to-byte-array-convert-byte-array-to-image/
                sites.add(site);
            }
            rs.close();
        } catch (SQLException ex) {
            result = ex.getMessage();
            return result;
        }
        return result;

    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public int getIdrubric() {
        return idrubric;
    }

    public void setIdrubric(int idrubric) {
        this.idrubric = idrubric;
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

}
