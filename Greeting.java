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
   									|
   				----------------------------------------
   				|								|
   				Primitive					Secondary
   				|									|
   	------------------------------			----------------------------
   	|		|		|			|			|java.lang <-- default package 
 Integral Floating Character  Boolean		Object <-- root class of the java hierarchy
 |											|
 byte  1								--------------------------
 short 2								|		|	|			|
 int   4							String	 Joker	Greeting	Welcome
 long  8
 
 windows		unix
 tc	 / VC++		tc
 |		|		|
 int	int		int
 2		4		4
 
 difference in size would impact on the range it holds
 
 size of all types is fixed across all JVMs
 
 
 Types of coding			Standard Naming Convention
 |							|
 class						ClassName		DriverManager  SavingsAccount FixedDepositAccount - PascalCase
 
 variable					variableName	rollNumber,  employeeNumber, socialSecurityNumber - cameCase	
 method						methodName		withdrawCash(), setLookAndFeel(), transferFunds()

											godisnowhere()  godIsNoWhere(), godIsNowHere()

 constant					CONSTANT		PI  MAX  MIN   SPEED_OF_LIGHT  GRAVITY	
 package					main.subpack	com.fourcolorurs,  java.swing.JFrame
 
 
 
 
 
   
   
    
    byte = 1 byte
    
    
    	1 byte = 8 bits
    	
    	
    	1 bit =   0   on					2
    			  1	  off
    			  
    	2 bits	=	 0 0					4
    				 0 1
    				 1 0
    				 1 1
    				 
    	3 bits = 	0	0	0		0		8
    				0	0	1		1
    				0	1	0		2
    				0	1	1		3
    				1	0	0		4
    				1	0	1		5
    				1	1	0		6
    				1	1	1		7
    				
    	4 bits = ..							16
    	5									32
    	6									64
    	7									128
    	
    	
    	
    	<---------------------------------256-------------------------->
    	-128	-126	-3  -2   -1			0		1 	2	3	...  127
    	
    	
    	
    	
    	
    	
    	Classes				vs				Objects
    	|									|
    	|									|
    	design of the "object"			instance of a "class"
    	logical entity					realtime/physical entity
    	eg. blueprint of a house		actual house
    	its just an english code		realtime entity in the memory
    	 
    	
    	
    	class SavingsAccount			SavingsAccount savObj1 = new SavingsAccount();
    	{								SavingsAccount savObj2 = new SavingsAccount();
    			data members			SavingsAccount savObj3 = new SavingsAccount();
    			+
    			member functions/
    			methods
    	}
    	
    	
    	
    Constructor
    ------------
    
    	
    		a constructor is a function which has the same name as of the 
    		enclosing class
    		
    		
    		class Person
    		{
    				Person(int x, int j) <--- same name as of the class
    				{
    				
    				}
    				Person(int i) {
    				}
    				Person(String str) {
    				}
    				
    		}
    		
    		- it does not have return type
    		- but it can take parameters
    		
    		- hence it can be overloaded
    		
    		- it is automatically executed during the object creation process
    		
    		Person thePerson = new 	Person();
    		|			 |		 |		|
    		className refName allocator constructor
    		
    		if the constructor is failed to execute, then
    		the new keyword would fail the allocation too.
    		
    		
    		
    		- INITIALIZE THE state of the object
    		
    		- every class has an "implicit constructor" - provided by JPL
    		
    				- it is also known as the "default constructor"
    				
    				
    				
    		class Student
    		{
    				 <-- there is a default constructor
    				
    		}
    		
    		class Employee
    		{
    				Employee() // explicit no-arg constructor
    				{
    				
    				}
    		}
    		
    		at a time you can have either the implicit or the explicit
    		but no
    		
    		
    		
    		
    		
    		
    		
    		
    	
    	
    	
    	
    	
    				
    				
    
    
    
    
    
    
    
    
    
    
    
    
  */
