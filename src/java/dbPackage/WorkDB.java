/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Владимир
 */
public class WorkDB {

    Connection con;
    String query;
    PreparedStatement pstmt;

    public void setQuery(String query) {
        this.query = query;
        this.pstmt = null;
        if (!query.isEmpty()) {
            try {
                pstmt = con.prepareStatement(query);
            } catch (SQLException sqle) {
                System.out.println("Exception while preparing query");
            }
        }
          
    }

    private WorkDB() {
        String dbName = "jdbc:mysql://localhost:3306/userdb?zeroDateTimeBehavior=convertToNull";
        String username = "root";
        String password = "3difficul1";
        con = null;
        try {
            con = DriverManager.getConnection(dbName, username, password);
        } catch (SQLException sqle) {
            System.out.println("Cannot connection to DB");
        }
    }

    public static WorkDB getInstance() {
        return WorkDBHolder.INSTANCE;
    }

    private static class WorkDBHolder {

        private static final WorkDB INSTANCE = new WorkDB();
    }

    /* заранее подготовленный запрос (для Insert, Update..)*/
    public void PrepareQueryExe() throws SQLException{        
        pstmt.executeUpdate();
    }

    /*простой запрос к БД*/
    public ResultSet SimpleQuery(String query) throws SQLException {
        setQuery(query); // организация подключения к базе и опред-е команды.
        ResultSet rs = null;
        if (pstmt != null){                    
            rs = pstmt.executeQuery();
        }
        return rs;
    }
    
        
    public Connection getCon() {
        return con;
    }    

    public PreparedStatement getPstmt() {
        return pstmt;
    }

    public void setPstmt(PreparedStatement pstmt) {
        this.pstmt = pstmt;
    }

    public String getQuery() {
        return query;
    }

}

