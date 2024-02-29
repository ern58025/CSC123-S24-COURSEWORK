public class CoinCounter1 
{
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

  
    public CoinCounter1(int quarters, int dimes, int nickels, int pennies) 
    {
        this.quarters = quarters;
        this.dimes = dimes;
        this.nickels = nickels;
        this.pennies = pennies;
    }
    public int getDollarAmount() 
    {
        int totalCents = getTotalCents();
        return totalCents / 100; 
    }
    public int getCentsAmount() 
    {
        return getTotalCents() % 100; 
    }
    private int getTotalCents() 
    {
        int totalCents = 0;
        totalCents += quarters * 25; 
        totalCents += dimes * 10;    
        totalCents += nickels * 5;   
        totalCents += pennies;       
        return totalCents;
    }
    
}

