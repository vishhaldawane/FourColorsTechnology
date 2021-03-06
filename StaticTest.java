
public class StaticTest {
	public static void main(String[] args) {
		
		Kite.showKiteCount(); // static data/function can be referred by the Class's Name
		
		Kite kite1 = new Kite("Rajashri",50,"Red",true);
		Kite kite2 = new Kite("Dhanashree",70,"Green",true);
		Kite.showKiteCount();
		
		Kite kite3 = new Kite("Gayatri",40,"Magenta",true);
		Kite kite4 = new Kite("Bhakti",60,"Pink",true);	
		Kite.showKiteCount();
		
		
		Kite kite5 = new Kite("Pooja",80,"White",true);
		Kite.showKiteCount();
		
	
		kite1.kiteFight(kite2);
		
		
		Kite.showKiteCount();
		
	}
}

class Kite
{
	void kiteFight(Kite refToKite) { //refToKite is a proxy to kite2 for line 13
		System.out.println(kiteColour+" color kite  is trying to have kite fight with "+refToKite.kiteColour+" color kite");
		
	
		for(int i=1;i<=20;i++) {
			double num = Math.random(); //generate a number between 0 to 1
			System.out.println("Kite fight is going on ....."+i+" seconds..."+num);
			if(num > 0.98) {
				--kiteCount;
				refToKite.flyingStatus=false;
				System.out.println(refToKite.kiteColour+" kite is down...");
				break;
			}
			else if(num < 0.18) {
				--kiteCount;
				flyingStatus=false;
				System.out.println(kiteColour+" kite is down...");
				break;
			}
			else if (num >= 0.65 && num<=0.70) {
				--kiteCount;
				--kiteCount;
				refToKite.flyingStatus=false;
				flyingStatus=false;
				System.out.println(kiteColour+" kite is down...");
				System.out.println(refToKite.kiteColour+" kite is down...");
				break;
			}
			else {
				System.out.println("No kite is down...");
			}
			
		}
	
	}
	void flying() {
		System.out.println(kiteOwner+" is flying this kite!!!");
	}
	private static  int    kiteCount; //class's data | sharable data
	
	public  static  void showKiteCount() {
		System.out.println("Total kites in the sky : "+kiteCount);
	}
	
	private         String kiteOwner; //instance's data | non-sharable data
	private         int    kiteLength;
	private         String kiteColour;
	private        boolean flyingStatus;

	public Kite(String kiteOwner, int kiteLength, String kiteColour, boolean flyingStatus) {
		super();
		this.kiteOwner = kiteOwner;
		this.kiteLength = kiteLength;
		this.kiteColour = kiteColour;
		this.flyingStatus = flyingStatus;
		++kiteCount;
	}

	@Override
	public String toString() {
		return "Kite [kiteOwner=" + kiteOwner + ", kiteLength=" + kiteLength + ", kiteColour=" + kiteColour
				+ ", flyingStatus=" + flyingStatus + "]";
	}

}


/*

					Sky
					
kiteCount					kite2 <-green
	2			            |70
				  <--flying |		kite3	
				kite1 <--Red| color	  |		kite3 <-yellow
				|			|		  |		|<-40
				|<-50 length|	 Gayatri	|			kite5 <-- white
				|			|	+-------+	|			|<--60
			Rajashri<-Owner	|	|		|	|			|
			---------		|	|		| Bhakti		|
	Sumit	|		|Dhanashree	|		|-----------+	|
	--------|		|-----------|		|			|Pooja
	|		|		|			|		|			|-------+				
	|		|		|			|		|			|		|			
			Land here.....
	
	showKiteCount() {
		sop(kiteCount);
	}
	
													sharable data
	OBJECT's DATA				vs				CLASS's DATA [ static data ]
	---------------
	owner										kiteCount
	color
	length
	flying

*/