package com.fourcolours;

public class ConstructorCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandFather gf = new GrandFather();
		gf.wakeUp();
		gf.farming();
		gf.fightForFreedom();
		gf.giveJustice();
		gf.sleepAt();
		
		
		System.out.println("====================");
		
		Father father = new Father();
		father.wakeUp();
		father.banking();
		father.farming();
		father.fightForFreedom();
		father.giveJustice();
		father.sleepAt();
		
		System.out.println("====================");
		
		Child child = new Child();
		child.wakeUp();
		child.javaCoding();
		child.banking();
		child.farming();
		child.fightForFreedom();
		child.giveJustice();
		child.sleepAt();
	
		
	}

}
/*
   		GrandFather
   		  |
   		  Father
   		  |
   		  Child
   		  
   	4 			x		 4 
   	|					 |
   	based				based
   	on return type		on 
   	and arguments		inheritance
   	
   	1. exclusive function
   	2. inherited function
   	3. inherited-hence-overridding function
   	4. implemented (mandatory development of it) method
 */

interface FreedomFighting {
	void fightForFreedom(); //function is just declared | AND NOT DEFINED here
}
interface Justicing {
	void giveJustice(); //declared and not defined
}
interface Waking {
	void wakeUp(); //mandatory to wakeup ..   3.40am
}

interface Sleeping {
	void sleepAt();
}

//23 DNA Father + 23 Mother = 46 

class GrandFather implements FreedomFighting, Justicing, Waking, Sleeping // extends Object
{
	GrandFather() {
		//super();
		System.out.println("GrandFather() ctor...");
	}
	void farming() { //1
		System.out.println("GrandFather is farming....via the Bulls and Ploughing...");
	}
	public void fightForFreedom() { // this is a compulsion or a mandate to define here 
		System.out.println("GrandFather is/was fighing for the Freedom....in non-violence..way.. ");
	}
	public void giveJustice() {
		System.out.println("GrandFather is/was giving proper justice..in the village issues...");
	}
	public void wakeUp() {
		System.out.println("GrandFather is waking up at 4.30am...");
	}
	public void sleepAt() {
		System.out.println("GrandFather is sleeping at 09.00pm");
	}
}

class Father extends GrandFather
{
	Father() {
		//super();
		System.out.println("Father() ctor...");
	}
	void banking() { //1
		System.out.println("Father is banking....");
	}
	void farming() { //1
		//super.farming();
		System.out.println("Father is farming....via the Tractor....");
	}
	public void fightForFreedom() { // overriding is never a compulsion or a mandate
		System.out.println("Father is/was fighing for the Freedom....in Editorial..way.. ");
	}
	
	public void wakeUp() {
		System.out.println("Father is waking up at 5.30am...");
	}
	public void sleepAt() {
		System.out.println("Father is sleeping at 11.00pm");
	}
	
}

class Child extends Father
{
	Child() {
		//super();
		System.out.println("Child() ctor...");
	}
	void javaCoding() { //1
		System.out.println("Child is doing java coding....");
	}
	void banking() { //1
		System.out.println("Child is banking....via phone banking...");
	}
	void farming() { //1
		//super.farming();
		System.out.println("Child is farming....via the Drone Sprinklers and RoboTractor....");
	}
	public void fightForFreedom() { // overriding is never a compulsion or a mandate
		System.out.println("Child is/was fighing for the Freedom....in violence..way.. ");
	}
	public void wakeUp() {
		System.out.println("Child is waking up at 6.30am...");
	}
	public void sleepAt() {
		System.out.println("Child is sleeping at 00.00 midnight");
	}
}
