package B18;

import java.sql.*;

public class DbConnection {
    public static void main(String[] args) throws SQLException {
        String connectionStr ="jdbc:oracle:thin:@54.152.82.171:1521:XE";
        String username="hr";
        String password ="hr";
        Connection conn =DriverManager.getConnection(connectionStr,username,password);
        Statement stmnt =conn.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT*FROM REGIONS");
rs.next();
        System.out.println("first column value using index: "+rs.getString(1));
        System.out.println("first column value using column_name: "+ rs.getString("REGION_ID"));
        System.out.println("second column value using index: " +rs.getString(2));
        System.out.println("second column value using column_name: " + rs.getString("REGION_NAME"));
rs.next();
        System.out.println("first column value using index: "+rs.getString(1));
        System.out.println("first column value using column_name: "+ rs.getString("REGION_ID"));
        System.out.println("second column value using index: " +rs.getString(2));
        System.out.println("second column value using column_name: " + rs.getString("REGION_NAME"));




    }
}
