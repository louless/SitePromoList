/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dbPackage.WorkDB;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

/**
 * вставка нового элемента в базу
 *
 * @author VGLukin
 */
public class InsertNew {

    private int idRubric;
    private String url;
    private String siteName;

    /**
     * вставка нового сайта
     *
     * @param request
     * @return inserting status
     * @throws java.sql.SQLException
     */
    public String insertSite(HttpServletRequest request) throws SQLException {
        String result = "";
        String result1 = "";
        String result2 = "";
        //     result1 = saveIntoDB();  
        result2 = saveIcon(request);
        if ((result1.equals("")) && (result2.equals(""))) {
            result = "";
        }
        return result;
    }

    /**
     * сохранение сайта в базу
     *
     * @return
     */
    private boolean saveIntoDB() {
        try {
            WorkDB.getInstance().setQuery(
                    "insert into sitelist (idrubric, url, namesite) values (?, ?, ?)");
            WorkDB.getInstance().getPstmt().setInt(1, idRubric);
            WorkDB.getInstance().getPstmt().setString(2, url);
            WorkDB.getInstance().getPstmt().setString(3, siteName);
            WorkDB.getInstance().PrepareQueryExe();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    /**
     * сохранение иконки сайта в папку
     *
     * @return
     */
    private String saveIcon(HttpServletRequest request) {
        String result;
        result = "bad";
        UploadFile uploadFile = new UploadFile();
        try {
             result = uploadFile.load(request);

        } catch (ServletException | IOException e) {
            return result;
        }

        return result;
    }



    public int getIdRubric() {
        return idRubric;
    }

    public void setIdRubric(int idRubric) {
        this.idRubric = idRubric;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

}
