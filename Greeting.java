package com.fourcolours;

import javax.swing.JFrame;
//First.cpp -> compiled -> First.obj -> linked -> First.exe
// One .java file(source code) should have only one public class
// a public class must be saved in its own file ( in its own source code )
public class Greeting { // Greeting.java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Greeting to the Java Full Stack Training");
		System.out.println("Java learning is a fun...");
	}

}         
class GraphicalWelcome
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame myFrame = new JFrame("Hello JFrame");
		myFrame.setSize(400, 100); //400 as a width, 100 as a height
		
		myFrame.setLocation(200, 350); // x and y location on screen
		myFrame.setVisible(true); // true means show the frame
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //on closing the frame it should exit
		
		System.out.println("Welcome to the Java Full Stack Training");
		System.out.println("Java learning is exciting...");
	}
}

class Welcome { // Welcome.java
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Java Full Stack Training");
		System.out.println("Java learning is exciting...");
	}
}
 class Joker { 
	  void juggling() {
		 System.out.println("Joker is juggling...");
	 }
	 
 }
 
 class RingMaster { 
	 void instruct() {
		 System.out.println("ring master is instructing...");
	 }
	 
 }
 
 class SavingsAccount { 
	 void withdraw() {
		 System.out.println("withdrawing.... amount...from savings account..");
	 }
	 
	 
 }
 
 
 /*
  * 		Greeting.java <---is your source code
  * 
  * 
  * Compile it
  * 
  * 		C:\jack\fourcolors> javac  Greeting.java
  * 									|
  * 					------------------------------------------------------------
  * 						|		|				|		 |					|
  * 				Greeting.class Welcome.class Joker.class RingMaster.class SavingsAccount.class
  * 				 |				|				|			|				|
  * 				main			main		juggling		instruct		withdraw
  * 
  * 		C:\jack\fourcolors> java Greeting
   
    
    
    					Java Technology
    							|
    				---------------------------------
    				|			|				|
    				JSE			JEE				JME
    				|			|			 	|
    				Standard	Enterprise 		Micro [ Android ]
    			Core Java		    |
    			|				----------------------
    Language fundamentals		|					|
    data types					WEB					EJB
    classes and objects			|					|
    OOPS concepts				Servlets		---------------------------------------------
    packages					JSP				|spring				|jpa				|
    access specifiers			HTML/CSS/JS	 Session			Entity				Message
    Exception handling			AJAX			 |					|				  |
    Multithreading f/w			WebServices	  ----------		----------			------------------
    Generics					TypeScript	  |       |			|		|			|			|
    Collections f/w				Angular		Stateless Stateful  BMP    CMP			SMS		  Mail
    File handling i/o			ReactJS		|			 |        |     |
    JDBC				airindia.com -->FlightEnquiry BookFlight jdbc  ORM f/w
    							src,dest,date,eco/1st					Hibernate/JPA
    							
    							persistence = storing the "object details" on the DATABASE tables
    							
    							bean = class
    							
    							ORM - object<->relation mapping
    							BMP - bean managed      persistence [ jdbc code is hand coded ]
    							CMP - container managed persistence [ auto generated JDBC code ]
    							
    
        <--------->           <------------>
    	insert into passenger values(......);
    	insert into booking   values(.......);
    	insert into ticket    values(.....);
    	..
    	..
    	10
    	
    
    								Java Programs
    										|
    			-----------------------------------------------------
    				|				|				|
    			applications		applets			servlets
    			|						|			|
    			main()				<--- no main() ---> rather we have life cycle methods
    			|
    	------------------------------------------
    	|		|				|			|
    	CUI	   GUI				CUI			GUI
    	|		|				Socket		JFrame
    Greeting GraphicalWelcome	Thread		Socket  n/w
    Welcome		JFrame						Thread
    
    ->			->				->			->
    	
    
   DATA TYPEs
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  */
