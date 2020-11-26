package B18;

import java.sql.*;

public class MovingForwardAndBackWardResult {
    public static void main(String[] args) throws SQLException {
        String connectionStr ="jdbc:oracle:thin:@54.152.82.171:1521:XE";
        String username ="hr";
        String password ="hr";
        Connection conn = DriverManager.getConnection(connectionStr,username,password);
        Statement stmnt =conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet rs =stmnt.executeQuery("SELECT * FROM COUNTRIES");
        rs.next();
        System.out.println(rs.getString("COUNTRY_ID")+" "
        +rs.getString("COUNTRY_NAME"));
        rs.next();
        System.out.println(rs.getString("COUNTRY_ID")+" "
                +rs.getString("COUNTRY_NAME"));
        rs.previous();

        System.out.println(rs.getString("COUNTRY_ID")+" "
                +rs.getString("COUNTRY_NAME"));



    }
}
