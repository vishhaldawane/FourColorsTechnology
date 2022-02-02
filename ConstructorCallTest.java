package com.fourcolours;

public class ConstructorCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Child child = new Child();
		//child.javaCoding();
		
		//Father father = new Father();
		//father.banking();
		
		GrandFather gf = new GrandFather();
		gf.farming();
		
		
	}

}
/*
   		GrandFather
   		  |
   		  Father
   		  |
   		  Child
   		  
 */
class GrandFather // extends Object
{
	GrandFather() {
		//super();
		System.out.println("GrandFather() ctor...");
	}
	void farming() {
		System.out.println("GrandFather is farming....");
	}
}

class Father extends GrandFather
{
	Father() {
		//super();
		System.out.println("Father() ctor...");
	}
	void banking() {
		System.out.println("Father is banking....");
	}
}

class Child extends Father
{
	Child() {
		//super();
		System.out.println("Child() ctor...");
	}
	void javaCoding() {
		System.out.println("Child is doing java coding....");
	}
}
