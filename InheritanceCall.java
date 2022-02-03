
public class InheritanceCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doctor refToDoctor = new Doctor();
		
		refToDoctor.diagnose(); // diagnose of Doctor - compile time binding - eager loading
		
		
		Surgeon refToSurgeon = new Surgeon();
		refToSurgeon.diagnose(); // diagnose of Surgeon - compile time binding - eager 
		refToSurgeon.doSurgery();
		
		
		HeartSurgeon refToHeartSurgeon = new HeartSurgeon();
		refToHeartSurgeon.diagnose();//diagnose of HeartSurgeon - compile time binding - eager
		refToHeartSurgeon.doSurgery();
		refToHeartSurgeon.doHeartSurgery();
		
		System.out.println("=============");
		
		
		//ealry(compiletime) binding    vs   late (runtime) binding
		//eager loading					vs	 lazy loading
		
		refToDoctor = new Doctor();
		refToDoctor.diagnose(); // binding is with Doctor's diagnose
		//but then it would be bound with Doctor at the runtime - lazy loading
		
		refToDoctor = new Surgeon(); //how come it is possible????
		refToDoctor.diagnose();  // binding is with Doctor's diagnose
		//but then it would be bound with Surgeon at the runtime - lazy loading
	//	refToDoctor.doSurgery();
		
		refToDoctor = new HeartSurgeon();
		refToDoctor.diagnose();  // binding is with Doctor's diagnose
		//but then it would be bound with HeartSurgeon at the runtime - lazy loading
	//	refToDoctor.doHeartSurgery();
		
		//super class reference although it can point to the child class object
		// it only can   invoke the overridden methods of the child via this reference
		
	}

}

class Doctor
{
	void diagnose() {
		System.out.println("Doctor: diagnosing.... EENTT....");
	}
}

class Surgeon extends Doctor
{
	void diagnose() { //inherited-cum-overriding
		System.out.println("Surgeon: diagnosing.... EENTT..CT Scan report..");
	}
	void doSurgery() { //exclusive
		System.out.println("Surgeon: Surgeon is doing surgery....");
	}
}

class HeartSurgeon extends Surgeon
{
	void diagnose() { //inherited-cum-overriding
		System.out.println("HeartSurgeon: diagnosing.... EENTT..CT Scan report.. ECG report");
	}
	void doHeartSurgery() { //exclusive
		System.out.println("HeartSurgeon: HeartSurgeon is doing heart surgery....");
	}
}