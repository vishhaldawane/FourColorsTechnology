package com.bags;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EggContainer eggContainer = new EggContainer(24);
		
		eggContainer.add("Egg1");
		eggContainer.add("Egg2");
		eggContainer.add(null);
		eggContainer.add("Egg4");
		eggContainer.add("Egg5");
		eggContainer.add("Egg6");
//		eggContainer.add("Egg7");
//		eggContainer.add("Egg8");
//		eggContainer.add("Egg9");
//		eggContainer.add("Egg10");
//		eggContainer.add("Egg11");
//		eggContainer.add("Egg12");
		
		//eggContainer.add("Egg13");
		System.out.println("------------------");
		MyIterator iter = eggContainer.myIterator();
		System.out.println("Got the iterator..."+iter);
		
		while(iter.hasNext()) {
			String str = (String) iter.next();
			System.out.println("Egg : "+str);
		}
		
		
		
		BottleContainer bottle = new BottleContainer(12); //12 means 120 ml bottle   250  500ml   750ml  1000ml
		
		bottle.add("10ml");
		bottle.add("20ml");
		bottle.add("30ml");
		
		bottle.add("40ml");
		bottle.add("50ml");
		bottle.add("60ml");
		
		bottle.add("70ml");
		bottle.add("80ml");
		bottle.add("90ml");
		
		bottle.add("100 ml");
		bottle.add("110 ml");
		bottle.add("120 ml");
		
		MyIterator bIter = bottle.myIterator();
		while(bIter.hasNext()) {
			String str = (String) bIter.next();
			System.out.println("str "+str);
		}

	}

}

interface MyIterator
{
	boolean hasNext();
	Object next();
}


interface MyIterable
{
	MyIterator myIterator();
	
}
abstract class MyContainer implements MyIterable
{
	abstract void add(Object o);
}

class EggContainerCapacityExhaustedException extends RuntimeException
{
	EggContainerCapacityExhaustedException(String str) {
		super(str);
	}
}
class BottleContainerCapacityExhaustedException extends RuntimeException
{
	BottleContainerCapacityExhaustedException(String str) {
		super(str);
	}
}

class EggContainer extends MyContainer //will it have a size
{
	final int CAPACITY; // 0 to 11 = 12
	Object objectArray[] = null;  // to hold 12 objects
	int index=-1;
	
	EggContainer(int initialCapacity) {
		CAPACITY = initialCapacity;
		objectArray = new  Object[CAPACITY];
	}
	void add(Object obj) {
		
		if(index >= CAPACITY-1) {
			EggContainerCapacityExhaustedException ecceEx = new EggContainerCapacityExhaustedException("Egg container capacity is exahusted....");
			throw ecceEx;
		}
		objectArray[++index] = obj;
		System.out.println("adding...at "+index);
		
	}
	
	
//	MyIterator implemented BELOW
	private class EggIterator implements MyIterator
	{
		int initialIndex = 0;
		boolean isItEmpty=true;
		
		public boolean hasNext() {
			
		//	if(objectArray[initialIndex]==null) {
		//		return false;
		//	}
			
			if(initialIndex < objectArray.length)
				return true;
			else
				return false;
		}
		
		public Object next() { //would be called 12 times
			if(this.hasNext()) {
				return objectArray[initialIndex++];
			}
			return null;
		} 
	}
	public 	MyIterator myIterator()
	{
		EggIterator eggIter = new EggIterator(); //object of the private class here
		return eggIter; //returning it...
	}
}

class BottleContainer extends MyContainer //will it have a size
{
	final int CAPACITY; // 0 to 11 = 12
	Object objectArray[] = null;  // to hold 12 objects
	int index=-1;
	
	BottleContainer(int initialCapacity) {
		CAPACITY = initialCapacity;
		objectArray = new  Object[CAPACITY];
	}
	void add(Object obj) {
		
		if(index >= CAPACITY-1) {
			BottleContainerCapacityExhaustedException ecceEx = new BottleContainerCapacityExhaustedException("Bottle container capacity is exahusted....");
			throw ecceEx;
		}
		objectArray[++index] = obj;
		System.out.println("adding...at "+index);
		
	}
	
	
//	MyIterator implemented BELOW
	private class Straw implements MyIterator
	{
		int initialIndex = 0;
		boolean isItEmpty=true;
		
		public boolean hasNext() {
			
		//	if(objectArray[initialIndex]==null) {
		//		return false;
		//	}
			
			if(initialIndex < objectArray.length)
				return true;
			else
				return false;
		}
		
		public Object next() { //would be called 12 times
			if(this.hasNext()) {
				return objectArray[initialIndex++];
			}
			return null;
		} 
	}
	public 	MyIterator myIterator()
	{
		Straw theStraw = new Straw(); //object of the private class here
		return theStraw; //returning it...
	}
}




