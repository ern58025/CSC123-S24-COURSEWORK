public class ChangeMaker1 
{
    private int dollars;
    private int cents;

    public ChangeMaker1(int dollars, int cents) 
    {
        this.dollars = dollars;
        this.cents = cents;
    }

    public int getQuarters() 
    {
        int totalCents = getTotalCents();
        return totalCents / 25; 
    }
    public int getDimes() 
    {
        int totalCents = getTotalCents();
        return (totalCents % 25) / 10; 
    }
    public int getNickels() 
    {
        int totalCents = getTotalCents();
        return ((totalCents % 25) % 10) / 5;  
    }
    public int getPennies() 
    {
        int totalCents = getTotalCents();
        return ((totalCents % 25) % 10) % 5; 
    }
    private int getTotalCents() 
    {
        return dollars * 100 + cents; 
    }
}

