public class WashingMachineTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Machine machine1 = new Machine("YYT232","Tata",21.3f);
		Machine machine2 = new Machine("5RT232","SAmsung",2.3f);
		Machine machine3 = new Machine("A7T232","Leveno",4.3f);
		
		System.out.println("Machine number1 : "+machine1.getMachineId());
		System.out.println("Machine number2 : "+machine2.getMachineId());
		System.out.println("Machine number3 : "+machine3.getMachineId());
		
		System.out.println("Machine maker1 : "+machine1.getMachineManufacturerName());
		System.out.println("Machine maker2 : "+machine2.getMachineManufacturerName());
		System.out.println("Machine maker3 : "+machine3.getMachineManufacturerName());
		
		System.out.println("machine1 version "+machine1.getMachineVersion());
		System.out.println("machine2 version "+machine2.getMachineVersion());
		System.out.println("machine3 version "+machine3.getMachineVersion());
		
		
		System.out.println("machine1 : "+machine1); // this + is calling the toString() function of your object
		System.out.println("\nmachine2 : "+machine2);
		System.out.println("\nmachine3 : "+machine3);	
		
		
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

/*
  
*/
 