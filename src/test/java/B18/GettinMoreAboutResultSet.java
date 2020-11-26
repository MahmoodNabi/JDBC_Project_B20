package B18;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GettinMoreAboutResultSet {
    public static void main(String[] args) throws SQLException {
        String connectionStr = "jdbc:oracle:thin:@54.152.82.171:1521:XE";
        String username = "hr";
        String password = "hr";

        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmnt.executeQuery("SELECT * FROM EMPLOYEES");

ResultSetMetaData rsmd =rs.getMetaData();
       int columnCount = rsmd.getColumnCount();
        System.out.println("columnCout: " + columnCount);
String secondcolumnName = rsmd.getColumnName(2);
        System.out.println("second Column Name: " +secondcolumnName);

        for (int i = 1; i <=columnCount ; i++) {
            System.out.print("Column Name is: " + rsmd.getColumnName(i));
        }
        System.out.println("=====================");
        List<String> columnNameList = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            columnNameList.add(rsmd.getColumnName(i));

        }
        System.out.println("columnnamelist: " + columnNameList);



        rs.close();
        stmnt.close();
        conn.close();

    }
}
