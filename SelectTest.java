import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/*

  
  create table dept_fc
  (
    deptno int primary key,
    deptname varchar(20),
    deptloc  varchar(20)
  );
  
  insert into dept_fc values (10,'IT','Mumbai');
  insert into dept_fc values (20,'Sales','Delhi');
  insert into dept_fc values (30,'QMS','Pune');
  insert into dept_fc values (40,'Testing','Chennai');
  
  SELECT * FROM DEPT_FC;
  
 */


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
/*

I. connect to oralce db interface screen 

c:\app\UR_USER_NAME\dbhomeXE\bin>  sqlplus <---application file to be doubliclicked

c:\ ...it would ask to enter orale username > system
..oracle user's password : ....enter password here


II. create table, insert records, view records, commit them

SQL> create table dept_fc
  (
    deptno number primary key,
    deptname varchar2(20),
    deptloc  varchar2(20)
  );

  insert into dept_fc values (10,'IT','Mumbai');
  insert into dept_fc values (20,'Sales','Delhi');
  insert into dept_fc values (30,'QMS','Pune');
  insert into dept_fc values (40,'Testing','Chennai');

  SELECT * FROM DEPT_FC;

SQL> commit;

III.
    C:\app\DELL\product\18.0.0\dbhomeXE\network\admin
​    tnsname.ora to be review
​    find out to the host name

IV. services.msc <-- from windows search button
​
    locate the ---> oracleoradb18homelistener
	​right click on it ->    to be started -> start 
​
V. make these 2 changes in SelectTest.java
    DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
​    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.3:1521:xe","system","system");



*/