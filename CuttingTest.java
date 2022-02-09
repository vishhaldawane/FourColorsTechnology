
public class CuttingTest {

	public static void main(String[] args) {
	
		Cutting cutting = new Cutter("Blade");
		cutting.cut();
		
		Knife k = new Knife("CRKT Knife");
		Hacksaw hksaw = new Hacksaw("EAgle Hacksaw");
		Scissor sci = new Scissor("Tiger Steel Scissor");
		
	//	k.start();
	//	hksaw.start();
	//	sci.start();
		
		System.out.println("===================");
		
		Cutter cutter1 = new Cutter(k);
		cutter1.start();
		
		Cutter cutter2 = new Cutter(hksaw);
		cutter2.start();
		
		Cutter cutter3 = new Cutter(sci);
		cutter3.start();
		
	}

}

interface Cutting
{
	void cut();
}

class Cutter implements Cutting
{
	String cutterName;
	
	Cutting ref;
	
	Cutter() {
		
	}
	Cutter(String name) {
		cutterName=name;
	}
	
	Cutter(Cutting ref) {
		this.ref = ref;
	}
	
	public void cut()
	{
		System.out.println(cutterName+" Super Cutter is cutting....");
	}
	public void start() {
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
