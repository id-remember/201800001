package exBean;
import java.sql.*;
import java.util.*;
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
 public List<studentVO> select() throws Exception {
	  List<studentVO> items = new ArrayList<studentVO>();
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","201800001","201800001");
	  PreparedStatement sql = conn.prepareStatement("select * from student");
	  ResultSet rs = sql.executeQuery();
	  while(rs.next()) {
	   studentVO item = new studentVO();
	   item.setNo(rs.getString("no"));
	   item.setName(rs.getString("name"));
	   items.add(item);
	   //System.out.print(items);
	  } 
	  return items;
	 }
}
