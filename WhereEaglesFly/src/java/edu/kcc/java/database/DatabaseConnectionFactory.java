package edu.kcc.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Will
 */
public class DatabaseConnectionFactory {
    
    private String hostName = "http://z1crstujava01.kirkwood.edu/";
    private int port = 21;
    private String databaseName = "stujava";
    private String userName = "sql_developers";
    private String password = "B@dPassword2";
    
    
    public Connection getConnection() 
            throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection conn = null;
        conn = DriverManager.getConnection(
                "jdbc:mysql://"
                + hostName 
                //+ ":" + port
                + "/" + databaseName
                +"?noAccessToProcedureBodies=true"
		+ "&user=" + userName
		+ "&password=" + password
        );
        return conn;
    }
    
}
