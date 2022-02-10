import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. load teh driver
		
		try {
			System.out.println("Trying to register the driver...");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registerd....");
			
			System.out.println("Trying to acquire the connection with the database....");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected to the DB : "+conn);
			
			Statement st = conn.createStatement();
			System.out.println("Statement made "+st);
			
			ResultSet result = st.executeQuery("select * FROM DEPT_FC");
			
			while(result.next()) {
				int deptno = result.getInt(1);
				String dname = result.getString(2);
				String loc  = result.getString(3);
				
				System.out.println("DEPT NO   : "+deptno);
				System.out.println("DEPT NAME : "+dname);
				System.out.println("DEPT LOC  : "+loc);
				System.out.println("------------------------");
				
			}
			
			result.close();
			st.close();
			conn.close();
			System.out.println("DB resources are closed.....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
