public class WashingMachineTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		WashingMachine washMachine1 = new WashingMachine("YYT232","Tata Motor",21.3f,"LG","Top Load",9.0f,27000,3);
		washMachine1.washingTub.setWashingTub("Steel", 50);
		//System.out.println("Washing Machine : "+washMachine1);
			
		washMachine1.showWashingMachine();
		
		WashingPowder tide = new WashingPowder("Top Load", "Tide Lime","WhiteLemon",100.0f);
		
		washMachine1.wash(tide);
		
		
		if ( washMachine1 instanceof Machine ) {
			System.out.println("Yes, its a machine....");
		}
		else {
			System.out.println("It is not a machine...");
		}
		
		
		if ( washMachine1 instanceof WashingMachine ) {
			System.out.println("Yes, its a WashingMachine....");
		}
		else {
			System.out.println("It is not a WashingMachine...");
		}
		
		
		
	}
}

class Machine {
	private String machineId;	
	private String machineManufacturerName;
	private float machineVersion;
	
	public Machine() {
		System.out.println("Machine() constructor....");
	}
	public Machine(String machineId, String machineManufacturerName, float machineVersion) {
		super();
		System.out.println("Machine(String,String,float) constructor....");
		this.machineId = machineId;
		this.machineManufacturerName = machineManufacturerName;
		this.machineVersion = machineVersion;
	}
	
	public void setMachine(String machineId, String machineManufacturerName, float machineVersion) {
		System.out.println("setMachine(String,String,float) constructor....");
		this.machineId = machineId;
		this.machineManufacturerName = machineManufacturerName;
		this.machineVersion = machineVersion;
	}
	

	public String getMachineId() {
		return machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}

	public String getMachineManufacturerName() {
		return machineManufacturerName;
	}

	public void setMachineManufacturerName(String machineManufacturerName) {
		this.machineManufacturerName = machineManufacturerName;
	}

	public float getMachineVersion() {
		return machineVersion;
	}

	public void setMachineVersion(float machineVersion) {
		this.machineVersion = machineVersion;
	}

	@Override
	public String toString() {
		return "Machine [machineId=" + machineId + ", machineManufacturerName=" + machineManufacturerName
				+ ", machineVersion=" + machineVersion + "]";
	}

	void showMachine() {
		System.out.println("Machine id           : "+machineId);
		System.out.println("Machine Manufacturer : "+machineManufacturerName);
		System.out.println("Machine version      : "+machineVersion);
		System.out.println("---------------");
	}
}

class Tub
{

}
class BathingTub extends Tub {
	
}

class WashingTub extends Tub //isA
{
	String type; //steel, plastic/fibre
	int waterCapacity; // 30ltr 50 ltr 70ltrs
	
	WashingTub() {
		
	}
	
	public WashingTub(String type, int waterCapacity) {
		super();
		this.type = type;
		this.waterCapacity = waterCapacity;
	}
	
	public void setWashingTub(String type, int waterCapacity) {
		this.type = type;
		this.waterCapacity = waterCapacity;
	}
	
	void showWashingTub() {
		System.out.println("Washing Tub Type : "+type);
		System.out.println("Washing Tub Water capacity : "+waterCapacity);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWaterCapacity() {
		return waterCapacity;
	}

	public void setWaterCapacity(int waterCapacity) {
		this.waterCapacity = waterCapacity;
	}
	
	
}

class Powder {
	
}
class WashingPowder extends Powder //isA
{
	String type; // frontload, topload
	String brand;
	String color;
	float  weight;
	
	public WashingPowder(String type, String brand, String color, float weight) {
		super();
		this.type = type;
		this.brand = brand;
		this.color = color;
		this.weight = weight;
	}
	public void setWashingPowder(String type, String brand, String color, float weight) {
		
		this.type = type;
		this.brand = brand;
		this.color = color;
		this.weight = weight;
	}
	void showWashingPowder() {
		System.out.println("Washing Powder Type   : "+type);
		System.out.println("Washing Powder brand  : "+brand);
		System.out.println("Washing Powder color  : "+color);
		System.out.println("Washing Powder Weight : "+weight);
		System.out.println("------------------");
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	
}


class WashingMachine extends Machine //isA
{
	String brandName; // whirlpool, LG, Samsung ....
	float  capacity; // in 6Kg, 9.0KG
	float  cost;
	String type;
	int    warranty;
	WashingTub  washingTub = new WashingTub(); //hasA
	
	public WashingMachine(String machineId, String machineManufacturerName, float machineVersion, String brandName,
			String type, float capacity, float cost, int warranty) {
		super(machineId, machineManufacturerName, machineVersion);
		this.brandName = brandName;
		this.capacity = capacity;
		this.cost = cost;
		this.warranty = warranty;
		this.type = type;
	}
	
	/*Laundry*/ void wash(WashingPowder washPowder/*, Electricity elect, Water wat, Cloth clot */) { // what if the electricity goes off..... exception handling....

		//electricity information is missing
		//water supplier info is missing..
		//cloth info is missing...
		
		System.out.println("Washing the clothes...using...Brand:"+washPowder.getBrand()+", Type:"+washPowder.getType()+" powder of "+washPowder.getColor()+" color and amount of powder is "+washPowder.getWeight()+" grams");
		for (int i = 1; i <= 30; i++) {
			System.out.println("Washing for ...."+i+" Minutes...");
		}
		for (int i = 1; i <= 5; i++) {
			rinse();
		}
		for (int i = 1; i <= 5; i++) {
			spin();
		}
		sanitization();
		tubClean();
	}
	private void rinse() {
		System.out.println("rinsing......");
	}
	private void spin() {
		System.out.println("spinning....");
	}
	private void tubClean() {
		System.out.println("Cleaning the tub....");
	}
	private void sanitization() {
		System.out.println("Sanitizing.....");
	}

	@Override
	public String toString() {
		return "WashingMachine [toString()=" + super.toString() + ", brandName=" + brandName + ", capacity=" + capacity
				+ ", cost=" + cost + ", warranty=" + warranty + "]";
	}
	
	void showWashingMachine() {
		super.showMachine();
		System.out.println("Machine Brand        : "+brandName);
		System.out.println("Machine Type         : "+type);
		System.out.println("Machine Capacity     : "+capacity+" Kg");
		System.out.println("Machine Cost         : Rs."+cost);
		System.out.println("Machine Warranty     : "+warranty+" Years");
		System.out.println("---------------");
		washingTub.showWashingTub();
	}
	
	
}













 