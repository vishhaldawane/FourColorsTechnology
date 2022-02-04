


class BankAccount {
	int acno;
	String name;
	float balance;
	public BankAccount(int acno, String name, float balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", name=" + name + ", balance=" + balance + "]";
	}
}
interface Withdrawing {
	void withdraw(float amt);
}
interface Depositing {
	void deposit(float amt);
}

class SavingsAccount extends BankAccount implements Withdrawing, Depositing {
	float interest;

	public SavingsAccount(int acno, String name, float balance, float interest) {
		super(acno, name, balance);
		this.interest = interest;
	}

	

	@Override
	public String toString() {
		return "SavingsAccount [acno=" + acno + ", name=" + name + ", balance=" + balance + ", interest=" + interest
				+ "]";
	}



	@Override
	public void deposit(float amt) {
		balance = balance + amt;
		
	}

	@Override
	public void withdraw(float amt) {
		balance = balance - amt;
		
	}
	
	
}

class CurrentAccount extends BankAccount implements Withdrawing, Depositing
{
	float overDraft;

	public CurrentAccount(int acno, String name, float balance, float overDraft) {
		super(acno, name, balance);
		this.overDraft = overDraft;
	}

	
	
	@Override
	public String toString() {
		return "CurrentAccount [acno=" + acno + ", name=" + name + ", balance=" + balance + ", overDraft=" + overDraft
				+ "]";
	}



	@Override
	public void deposit(float amt) {
		balance = balance + amt;
		
	}

	@Override
	public void withdraw(float amt) {
		balance = balance - amt;
		
	}
	
}
//Chess chess = new GraphicalChess

//Doctor sharma = new HeartSurgen();

public class FundsTransferTest {
	public static void main(String[] args) {
		Depositing fourColoursAcc = new CurrentAccount(101, "Four Colours", 100000, 0.25f);

		Withdrawing savAccVaibhav = new SavingsAccount(110, "Vaibhav", 5000,3.5f);
		
		
		System.out.println("Four Colours acc : "+fourColoursAcc);
		System.out.println("Vaibhav acc      : "+savAccVaibhav);
						
		
		float salaryToVaibhav=3000; //think + feel = action + result

		System.out.println("Transferring the amount.....");
		fourColoursAcc.deposit(salaryToVaibhav); // source | withraw
		savAccVaibhav.withdraw(salaryToVaibhav); // target | deposit | beneficiary
		System.out.println("Transferred.......");

		System.out.println("Four Colours acc : "+fourColoursAcc);
		System.out.println("Vaibhav acc      : "+savAccVaibhav);

		
		
	}
}







