package com.fourcolours;

public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savObj1 = new SavingsAccount();
		
		savObj1.setInitialValues(101, "Jack",50000);
		savObj1.showAccountDetails();
		
		savObj1.deposit(5000);
		savObj1.showAccountDetails();
		
		savObj1.withdraw(3000);
		savObj1.showAccountDetails();
		
		savObj1.withdraw(1000);
		savObj1.showAccountDetails();
		
		savObj1.deposit(9000);
		savObj1.showAccountDetails();
		
		SavingsAccount savObj2 = new SavingsAccount();
		
		savObj2.setInitialValues(102, "Smith",70000);
		savObj2.showAccountDetails();
		
		savObj2.deposit(5000);
		savObj2.showAccountDetails();
		
		SavingsAccount savObj3 = new SavingsAccount();
		
		savObj3.setInitialValues(103, "Julie",90000);
		savObj3.showAccountDetails();
		
		savObj3.deposit(8000);
		savObj3.showAccountDetails();
		
		
	}

}

class SavingsAccount
{
	//DATA MEMBER SECTION
	private int accountNumber; // DATA member
	private String accountHolderName; // DATA member
	private double accountBalance; // DATA member
	
	//MEMBER METHOD SECTION   local var     local var  local  var
	void setInitialValues(int acno, String acHolder, double acbal) {
		System.out.println("setting the initial account details...");
		accountNumber = acno; // set the local var to the DATA member 
		accountHolderName = acHolder;
		accountBalance = acbal;
	}
	
	void showAccountDetails() {
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Holder  : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("--------------------");
	}
	void deposit(double amountToDeposit) {
		System.out.println("Depositing $"+amountToDeposit+" for AcNo:"+accountNumber);
		accountBalance = accountBalance + amountToDeposit; 
	}
	
	void withdraw(double amountToWithdraw) {
		System.out.println("Withdrawing $"+amountToWithdraw+" for AcNo:"+accountNumber);
		accountBalance = accountBalance - amountToWithdraw; 
	}
}






