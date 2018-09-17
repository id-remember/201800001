package exBean;
import java.sql.*;
public class studentDAO {
 public void insert(studentVO item) throws Exception {
  String no = item.getNo();
  String name = item.getName();
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","201800001","201800001");

  //System.out.println(conn);
  PreparedStatement sql = conn.prepareStatement("insert into student values(?,?)");
  sql.setString(1,no);
  sql.setString(2,name);
  sql.executeUpdate();
 }
}
