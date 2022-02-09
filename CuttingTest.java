
public class CuttingTest {

	public static void main(String[] args) {
	
		Cutting cutting = new Cutter("Blade");
		cutting.cut();
		
		Knife k = new Knife("CRKT Knife");
		k.start();
		
		Hacksaw hksaw = new Hacksaw("EAgle Hacksaw");
		hksaw.start();
		
		Scissor sci = new Scissor("Tiger Steel Scissor");
		sci.start();
		
	//	k.start();
	//	hksaw.start();
	//	sci.start();
		
		System.out.println("===================");
		
	
		
		Cutting cutting1 = new Knife("CRKT Knife");
		Cutter cutter1 = new Cutter(cutting1);
		cutter1.start();
		
		Cutting cutting2 = new Hacksaw("EAgle Hacksaw");
		Cutter cutter2 = new Cutter(cutting2);
		cutter2.start();
		
		Cutting cutting3 = new Scissor("Tiger Steel Scissor");	
		Cutter cutter3 = new Cutter(cutting3);
		cutter3.start();
		
		SteelRuler ruler = new SteelRuler();
		
		//ruler.start();
		
		Cutter  asACutter = new Cutter(ruler);
		asACutter.start();
	}

}

interface Cutting
{
	void cut();
}

class Cutter implements Cutting
{
	String cutterName;
	
	Cutting ref; // ref to Cutting is possible, pointing to null now...
	
	Cutter() {
		System.out.println("Cutter()......");
		ref=this;
	}
	Cutter(String name) {
		System.out.println("Cutter(String)......");
		cutterName=name;
		ref=this;
	}
	
	Cutter(Cutting ref) {
		System.out.println("Cutter(Cutting)......");
		this.ref = ref; //now pointing to any cutting implementations, cutters
	}
	
	public void cut() //MANDATE - implemented
	{
		System.out.println(cutterName+" Super Cutter is cutting....");
	}
	
	public void start() { //exclusive
		System.out.println("Take starting point to cut....");
		ref.cut();
		System.out.println("Finish at the ending point of cut....");
		System.out.println("------------------");
	}
}

class Knife extends Cutter
{
	Knife(String name) {
		super(name);
	}
	public void cut()
	{
		System.out.println(cutterName+" Child Cutter is cutting....");
	}
}
class Hacksaw extends Cutter
{
	Hacksaw(String name) {
		super(name);
	}
	public void cut()
	{
		System.out.println(cutterName+" Child Cutter is cutting....");
	}
}
class Scissor extends Cutter
{
	Scissor(String name) {
		super(name);
	}
	public void cut()
	{
		System.out.println(cutterName+" Child Cutter is cutting....");
	}
}

class SteelRuler implements Cutting
{
	public void cut() {
		System.out.println("Using the steel ruler to cut the paper...");
	}
}
