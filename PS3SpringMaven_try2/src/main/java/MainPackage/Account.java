package MainPackage;

import java.util.Date;
import java.util.Scanner;

public class Account {
	//setter = mutator method
	//getter = accessor method
	
	private int id = 0;
	private double balance = 0;
	private double anualInterestRate = 0;
	private Date dateCreated; 
	
	//constructor
	public Account(){
	}
	
	//constructor
	public Account(int newid, double newbalance){	
		id = newid;
		balance = newbalance;
		dateCreated = new Date();
	}
	
	public int getid(){
		return id;
	}
	
	public double getbalance(){
		return balance;
	}
	
	public double getanualInerestRate(){
		return anualInterestRate;
	}
	
	public void setid(int newidvalue){
		this.id = newidvalue;
	}
	
	public void setbalance(int newbalancevalue){
		this.balance = newbalancevalue;
	}
	
	public void setanualInterestRate(double newanualInterestRatevalue){
		this.anualInterestRate = newanualInterestRatevalue;
	}
	public Date getdateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return (anualInterestRate/12);
	}
	
	public void withdraw(double withdrawAmount) throws InsufficientFundsException{
		if (balance >= withdrawAmount){
			balance -= withdrawAmount;
		}
		else{
			double overdraftAmount = withdrawAmount - balance;
			throw new InsufficientFundsException(overdraftAmount);
		}
			
	}
	
	public void deposit(double depositAmount){
		balance += depositAmount;
	}
	//if this is less than zero, throw new exception
			//put things that can fail in the try block
			//e.printStackTrace() --> tells you where the error was
}
