package B18;

import java.sql.*;

public class IteratingResultsetBackward {
    public static void main(String[] args) throws SQLException {
        String connectionStr = "jdbc:oracle:thin:@54.152.82.171:1521:XE";
        String username = "hr";
        String password = "hr";

        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmnt.executeQuery("SELECT * FROM REGIONS");
        rs.afterLast();
        while (rs.previous() == true) {
            System.out.println(rs.getString(1) + " "
                    + rs.getString(2));

        }
        System.out.println("=======================");
        rs.absolute(2);
        System.out.println(rs.getString(1) + " "
                + rs.getString(2));

        System.out.println("Row: " + rs.getRow());
    }
}