package com.math;

public class ArithmeticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin main...");
		MyCalculator.divide(10,4);
		
		
		try
		{
			MyCalculator.divide(103,0);
		}
		catch(ArithmeticException e) {
			System.out.println("Some problem 1...cannot divide by zero.....");
		}
		
		MyCalculator.divide(410,8);
		
		
		
		try
		{
			MyCalculator.divide(167,0);
		}
		catch(ArithmeticException e) {
			System.out.println("Some problem 2...cannot divide it by zero.....");
		}
		
		System.out.println("End of main.....");
		
	}

}

class MyCalculator
{
	public static void divide(int x, int y) {
		
		System.out.println("x "+x);
		System.out.println("y "+y);
		System.out.println("Trying to divide "+x+" by "+y);
		int div = x / y; //our code/line is not prepared to catch the ArithmeticException
					//neither there is an error for such nor a mandate to catch it
		System.out.println("div is "+div);
		System.out.println("Division is over..");
		System.out.println("---------");
	}
}
/*

	when the value of y is 0
	then JVM does the following logic.
	
	
	
	ArithmeticException arithEx new ArithmeticException("/ by zero");
	throw arithEx;
	
	
	
	

*/