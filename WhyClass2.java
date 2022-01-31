package com.fourcolours;

public class WhyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// if i want to store the personal details of a Person
		
		int x1=10; // HERE int (primitive) is the data type
		int x2=20;
		int x3=30;
		
		Person thePerson1; // Person (UDT)  is the Data Type , it is just a reference to Person class
		Person thePerson2;
		Person thePerson3;
		
		
		thePerson1 = new Person(); // new keyword will alocate the data structure as
									// per the class data members
		
		thePerson2 = new Person();
		
		thePerson3 = new Person();
		
		thePerson1.setPerson('F',23,"Julie","julie@gmail.com","West Avenue"); //u r utilizing the instance's function
		thePerson2.setPerson('M',25,"Jack","jack@gmail.com","East Avenue");
		thePerson3.setPerson('M',28,"Arnold","arnold@gmail.com","North Avenue");
		
		
		thePerson1.printPerson();
		thePerson2.printPerson();
		thePerson3.printPerson();
		System.out.println("------");
		
		Font myFont = new Font();
		
		myFont.setFont("Comic Sans", 20, "Blue", "Bold");
		myFont.showFont();
		
		Font myFont2 = new Font();
		
		myFont2.setFont("Times New Roman", 22, "Yellow", "Italics");
		myFont2.showFont();
		
		
		
		
	}

}
/*
 Innovate your own class - introduce data members and member functions in it 
  		create objects of your class and print the details of these objects
  		, like you did it for the Person class
  		
  		
  		INNOVATIVENESS MUST BE UNIQUE
  		1. Aniruddha -  Font
  		2. Bhakti - WristWatch
  		3. Gayatri - Vehicle
  		4. Pooja - ,,
  		5 ..
  		6. ..
  		7 ..
  		8.
  		9
  		10.
  		
 

 			stack								heap
 			
 											<-------DATA MEMBERS------------>
 											gender		age			name
 											----------------------------------
 											|		|			|			|
 											---------------------------------
 				+--------------------------->100
 				|
 			+---|----+
 			|	100	|
 			+-------+
 			thePerson1
 			
 												MEMBER METHODS
 																				
 											Person() { }
 											void setPerson() { }
 											void printPerson() { ]
 											
 											
 											
 											<-------DATA MEMBERS------------>
 											gender		age			name
 											----------------------------------
 											|		|			|			|
 											---------------------------------
 				+--------------------------->200
 				|
 			+---|----+
 			|	200	|
 			+-------+
 			thePerson2
 			
 			
 											<-------DATA MEMBERS------------>
 											gender		age			name
 											----------------------------------
 											|		|			|			|
 											---------------------------------
 				+--------------------------->300
 				|
 			+---|----+
 			|	300	|
 			+-------+
 			thePerson3
 											
 
 */

//class is simply a design, 			e.g., blue print of a house
//object is an instance of a class		e.g., the actual house (s)

class Person // external structure to hold the data an relevant functions
{
	//declaration of the data types and variables
	char gender; //global to the class members, since it is inside the class Person
	int  age;
	String name;
	String emailAddress; //introduce a new member
	String homeAddress;
	
	//one more function is here ie, Person() { } <-- explicit no-arg constructor
	
	//every class has an implicit  constructor /default ctor - IT DOES NOTHING
	
	//third member is - the constructor function - Person() { }
		
	void setPerson(char x, int y, String z, String ea, String ha) {
		//setPerson(with parameters) initialization of the variables
		gender=x;
		age=y;
		name=z;;
		emailAddress = ea; //initialize this new member
		homeAddress = ha;
	}
	
	void printPerson() {
		//print the personal details
		System.out.println("-------------------");
		System.out.println("Gender is : "+gender);
		System.out.println("Age    is : "+age);
		System.out.println("Name   is : "+name);
		System.out.println("Email  is : "+emailAddress); // print it
		System.out.println("Home   is : "+homeAddress); // print it
	}
	
			
}

class Font
{
	String fontName;
	int size;
	String color;
	String style; 
	
	
	void setFont(String fn, int s, String c, String st) { //2nd
		
		fontName = fn;
		size = s;
		color = c;
		style = st;
	}
	
	void showFont() { //1st
		System.out.println("Font name  : "+fontName);
		System.out.println("Font size  : "+size);
		System.out.println("Font color : "+color);
		System.out.println("Font style : "+style);
		System.out.println("-------------");
	}
}













