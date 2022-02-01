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
		
		CurrentAccount curObj = new CurrentAccount();
		
		
		
	} //end of the main

}//end of the class

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

class CurrentAccount { }

class CreditAccount  { }






// add one extra member ONLY in SavingsAccount as
// interestRate
// acno name acbalance  interestRate
// 104  Seema  50000     3.5f <-- as interest rate


//innovate CurrentAccount which is same as SavingsAccount
// it has "fourth" member as "float overdraftLimit"
// acno , name, acbalance, overdraftLimit
// 101    Jack  10000      0.25, ie 12500 can be overdrafted/withdrawn by jack


//innovate CreditAccount which is same as SavingsAccount
// it has fourth member as "double creditLimit"
//it has fifth member as "double cashLimit"

// acno name acbalance  creditLimit	cashLimit
// 102  Rita  50000      90000		20000	 <-- 





