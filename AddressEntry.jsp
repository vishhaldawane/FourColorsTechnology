<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 
	
	continents
	
	PK				UK
	continent_id	continent_name
	1 <=			Asia
	2				Europe
	3				America
	
	countries
	PK				UK				FK
	country_id		country_name	continent_id
	10				India			1 <=
	11				Srilanka		1	
	12				Nepal			1
	13				England			2
	14				France			2
	15				Germany			2
	
	states
	PK				UK				FK
	state_id		state_name		country_id 
	111				Maharashtra		10
	112				Gujrat			10
	113				Rajasthan		10
	114				Kerala			10
	115				Tamilnadu		10
	
	-->

	<%String continents[]={"Asia","Europe","America"}; %>
	<%String countries[]={"India","Srilanka","Nepal","England","France","Germany"}; %>
	<%String states[]={"Maharashtra","Tamilnadu","Gujrat","Punjab","Kerala","Rajasthan"}; %>
	
	Continent:
	<select id="continent">
	
	<%for(int i=0;i<continents.length;i++) { %>
		<option value="<%=continents[i]%>"> <%=continents[i] %></option>
	<%} %>	
		
	</select>
	
	Country:
	
	<select id="country">
	
	<%for(int i=0;i<countries.length;i++) { %>
		<option value="<%=countries[i]%>"> <%=countries[i] %></option>
	<%} %>	
		
	</select>
	
	State:
	
	<select id="state">
	
	<%for(int i=0;i<states.length;i++) { %>
		<option value="<%=states[i]%>"> <%=states[i] %></option>
	<%} %>	
		
	</select>

</body>
</html>