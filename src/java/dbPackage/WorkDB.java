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
import java.sql.Statement;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Владимир
 */
public class WorkDB {

    String ConPullName = "jdbc/userdb";
    DataSource ds;
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
                System.out.println("Exception while preparing query:" + query);
                System.out.println("Text exception:" + sqle.getMessage());
            }
        }

    }

    private WorkDB() {
        try {
            this.ds = InitialContext.doLookup(ConPullName);
        } catch (NamingException ne) {
            System.out.println("Exception while get Connection Pool");
            System.out.println(ne.getMessage());
        }
        /*  String dbName = "jdbc:mysql://localhost:3306/userdb?zeroDateTimeBehavior=convertToNull";
        String username = "root";
        String password = "13pass";*/
        con = null;
        try {
            //con = DriverManager.getConnection(dbName, username, password);
            con = ds.getConnection();
        } catch (SQLException sqle) {
            System.out.println("Cannot connection to DB");
        }
    }

    public static WorkDB getInstance() {
        //   return WorkDBHolder.INSTANCE;
        WorkDB work = new WorkDB();
        return work;
    }

//    private static class WorkDBHolder {
//        private static final WorkDB INSTANCE = new WorkDB();
//
//}

    /* заранее подготовленный запрос (для Insert, Update..)*/
    public void PrepareQueryExe() throws SQLException {
        pstmt.executeUpdate();
    }

    /*простой запрос к БД*/
    public ResultSet SimpleQuery(String query) throws SQLException {
        Statement st;
        st = con.createStatement();
        // setQuery(query); // организация подключения к базе и опред-е команды.
        ResultSet rs = null;
        rs = st.executeQuery(query);
        con.close();
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
