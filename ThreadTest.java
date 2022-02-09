
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike bike= new Bike();
		Car car = new Car();
		Bus bus = new Bus();
		
		bike.start(); //->run();
		car.start(); //->run();
		bus.start(); //->run();
	}

}

class Bike extends Thread 
{
	public void run() { //overridden - not a mandate
		for(int i=1;i<100;i++) {
			System.out.println("Bike completed..."+i+" kms");
		}
	}
}

class Car extends Thread 
{
	public void run() { //overridden - not a mandate
		for(int i=1;i<100;i++) {
			System.out.println("\tCar completed..."+i+" kms");
		}
	}
}

class Bus extends Thread 
{
	public void run() { //overridden - not a mandate
		for(int i=1;i<100;i++) {
			System.out.println("\t\tBus completed..."+i+" kms");
		}
	}
}