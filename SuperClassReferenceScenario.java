
public class SuperClassReferenceScenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doctor sharma = new Doctor();	
		Surgeon shah = new Surgeon();	
		HeartSurgeon kulkarni = new HeartSurgeon();
		
		MultiSpecialityHospital hospital = new MultiSpecialityHospital();
		hospital.scanBloodReport(sharma);
		
		hospital.scanCTReport(shah);
		
		hospital.scanECGReport(kulkarni);
		
	}

}

class MultiSpecialityHospital
{
	void scanBloodReport(Doctor x) {
		System.out.println("Scanning the blood report...by "+x.getClass().getName());
	}
	
	void scanCTReport(Surgeon y) {
		System.out.println("Scanning the CT report...by "+y.getClass().getName());
	}
	void scanECGReport(HeartSurgeon z) {
		System.out.println("Scanning the ECG report...by "+z.getClass().getName());
	}
	
}