package com.fourcolours;

public class FunctionType {

	public static void main(String[] args) {
		System.out.println("begin main...");
		
		//there are only four types of function
		
		Calculator myCalci = new Calculator();
		
		myCalci.addTwoNumbers();
		myCalci.addTwoNumbers(20,30);
		myCalci.addTwoNumbers(50,80);
		
		float ans = myCalci.findAverage(45, 55, 77);
		System.out.println("the average is "+ans);
		
		float ans2 = myCalci.findAverage(445, 555, 767);
		System.out.println("the average is "+ans2);
		
		double distanceBetweenSunAndEarth = myCalci.calculateTheDistanceBetweenTheEarthAndTheSun();
		System.out.println("distance is "+distanceBetweenSunAndEarth);
	}

}
//u can return only one value , although u can pass many argument values
class Calculator
{
	void addTwoNumbers() { //1st
		System.out.println("function without argument and without return");
		int i=100; //local variables here
		int j=200;
		
		int k = i + j ;
		System.out.println("k "+k);
	}
	void addTwoNumbers(int i, int j) { //2nd, local variables on the argument list
		System.out.println("function with argument and without return value");
		int k = i + j ;
		System.out.println("k "+k);
	}
	float findAverage(int i, int j, int k) { //3rd, local variables on the argument list
		System.out.println("function with argument and with return value");
		float a = (i + j + k ) / 3.0f ;
		return a; //dont print it here, rather return it (where to return?) to the invoker!!!
	}
	
	double calculateTheDistanceBetweenTheEarthAndTheSun()
	{
		float sunLightTimeToReachOnEarth=8.3f*60; //8 mnts 3 seconds
		float speedOfTheLight=186000.519f; // miles per second
		double distance =  (sunLightTimeToReachOnEarth * speedOfTheLight) * 1.69;
		return distance;
	}
}

/*
 * 
 * 		Purpose of function / method
 * 
 * 				- is to do a specific task
 * 				- re use it 
 * 
 * 				returnType	functionName(arguments to pass here)
 * 				{
 * 						code to do a specific task
 * 
 * 				}
 * 
 * 				float   calculateAverage(int i, int j, int k) // formal parameters/arguments
 * 				{
 * 					float average = (i+j+k) / 3.0f;
 * 					return average; 
 * 				}
 * 
 * 				float avg  = calculateAverage(10,20,30); //10,20,30 actual parameters/arguments
 * 				float avg1 = calculateAverage(210,230,304); 
 * 				float avg2 = calculateAverage(107,520,630); 
 * 				float avg3 = calculateAverage(810,920,730); 
 * 
 * 		1. function/method without arguments and without return value
 * 
 * 					void functionName()
 * 					{
 * 					}
 * 
 * 		2. function/method with arguments and without return value
 * 
 * 					void functionName(int i, int j )
 * 					{
 * 						code to deal with i and j
 * 					}
 * 
 * 		3. function/method with arguments and with return value
 * 
 * 					float functionName(int i, int j, int k )
 * 					{
 * 						code to deal with i and j and k
 * 						return float type of value here
 * 					}
 *		4. function/method without arguments But with return value
 *					float functionName() {
 *						return float type of value
 *					}
 *
 * 
 */
