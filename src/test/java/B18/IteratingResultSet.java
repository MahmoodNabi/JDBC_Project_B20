package B18;

import java.sql.*;

public class IteratingResultSet {
    public static void main(String[] args) throws SQLException {
        String connectionStr ="jdbc:oracle:thin:@54.152.82.171:1521:XE";
        String username="hr";
        String password ="hr";
        Connection conn = DriverManager.getConnection(connectionStr,username,password);
        Statement stmnt =conn.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT*FROM REGIONS");

    while (rs.next() == true) {
        System.out.println(rs.getString(1) + " " + rs.getString(2));


    }

    }
}
