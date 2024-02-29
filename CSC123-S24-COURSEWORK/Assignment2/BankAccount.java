
public class BankAccount 
{
	private String ownerFirstName;
	private String ownerLastName;
	private double inititalDepositAmount;
	private boolean isOpen;
	
	public BankAccount(String ownerFirstName, String ownerLastName, double initialDepositAmount)
	{
		this.ownerFirstName = ownerFirstName;
		this.ownerLastName = ownerLastName;
		this.inititalDepositAmount = initialDepositAmount;
		this.isOpen = true;
	}
	public boolean deposit(double amount)
	{
		if(amount > 0 && isOpen)
		{
			inititalDepositAmount += amount;
			return true;
		}
		return false;
	}
	public boolean withdraw(double amount)
	{
		if(amount > 0 && isOpen && amount <= inititalDepositAmount)
		{
			inititalDepositAmount -= amount;
			return true;
		}
		return false;
	}
	public void close()
	{
		isOpen = false;
	}
	public String getOwnerFullName()
	{
		return ownerFirstName + " " + ownerLastName;
	}
	

}
