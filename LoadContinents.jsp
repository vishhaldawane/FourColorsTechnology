<%@ page import="java.sql.*"%>


<!-- 
create table CONTINENTS
(
CONTINENT_ID INT PRIMARY KEY,
CONTINENT_NAME VARCHAR(20)
);
INSERT INTO CONTINENTS VALUES (1,'Asia');
INSERT INTO CONTINENTS VALUES (2,'Europe');

create table COUNTRIES
(
country_id INT PRIMARY KEY,
country_name VARCHAR(20) unique,
continent_id int references continents(continent_id)
);

insert into countries values (1,'India',1);
insert into countries values (2,'Nepal',1);
insert into countries values (3,'Srilanka',1);

insert into countries values (4,'France',2);
insert into countries values (5,'Germany',2);
insert into countries values (6,'England',2);

create table STATES
(
state_id INT PRIMARY KEY,
state_name VARCHAR(20) unique,
country_id int references COUNTRIES(country_id)
);

insert into state values (1,'Maharashtra',1);
insert into state values (2,'Gujrat',1);
insert into state values (3,'Rajasthan',1);

insert into state values (4,'Lumbini',2);
insert into state values (5,'Karnali',2);
insert into state values (6,'Sudurpashchim',2);

insert into state values (7,'Matara',3);
insert into state values (8,'Badulla',3);
insert into state values (9,'Monaragala',3);

select * from states where country_id in (select country_id from countries where continent_id = (select continent_id from continents where continent_name='Asia'));

select * from states where country_id in (select country_id from countries where country_name='India');

 -->


<%

	String s=request.getParameter("val"); // http://ip:port/RestWeb/index.jsp?val1=100&val2=jack&val3=9000

	if(s==null || s.trim().equals(""))
	{
		out.print("Please enter id");
	}
	else
	{
		String continent_name=s;
	//	out.print(s);
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			System.out.println("Driver loaded...");
			
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mdb","root","root");
			Connection con=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb","SA","");
			System.out.println("Connected...");
			
			String continents_query = "select * from continents where continent_name = ?";
			String countries_query = "select * from countries where continent_id = ?";
			
			String states_query = "select * from states where country_id = ?";
			
			System.out.println("continent query : "+continents_query);
			System.out.println("country   query : "+countries_query );
			System.out.println("States   query : "+states_query );
			
			PreparedStatement ps1=con.prepareStatement(continents_query);
			ps1.setString(1,s);
			
			PreparedStatement ps2=con.prepareStatement(countries_query );
			PreparedStatement ps3=con.prepareStatement(states_query );
		
			ResultSet rs1=ps1.executeQuery();
			ResultSet rs3=null;
			
			System.out.println("Query fired..got the result.....");
			
			
			while(rs1.next())
			{
				int continent_id = rs1.getInt(1);
				//out.println(rs1.getString(2));
				ps2.setInt(1,continent_id);
				ResultSet rs2=ps2.executeQuery();
		%>
			

  
  <form name="vinform1">
  <br>
  <br>
  
			DYNAMIC2 <select id="mycountries" name="mycountries"  onchange="sendInfo2()"> 
			<% 		
				while(rs2.next()) { //fetching the countries 
			%>
			
					<option value="<%=rs2.getInt(1)%>"><%=rs2.getString(2)%></option>
				
						<% 
							int country_id = rs2.getInt(1);
					
						%>
						
			
			<% } %>
		
			 </select> 	 
	</form>			
				
	<%
			}
			System.out.println("ResultSet is sent....");
			
			con.close();
			System.out.println("Connection closed.......");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
%>