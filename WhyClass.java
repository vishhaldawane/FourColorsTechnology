package com.fourcolours;

public class WhyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// if i want to store the personal details of a Person
		
		
		//declaration of the data types and variables
		char gender; //local variable, since it is inside the main
		int  age;
		String name;
		
		
		//initialization of the variables
		gender='F';
		age=23;
		name="Julie";
		
		//print the personal details
		System.out.println("\nGender is : "+gender);
		System.out.println("Age    is : "+age);
		System.out.println("Name   is : "+name);
		
		//what if i want to store details for 3 persons
		
		//another declaration of the data types and variables
		char gender2; //another set of local variables, since it is inside the main
		int  age2;
		String name2;
		
		
		//another set for initialization of the variables
		gender2='M';
		age2=25;
		name2="Jack";
		
		//another set to print the personal details
		System.out.println("\nGender is : "+gender);
		System.out.println("Age    is : "+age2);
		System.out.println("Name   is : "+name2);
		
		//another declaration of the data types and variables
		char gender3; //another set of local variables, since it is inside the main
		int  age3;
		String name3;
		
		
		//another set for initialization of the variables
		gender3='F';
		age3=27;
		name3="Smith";
		
		//another set to print the personal details
		System.out.println("\nGender is : "+gender);
		System.out.println("Age    is : "+age2);
		System.out.println("Name   is : "+name3);
		
		age3=age;
		
		name3=name2;
		
		//another set to print the personal details
		System.out.println("\nGender is : "+gender3);
		System.out.println("Age    is : "+age3);
		System.out.println("Name   is : "+name3);
		
		
		
		
	}

}
