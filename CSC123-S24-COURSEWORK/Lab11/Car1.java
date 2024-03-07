
public class Car1 
{
	private String make;
	private String model;
	private String color;
	private boolean isRunning;
	private boolean isBrakeApplied;
	private String transmission;
	
	public Car1(String make, String model, String color) throws IncompleteCarConfigurationException
	{
//		if(make == null || model == null || color == null)
//		{
//			throw new IncompleteCarConfigurationException("Make, model, and color must be provicded.");
//		}
		this.make = make;
		this.model = model;
		this.color = color;
	}
	public void start() throws CarAlreadyRunningException, CarNotInParkedException, BrakesNotAppliedException
	{
		if(isRunning)
		{
			throw new CarAlreadyRunningException("Car running");
		}
		if(!transmission.equals("p"))
		{
			throw new CarNotInParkedException("Car in P mode");
		}
		if(!isBrakeApplied)
		{
			throw new BrakesNotAppliedException("Brakes not applied");
		}
		isRunning = true;
		System.out.println("Car started.");
	}
	public void stop()
	{
		isRunning = false;
		System.out.println("Car Stopped.");
	}
	public void applyBrake()
	{
		isBrakeApplied = true;
		System.out.println("Breaks applied.");
	}
	public void releaseBrake()
	{
		isBrakeApplied = false;
		System.out.println("Brakes released.");
	}
	public boolean isBrakeApplied()
	{
		return isBrakeApplied;
	}
	public boolean isRunning()
	{
		return isRunning;
	}
	public void setTransmission(String transmission)
	{
		this.transmission = transmission;
		System.out.println("Transmission set to " + transmission);
	}

}
