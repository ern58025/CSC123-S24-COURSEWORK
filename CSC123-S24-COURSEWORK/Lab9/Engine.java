
public class Engine 
{
	private String intake;
	private String compression;
	private String power;
	private String exhaust;
	private String fuel;
	
	public Engine(String intake, String compression, String power, String exhaust, String fuel)
	{
		this.intake = intake;
		this.compression = compression;
		this.power = power;
		this.exhaust = exhaust;
		this.fuel = fuel;	
	}
	public String getIntake()
	{
		return intake;
	}
	public String getCompression()
	{
		return compression;
	}
	public String getPower()
	{
		return power;
	}
	public String getExhaust()
	{
		return exhaust;
	}
	public String getFuel()
	{
		return fuel;
	}
	public String toString()
	{
		return "intake: " + intake + ", Compression: " + compression + ", power: " + power + ", exhaust: " + exhaust + ", fuel: " + fuel;
				
	}
	

}
