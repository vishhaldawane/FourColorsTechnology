package com.fourcolours;
public class DataTypes {
	public static void main(String[] args) {
		
		byte rollNumber = 23; // wrapper class as Byte
		
		System.out.println("roll number is      : "+rollNumber);
		System.out.println("Size value for byte : "+Byte.SIZE+" bits");
		System.out.println("Min value for byte  : "+Byte.MIN_VALUE);
		System.out.println("Max value for byte  : "+Byte.MAX_VALUE);
		
		short collegeRollNumber = 9823; // wrapper class as Short
		
		System.out.println("\ncollegeRollNumber number is      : "+collegeRollNumber);
		System.out.println("Size value for short : "+Short.SIZE+" bits");
		System.out.println("Min value for short  : "+Short.MIN_VALUE);
		System.out.println("Max value for short  : "+Short.MAX_VALUE);
		
		int universityRollNumber = 1234123412; // wrapper class as Integer
		
		System.out.println("\nuniversityRollNumber number is      : "+universityRollNumber);
		System.out.println("Size value for int : "+Integer.SIZE+" bits");
		System.out.println("Min value for int  : "+Integer.MIN_VALUE);
		System.out.println("Max value for int  : "+Integer.MAX_VALUE);
		
		long socialSecurityNumber = 12341234122L; // wrapper class as Long
		
		System.out.println("\nroll number is      : "+socialSecurityNumber);
		System.out.println("Size value for long : "+Long.SIZE+" bits");
		System.out.println("Min value for long  : "+Long.MIN_VALUE);
		System.out.println("Max value for long  : "+Long.MAX_VALUE);	
		
		float interestRate = 3.5f; // wrapper class as Float
		
		System.out.println("\ninterestRate  is   : "+interestRate);
		System.out.println("Size value for Float : "+Float.SIZE+" bits");
		System.out.println("Min value for Float  : "+Float.MIN_VALUE);
		System.out.println("Max value for Float  : "+Float.MAX_VALUE);
		
		double molecularDistance = 0.00045; // wrapper class as Double
		
		System.out.println("\nmolecularDistance is : "+molecularDistance);
		System.out.println("Size value for Double : "+Double.SIZE+" bits");
		System.out.println("Min value for Double  : "+Double.MIN_VALUE);
		System.out.println("Max value for Double  : "+Double.MAX_VALUE);
		
		char answer = 'Y';
		System.out.println("\nanswer           is    : "+answer);
		System.out.println("Size value for Character : "+Character.SIZE+" bits");
		System.out.println("Min value for Character  : "+Character.MIN_VALUE);
		System.out.println("Max value for Character  : "+Character.MAX_VALUE);
		for(int i=0;i<=255;i++) {
			System.out.println(i +" value is ["+(char)i+"]");
		}
		
		boolean employed = true; //default is false
		System.out.println("\nemployed           is  : "+employed);
		System.out.println("Type for Boolean   : "+Boolean.TYPE);
	
		if(employed) {
			System.out.println("wow, you got a job");
		}
		else {
			System.out.println("oh...still searching the job...");
		}
		
		
	}
}	
