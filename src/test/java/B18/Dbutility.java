package B18;

import java.net.ConnectException;
import java.sql.*;

public class Dbutility {

private static Connection conn;
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


    public static ResultSet runQuery (String query) {

try{
    Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    rs =stmnt.executeQuery(query);
}catch (SQLException throwables){
    throwables.printStackTrace();
}
return rs;
    }


}
