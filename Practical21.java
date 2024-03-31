package Practicals;

class BankAccount
{
	double balance;
	String AccountNumber;
	
	public BankAccount(String AccountNumber, double balance)
	{
		this.AccountNumber = AccountNumber;
		this.balance = balance;
	}
	void deposit(double amount)
	{
		if (amount > 0)
		{
			balance = balance + amount;
		}
		else
		{
			System.out.println("Invalid deposit amount.");
		}	
	}	
	
	void withdraw(double amount)
	{
		if (amount > 0 && amount <= balance)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Invalid withdrawal amount.");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}		
}

class SavingsAccount extends BankAccount
{
	double withdrawLimit;
	
	public SavingsAccount(String AccountNumber, double balance, double withdrawLimit)
	{
		super(AccountNumber, balance);
		this.withdrawLimit = withdrawLimit;
	}
	@Override
	void withdraw(double amount)
	{
		if(amount > 0 && amount <=withdrawLimit)
		{
			super.withdraw(amount);
		}
		else
		{
			System.out.println("Withdrawal exceeds the maximum withdrawal limit 1000. ");
		}
	}
}

class CheckingAccount extends BankAccount
{
	double transactionFee;
	
	public CheckingAccount(String AccountNumber, double balance, double transactionFee)
	{
		super(AccountNumber, balance);
		this.transactionFee = transactionFee;
	}
	@Override
	void withdraw(double amount)
	{
		if (amount > 0 && amount <=balance)
		{
			super.withdraw(amount + transactionFee);
		}
		else
		{
			System.out.println("Insufficient funds or invalid withdrawal amount.");
		}
	}
}

public class Practical21
{
	public static void main(String args[])
	{
		SavingsAccount a = new SavingsAccount("PNB123", 1000.00, 500.00);
		
		System.out.println("Saving Account Balance: Rs " +a.getBalance());
		System.out.println();
		System.out.println("Deposit Rs 200 to Saving Account");
		a.deposit(200.00);
		System.out.println("Savings Account Balance is : Rs " +a.getBalance());
		
		System.out.println();
		System.out.println("Withdraw Rs 700 to Saving Account");
		a.withdraw(700.00);
		
		System.out.println();
		System.out.println("Withdraw Rs 500 to Saving Account");
		a.withdraw(500.00);
		System.out.println("Savings Account Balance is : Rs " +a.getBalance());
		
		CheckingAccount b = new CheckingAccount("HDFC123", 500.00, 20.00);
		
		System.out.println();
		System.out.println("Checking Account Balance: Rs " +b.getBalance());
		System.out.println();
		System.out.println("Transactions Fees for withdrawal: Rs 20");
		System.out.println();
		System.out.println("Deposit Rs 100 to Checking Account");
		b.deposit(100.00);
		System.out.println("Checking Account Balance is : Rs " +b.getBalance());
		
		System.out.println();
		System.out.println("Withdraw Rs 5000 to Checking Account");
		b.withdraw(5000.00);
		
		System.out.println();
		System.out.println("Withdraw Rs 200 to Checking Account");
		b.withdraw(200.00);
		System.out.println("Checking Account Balance is : Rs " +b.getBalance());
	}
}
