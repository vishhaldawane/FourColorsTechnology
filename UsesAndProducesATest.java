
class Guitar { }

public class UsesAndProducesATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Horn h = new Horn();
		
		Milk m = new Milk(2,"White","Thick","-3 degree");
			
		GeerCow  gc1 = new GeerCow();
		GeerCow  gc2 = new GeerCow();
		GeerCow  gc3 = new GeerCow();
		
		Grass sugarGrass = new Grass(3,"pale green","Sugarcane");
		Grass cornGrass  = new Grass(2,"dark green","Corn");
		
		Water water1 = new Water(2, "Hard", "Warm"); //UDT
		Water water2= new Water(1, "Soft", "Normal");
		
		Milk milk1 = gc1.milkACow(sugarGrass, water1); //passing object as an Argument 
		
		System.out.println("--------------");
		
		Milk milk2 = gc2.milkACow(cornGrass, water2);
		
		System.out.println("--------------");
		
		Milk milk3 = gc3.milkACow(sugarGrass, water2);
		
		milk1.showMilk();
		milk2.showMilk();
		milk3.showMilk();
		
		/*
		System.out.println("ltr 1 "+ltr1);
		System.out.println("ltr 2 "+ltr2);
		System.out.println("ltr 3 "+ltr3);
		*/
		
	}

}
//isA  hasA   usesA  producesA

class Mammal
{
	
}

class Horn
{
	
}
class Cow extends Mammal //isA Mammal
{
	Horn leftHorn = new Horn(); //hasA
	Horn rightHorn = new Horn(); //hasA
	
	
}

class Hump 
{
	void communicateWithSunRays() {
		System.out.println("Hump is used to recieve run rays...");
	}
}

class Grass
{
	int weightInKg;
	String colorOfGrass;
	String type;
	
	public Grass(int weightInKg, String colorOfGrass, String type) {
		super();
		this.weightInKg = weightInKg;
		this.colorOfGrass = colorOfGrass;
		this.type = type;
	}
	void showGrass() {
		System.out.println("Grass Weight : "+weightInKg);
		System.out.println("Grass Color  : "+colorOfGrass);
		System.out.println("Grass Type   : "+type);
	}
	
}
class Water
{
	int waterInLtr;
	String type;
	String temperature;
	
	public Water(int waterInLtr, String type, String temperature) {
		super();
		this.waterInLtr = waterInLtr;
		this.type = type;
		this.temperature = temperature;
	}
	
	void showWater() {
		System.out.println("Water level : "+waterInLtr);
		System.out.println("Water type  : "+type);
		System.out.println("Water temp  : "+temperature);
		
	}
}

class GeerCow extends Cow // isA Cow - structural
{
	Hump hump = new Hump();//hasA it can communicate with Sun rays - structural
	
	Milk milkACow(Grass g, Water w) { //operational 
		System.out.println("Cow is eating the grass....");
		g.showGrass();
		System.out.println("Cow is drinking the water....");
		w.showWater();
		//it can be calculated based on grass anf water type,qty etc
		Milk milk = new Milk(5,"OffWhite","Thin","3 degree");
		return milk;
	}
	
}

class Milk
{
	int quantityInLtr;
	String color;
	String density;
	String temperature;
	
	Milk() { }
	
	
	public Milk(int quantityInLtr, String color, String density, String temperature) {
		super();
		this.quantityInLtr = quantityInLtr;
		this.color = color;
		this.density = density;
		this.temperature = temperature;
	}
	
	void showMilk() {
		System.out.println("Milk quantity : "+quantityInLtr);
		System.out.println("Milk color    : "+color);
		System.out.println("Milk density  : "+density );
		System.out.println("Milk temp     : "+temperature );
		System.out.println("-----");
		
	}
}
