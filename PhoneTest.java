package com.fourcolours;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone = new Phone();
		myPhone.dial();
		
		byte police=100;
		byte fireBrigade=101;
		byte ambulance=102;
		
		myPhone.dial(police);
		
		short securityGate=1234;
		myPhone.dial(securityGate);
		
		String str="Anjali";
		myPhone.dial(str);
		
		byte std=22;
		long landLine=63343464;
		
		myPhone.dial(std,landLine);
		
		myPhone.dial(landLine,std);
		
		
				
		
	}

}

class Phone
{
	
	void dial() {
		System.out.println("dial() .... dialing...nowhere...");
	}
	
	void dial(byte number) {
		System.out.println("dial(byte) ...dialing...."+number);
	}
	void dial(short number) {
		System.out.println("dial(short) ...dialing...."+number);
	}
	void dial(String name) {
		System.out.println("dial(String) ...dialing...."+name);
	}
	
	void dial(byte stdCode, long number) {
		System.out.println("dial(byte,long) ...dialing....("+stdCode+")"+number);
	}
	void dial(long number,byte stdCode) {
		System.out.println("dial(long,byte) ...dialing....("+stdCode+")"+number);
	}
	
}



