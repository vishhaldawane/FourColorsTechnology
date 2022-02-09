
public class ThreadPriorityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin main");

		//Thread.MIN_PRIORITY = 1
		//Thread.NORM_PRIORITY = 5
		//Thread.MAX_PRIORITY = 10
		
		Clicker clicker1 = new Clicker("Low");
		Clicker clicker2 = new Clicker("High");
		
		Thread t1 = new Thread(clicker1);
		Thread t2 = new Thread(clicker2);
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		
		t1.start();
		t2.start();
		
		try {
			System.out.println("Waiting for 5 seconds....");
			Thread.sleep(7000);
			clicker1.stop();
			clicker2.stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("End main");
		
	}

}

class Clicker implements Runnable
{
	volatile boolean isRunning=true;
	long value;
	String clickerName;
	
	Clicker(String name) {
		clickerName=name;
	}
	
	public void run() {
		System.out.println(clickerName+" thread Starting the loop....");
		while(isRunning) {
			++value; // CPU cache   vs 	the actual stack value 
		}
		System.out.println(clickerName+" thread Ending the loop...."+value);
	}
	
	public void stop() {
		isRunning=false;
	}
}