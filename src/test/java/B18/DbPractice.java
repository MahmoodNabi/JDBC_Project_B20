package B18;

import utill.Dbutility;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DbPractice {
    public static void main(String[] args) throws SQLException {
       Dbutility.createConnection();
      ResultSet  rs = Dbutility.runQuery("SELECT*FROM JOBS");

rs.next();
        System.out.println(rs.getString(1));

    }
}
