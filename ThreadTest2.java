
public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck truck = new Truck(); //II.c
		Taxi taxi = new Taxi();
		Jeep jeep = new Jeep();
		
		Thread t1 = new Thread(truck); //II.d truck is Runnable's child
		Thread t2 = new Thread(taxi); //taxi is Runnable's child
		Thread t3 = new Thread(jeep); //jeep is Runnable's child
		
		t1.start(); //II.e  -> run();
		t2.start();
		t3.start();
		
	}

}
class Truck implements Runnable //II.a it doesnot have start()
{
	public void run() { //II.b its a  mandate
		for(int i=1;i<100;i++) {
			System.out.println("Truck completed..."+i+" kms");
		}
	}
}

class Taxi implements Runnable  // it doesnot have start()
{
	public void run() { //its a  mandate
		for(int i=1;i<100;i++) {
			System.out.println("\tTaxi completed..."+i+" kms");
		}
	}
}

class Jeep implements Runnable  // it doesnot have start()
{
	public void run() { //its a  mandate
		for(int i=1;i<100;i++) {
			System.out.println("\t\tJeep completed..."+i+" kms");
		}
	}
}