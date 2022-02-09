
public class ThreadSyncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savObj = new SavingsAccount(101,"Jack",50000);
		System.out.println("savObj : "+savObj);
		
		DepositTeller depositTeller1 = new DepositTeller("Janet",savObj,5000); //I.c
		DepositTeller depositTeller2 = new DepositTeller("\tJulie",savObj,7000);//I.c
		DepositTeller depositTeller3 = new DepositTeller("\t\tSimran",savObj,8000);//I.c
		
		
		depositTeller1.start(); //it would perform thread initialization logic..blaa bla bla ...run();
		depositTeller2.start(); //it would perform thread initialization logic..blaa bla bla ...run();
		depositTeller3.start(); //it would perform thread initialization logic..blaa bla bla ...run();
		
		
		
		try {
			depositTeller1.join();
			depositTeller2.join();
			depositTeller3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("OVER => savObj : "+savObj);

		
	}

}
class SavingsAccount
{
	int accountNumber;
	String accountHolder;
	double accountBalance;
	
	public SavingsAccount(int accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	//deposit method must permit ONLY one thread at a time to enter HERE
	
	public synchronized void deposit(String tn, double depositAmount) { 
		System.out.println(tn+" Finding current balance..from the DB..");
		double currentBalance = getAccountBalance(tn);
		System.out.println(tn+" Found current balance....from the DB..."+currentBalance);
		
		System.out.println(tn+"Calculating....new balance...counting currency..");
		double newBalance = currentBalance + depositAmount;
		System.out.println(tn+" Calculated....new balance....counted  currency..."+newBalance);
		
		System.out.println(tn+" Setting new balance to the DB....");
		setAccountBalance(tn,newBalance);
		System.out.println(tn+" Balance is commited to the DB...."+newBalance);
		System.out.println(tn+"-------------------------------------------");
	}
	private double getAccountBalance(String t) { // fetch data from DB - simulation as if 
		System.out.println(t+" <=...DB.(select)....");
		return accountBalance;
	}
	private void setAccountBalance(String t, double accountBalance) {
		System.out.println(t+" .....DB..(update)..=>");
		this.accountBalance = accountBalance;
	}

	
}


class DepositTeller extends Thread //I.a
{
	String tellerName;
	SavingsAccount savAccObjRef;
	double amountToDeposit;
	
	public DepositTeller(String tellerName,SavingsAccount ref, double amt) {
	
		this.tellerName = tellerName;
		savAccObjRef = ref;
		amountToDeposit = amt;
	}


	public void run() //I.b
	{
	//	System.out.println(tellerName+" depositing..."+amountToDeposit);
		savAccObjRef.deposit(tellerName,amountToDeposit);

	}

}












