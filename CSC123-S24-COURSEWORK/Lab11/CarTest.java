
public class CarTest 
{
	public static void main(String[] args)
	{
		try
		{
			Car1 myCar = new Car1("Toyota", "Carolla", "Red");
			myCar.applyBrake();
			myCar.setTransmission("P");
			myCar.start();
		}
		catch(IncompleteCarConfigurationException | BrakesNotAppliedException | CarNotInParkedException | CarAlreadyRunningException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
