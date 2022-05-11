package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {
    // factory of statement, preparedStatement and DatabaseMetaData
    private static Connection connection = null;

    //private createConnection(resulSet, resultSetConcurrency)  ??

    private ConnectionFactory() {

    }

    public static Connection getConnection() {
        if (connection == null) {
            ResourceBundle bundle = ResourceBundle.getBundle(("com/revature/dbConfig"));
            String url = bundle.getString("url");
            String username = bundle.getString("username");
            String password = bundle.getString("password");

            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
class Output{

    Connection obj1 = ConnectionFactory.getConnection();
    Connection obj2 = ConnectionFactory.getConnection();
    Connection obj3 = ConnectionFactory.getConnection();
    Connection obj4 = ConnectionFactory.getConnection();

}