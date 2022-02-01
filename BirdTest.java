
public class BirdTest {
	public static void main(String[] args) {
		
		Bird bird = new Bird();
		bird.fly();
		bird.layEggs();
		
		System.out.println("----");
		
		Bird sparrow = new Bird(40);
		sparrow.fly();
		
		System.out.println("----");
		
		Bird crow = new Bird(10,20,40);
		crow.fly();
		
		System.out.println("----");
		
		Bird parrot = new Bird(50,60);
		parrot.fly();
		
		System.out.println("----");
		
		Bird swan = new Bird(5.6f,90);
		swan.fly();
		

		System.out.println("----");
		
		Bird dove = new Bird(45,55.2f);
		dove.fly();
		
		System.out.println("----");
		
		Bird peacock = new Bird(4.5f);
		peacock.fly();
		
		
	}
}

class Bird
{
	Bird() {
		System.out.println("Bird()..explicit no-arg.constructor....");
	}
	Bird(int i) { // count of argument is 1, but type of argument is int
		System.out.println("Bird(int)...constructor....");
	}
	
	Bird(float f) {// count of argument is 1, but type of argument is float
		System.out.println("Bird(float)...constructor....");
	}
	
	Bird(int i, int j) {// count of argument is 2, argument type is int
		System.out.println("Bird(int,int)...constructor....");
	}
	
	Bird(int i, int j, int k) {// count of argument is 3 although type is int
		System.out.println("Bird(int,int,int)...constructor....");
	}
	Bird(int i, float j) { // count of argument is 2, type is same, but sequence is different
		System.out.println("Bird(int,float)...constructor....");
	}
	Bird(float i, int j) {// count of argument is 2, type is same, but sequence is different
		System.out.println("Bird(float,int)...constructor....");
	}
	void fly() {
		System.out.println("Bird is flying....");
	}
	
	void layEggs() {
		System.out.println("Bird is laying eggs.....");
	}
}