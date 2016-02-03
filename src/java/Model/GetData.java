/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dbPackage.WorkDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VGLukin
 */
public class GetData {

    private ResultSet rs;
    private int idrubric;
    private List <Site> sites;

    public String getListSite() {
        String result = "";
        sites = new ArrayList();
        try {
            rs = WorkDB.getInstance().SimpleQuery("SELECT idsite, url, namesite FROM sitelist where idrubric = " + idrubric);
            while (rs.next()) {
                Site site = new Site();
                site.setIdSite(rs.getInt("idsite"));
                site.setUrl(rs.getString("url"));
                site.setNameSite(rs.getString("namesite"));

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
