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
		
		thePerson1.setPerson('F',23,"Julie");
		thePerson2.setPerson('M',25,"Jack");
		thePerson3.setPerson('M',28,"Arnold");
		
		
		thePerson1.printPerson();
		thePerson2.printPerson();
		thePerson3.printPerson();
		
		
		
	}

}
/*
 

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

class Person // external structure to hold the data an relevant functions
{
	//declaration of the data types and variables
	char gender; //global to the class members, since it is inside the class Person
	int  age;
	String name;
	
	//one more function is here ie, Person() { } <-- explicit no-arg constructor
	
	//every class has an implicit  constructor /default ctor - IT DOES NOTHING
	
	//third member is - the constructor function - Person() { }
		
	void setPerson(char x, int y, String z) {
		//setPerson(with parameters) initialization of the variables
		gender=x;
		age=y;
		name=z;;
	}
	
	void printPerson() {
		//print the personal details
		System.out.println("\nGender is : "+gender);
		System.out.println("Age    is : "+age);
		System.out.println("Name   is : "+name);
	}
	
			
}














