
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Begin of main....");
		Bike bike= new Bike();
		Bike bike2= new Bike();
		
		Car car = new Car();
		Car car2 = new Car();
		
		Bus bus = new Bus();
		Bus bus2 = new Bus();
		
		
		System.out.println("bike thread name : "+bike.getName());
		System.out.println("bike2 thread name : "+bike2.getName());

		
		System.out.println("car  thread name : "+car.getName());
		System.out.println("car2  thread name : "+car2.getName());

		System.out.println("bus2  thread name : "+bus2.getName());
		System.out.println("bus  thread name : "+bus.getName());

		
		System.out.println("is bike thread alive? : "+bike.isAlive());
		System.out.println("is car  thread alive? : "+car.isAlive());
		System.out.println("is bus  thread alive? : "+bus.isAlive());

		
		bike.start(); //->run();
		bike2.start(); //->run();

		
		car.start(); //->run();
		car2.start(); //->run();
		
		bus.start(); //->run();
		bus2.start(); //->run();
		
		System.out.println("=== AFTER START ===");
		
		System.out.println("is bike thread alive? : "+bike.isAlive());
		System.out.println("is car  thread alive? : "+car.isAlive());
		System.out.println("is bus  thread alive? : "+bus.isAlive());

		
		try {
			System.out.println("Waiting for all these 3 threads to die...");
			bike.join(); //Waits for this thread to die.
			car.join(); //Waits for this thread to die.
			bus.join(); //Waits for this thread to die.
			System.out.println("All these 3 threads are over...now....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("is bike thread alive? : "+bike.isAlive());
		System.out.println("is car  thread alive? : "+car.isAlive());
		System.out.println("is bus  thread alive? : "+bus.isAlive());

		
		System.out.println("End of main...");
	}

}// ILF - TRAINING WORK FORCE MANAGEMENT 

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