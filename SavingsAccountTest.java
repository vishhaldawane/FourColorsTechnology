package com.fourcolours;

public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savObj1 = new SavingsAccount();
		
		savObj1.setInitialValues(101, "Jack",50000,4.5f);
		savObj1.showAccountDetails();
		double simpleInterest = savObj1.calculateSimpleInterest();
		System.out.println("Simple interest is : "+simpleInterest);
		
		System.out.println("==============");
		
		CurrentAccount currObj2 = new CurrentAccount();
		
		currObj2.setInitialValues(102, "Smith",70000,0.25f);
		currObj2.showAccountDetails();
		double overDraftAmount = currObj2.calculateOverDraftAmount();
		System.out.println("Over Draft Amount is : "+overDraftAmount);
		
		System.out.println("==============");
		
		CreditAccount creObj3 = new CreditAccount();
		
		creObj3.setInitialValues(103, "Robert",100000,20000);
		creObj3.showAccountDetails();
		double credibility = creObj3.calculateCredibility();
		System.out.println("Credibility Amount is : "+credibility);
		
		creObj3.withdraw(20000);
		creObj3.withdrawCash(7000);
		
		double credibility2 = creObj3.calculateCredibility();
		System.out.println("Credibility2 Amount is : "+credibility2);
		
		
		
	} //end of the main

}//end of the class

class SavingsAccount
{
	//DATA MEMBER SECTION
	private int accountNumber; // DATA member
	private String accountHolderName; // DATA member
	private double accountBalance; // DATA member
	private float interestRate; //
	
	//MEMBER METHOD SECTION   local var     local var  local  var
	void setInitialValues(int acno, String acHolder, double acbal, float ir) {
		System.out.println("setting the initial account details...");
		accountNumber = acno; // set the local var to the DATA member 
		accountHolderName = acHolder;
		accountBalance = acbal;
		interestRate = ir;
	}
	
	void showAccountDetails() {
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Holder  : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("Interest Rate   : "+interestRate);
		
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
	
	double calculateSimpleInterest() {
		System.out.println("Calculating simple interest....");
		double simpleInterest = (accountBalance * 1 * interestRate)/100;
		return simpleInterest;
	}

}

class CurrentAccount
{
	//DATA MEMBER SECTION
	private int accountNumber; // DATA member
	private String accountHolderName; // DATA member
	private double accountBalance; // DATA member
	private float overdraftLimit; //
	
	//MEMBER METHOD SECTION   local var     local var  local  var
	void setInitialValues(int acno, String acHolder, double acbal, float odl) {
		System.out.println("setting the initial account details...");
		accountNumber = acno; // set the local var to the DATA member 
		accountHolderName = acHolder;
		accountBalance = acbal;
		overdraftLimit = odl;
	}
	
	void showAccountDetails() {
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Holder  : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("OverDraftLimit  : "+overdraftLimit);
		
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
	
	double calculateOverDraftAmount() {
		System.out.println("Calculating over draft amount....");
		double overDraftAmount = accountBalance + (accountBalance * overdraftLimit);
		return overDraftAmount;
	}

}
class CreditAccount
{
	//DATA MEMBER SECTION
	private int accountNumber; // DATA member
	private String accountHolderName; // DATA member
	private double accountBalance; // DATA member
	private double creditLimit; //
	private double cashLimit; //
	
	
	//MEMBER METHOD SECTION   local var     local var  local  var
	void setInitialValues(int acno, String acHolder, double acbal,  double cashLim) {
		System.out.println("setting the initial account details...");
		accountNumber = acno; // set the local var to the DATA member 
		accountHolderName = acHolder;
		accountBalance = acbal;
		creditLimit = acbal;
		cashLimit = cashLim;
	}
	
	void showAccountDetails() {
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Holder  : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("Credit Limit    : "+creditLimit);
		System.out.println("Cash Limit      : "+cashLimit);
		
		System.out.println("--------------------");
	}
	void deposit(double amountToDeposit) {
		System.out.println("Depositing $"+amountToDeposit+" for AcNo:"+accountNumber);
		accountBalance = accountBalance + amountToDeposit; 
	}
	
	void withdraw(double amountToWithdraw) {
		System.out.println("Withdrawing $"+amountToWithdraw+" for AcNo:"+accountNumber);
		accountBalance = accountBalance - amountToWithdraw; 
		creditLimit = accountBalance;
	}
	
	void withdrawCash(double amountToWithdraw) {
		System.out.println("Withdrawing Cash $"+amountToWithdraw+" for AcNo:"+accountNumber);
		accountBalance = accountBalance - amountToWithdraw; 
		cashLimit = cashLimit - amountToWithdraw;
	}
	
	double calculateCredibility() {
		System.out.println("Calculating credibility....");
		double credibilityAmount = creditLimit + cashLimit;
		return credibilityAmount;
	}

}







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





