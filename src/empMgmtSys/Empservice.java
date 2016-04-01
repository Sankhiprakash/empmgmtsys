package empMgmtSys;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;



public class Empservice {
	
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/employee";
	   
	   //Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	  
	   Connection conn=null;
	   PreparedStatement statement=null;
	   ResultSet resultSet=null;
	   
	   public void addEmployee(employeeData employeeData) throws ClassNotFoundException, SQLException{
	   Class.forName("com.mysql.jdbc.Driver");
	   conn=DriverManager.getConnection(DB_URL, USER, PASS);
	   
	   System.out.println("Connection Successful sanks..!!");
	   System.out.println("inserting into table..");
	   
	   String query="insert into employeeTable(empName,age,address,salary) values(?,?,?,?)";
	   
	   java.sql.PreparedStatement statement = conn.prepareStatement(query);
	   statement.setString(1, employeeData.getEmpname());
	   statement.setInt(2, employeeData.getAge());
	   statement.setString(3, employeeData.getAddress());
	   statement.setInt(4, employeeData.getSalary());	
	   statement.executeUpdate();
	   
	   }
	   
	 

}

