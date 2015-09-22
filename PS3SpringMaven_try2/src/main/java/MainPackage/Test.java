package MainPackage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Account Account1 = new Account(1122, 20000);
	Account1.setanualInterestRate(.045);
	try
	{
		Account1.withdraw(2500);
		Account1.withdraw(100000);
	}catch(InsufficientFundsException a){
		System.out.println("You have atempted to overdraft you account by $" + a.getAmount() + ".");
		System.out.println("Your withdraw has been denyed.");
		a.printStackTrace();
	}
	Account1.deposit(3000);
	
	System.out.println("The balance in your account is $" + Account1.getbalance());
	System.out.println("The monthly interest rate for your account is " + Account1.getMonthlyInterestRate());
	System.out.println("This account was created on " + Account1.getdateCreated());
	
	//overdrawing the account, needs to try  catch
	}

}
