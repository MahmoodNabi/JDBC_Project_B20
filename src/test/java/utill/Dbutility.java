package utill;

import java.net.ConnectException;
import java.sql.*;

public class Dbutility {

 private static Connection conn;
 private static Statement stmnt;
 private static ResultSet rs;

    public static void createConnection() {
        String connectionStr = "jdbc:oracle:thin:@54.152.82.171:1521:XE";
        String username = "hr";
        String password = "hr";
try {
     conn = DriverManager.getConnection(connectionStr, username, password);

} catch (SQLException throwables) {
    throwables.printStackTrace();
}
    }


    public static ResultSet runQuery(String query) {

//        ResultSet rs  = null;
        // reusing the connection built from previous method
        try {
            stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmnt.executeQuery(query);

        } catch (SQLException e) {
            System.out.println("Error while getting resultset " + e.getMessage());
        }

        return rs;

    }


}
