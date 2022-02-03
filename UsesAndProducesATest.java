
class Guitar { }

public class UsesAndProducesATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		GeerCow  gc = new GeerCow();
			
		Grass sugarGrass = new Grass(3,"pale green","Sugarcane");
		Grass cornGrass  = new Grass(2,"dark green","Corn");
		
		Water water1 = new Water(12, "Hard", "Warm"); //UDT
		Water water2= new Water(6, "Soft", "Normal");
		
		Milk milk = gc.milkACow(cornGrass, water1); //passing object as an Argument 
		
		Curd curd = milk.coagulated();
		
		System.out.println("Curd : "+curd);
		
		Butter butter = curd.churn(); 
		
		System.out.println("butter : "+butter);
		
		ClarifiedButter pureGhee = butter.boil();
		
		System.out.println("Pure Ghee : "+pureGhee);
		
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
	public int getWeightInKg() {
		return weightInKg;
	}
	public void setWeightInKg(int weightInKg) {
		this.weightInKg = weightInKg;
	}
	public String getColorOfGrass() {
		return colorOfGrass;
	}
	public void setColorOfGrass(String colorOfGrass) {
		this.colorOfGrass = colorOfGrass;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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

	public int getWaterInLtr() {
		return waterInLtr;
	}

	public void setWaterInLtr(int waterInLtr) {
		this.waterInLtr = waterInLtr;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	
	
}

class GeerCow extends Cow // isA Cow - structural
{
	Hump hump = new Hump();//hasA it can communicate with Sun rays - structural
	
	Milk milkACow(Grass g, Water w) { //operational 
		System.out.println("Cow is eating the "+g.getType()+" type ,"+g.getColorOfGrass()+" grass");
		
		System.out.println("Cow is drinking "+w.getWaterInLtr()+" ltr water of type "+w.getType()+", of temperature "+w.getTemperature());
		
		//it can be calculated based on grass anf water type,qty etc
		Milk milk=null;  //just a referece
		
		if(w.getWaterInLtr()>10 && g.getType().equals("Sugarcane"))
			milk = new Milk(5,"OffWhite","Thin","10 degree");
		
		else if(w.getWaterInLtr()>10 && g.getType().equals("Corn"))
			milk = new Milk(5,"OffWhite","Thick","5 degree");
		
		else if(w.getWaterInLtr()>5 && g.getType().equals("Sugarcane"))
			milk = new Milk(3,"OffWhite","Thin","7 degree");
		
		else if(w.getWaterInLtr()>5 && g.getType().equals("Corn"))
			milk = new Milk(3,"OffWhite","Thick","5 degree");
		
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
	
	Curd coagulated() {
		Curd curd = null;
		
		System.out.println(quantityInLtr+" ltr Milk is being coagulated....");
		if(quantityInLtr==5 && density.equals("Thick"))
			curd = new Curd("Thick",4.0f);
		else if(quantityInLtr==3 && density.equals("Thick"))
			curd = new Curd("Thick",2.0f);
		
		if(quantityInLtr==5 && density.equals("Thin"))
			curd = new Curd("Thin",3f);
		else if(quantityInLtr==3 && density.equals("Thin"))
			curd = new Curd("Thin",1.0f);
		
			
		return curd;
	}
}

class Curd 
{
	String density;
	float  weight;
	
	public Curd(String density, float weight) {
		super();
		this.density = density;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Curd [density=" + density + ", weight=" + weight + " kg]";
	}
	
	Butter churn() {
		Butter butter = null;
		if(weight == 4) {
			butter = new Butter("White",1.0f);
		}
		else if(weight == 8) {
			butter = new Butter("White",2.0f);
		} 
		
		return butter; //return promise
	}
	
}
class Butter
{
	String color;
	float  weight;
	public Butter(String color, float weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Butter [color=" + color + ", weight=" + weight + " kg]";
	}
	
	ClarifiedButter boil() {
		ClarifiedButter desiGhee = null;
		
		if(weight == 1.0) {
			desiGhee  = new ClarifiedButter("Yellow", weight/2);
		}
		else if(weight == 2.0) {
			desiGhee  = new ClarifiedButter("Yellow", weight/2);
		}

		return desiGhee;
	}
}

class ClarifiedButter
{
	String color;
	float weight;
	public ClarifiedButter(String color, float weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "ClarifiedButter [color=" + color + ", weight=" + weight + "]";
	}
	
	
	
}
