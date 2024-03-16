import java.util.Date;

public class Vehicle 
{
	String vin;
	Date dateOfMfg;
	String make;
	String model;
	String color;
	int numberOfDoors;
	
	public Vehicle(String vin, Date dateOfMfg, String make, String model, String color, int numberOfDoors)
	{
		this.vin = vin;
		this.dateOfMfg = dateOfMfg;
		this.make = make;
		this.model = model;
		this.color = color;
		this.numberOfDoors = numberOfDoors;
	}
	

}
