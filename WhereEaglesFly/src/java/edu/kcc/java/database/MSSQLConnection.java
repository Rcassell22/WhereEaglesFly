/*
* Wes Richardson created 2018.04.24
*
*
 */
package edu.kcc.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Wes Richardson
 */
public class MSSQLConnection {

    /**
     * These values would normally be retrieved from properties or preferences
     * instead of being hard coded. They are here for convenience in the
     * example.
     */
    private static final String hostName = "z1crstujava01.kirkwood.edu";
    private static final int port = 1433;
    private static final String databaseName = "stujava";
    private static final String userName = "sql_developers";
    private static final String password = "B@dPassword2";

    /**
     * Attempts to get a connection to the database.
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getConnection()
            throws ClassNotFoundException, SQLException {

        /**
         * The following line should not be required for modern implementations
         * of the JDBC connector. You may see it in examples, and some
         * connectors still use it. It is here for reference.
         */
        //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionString = "jdbc:sqlserver://"
                + hostName
                //+ ":" + port
                + ";databaseName=" + databaseName
                + ";user=" + userName
                + ";password=" + password;

        Connection conn = null;
        conn = DriverManager.getConnection(connectionString);
        return conn;
    }

}
