//import java.util.Date;

public class Vehicle 
{
	String vin;
	String dateOfMfg;
	String make;
	String model;
	String color;
	int numberOfDoors;
	
	public Vehicle(String vin, String dateOfMfg, String make, String model, String color, int numberOfDoors)
	{
		this.vin = vin;
		this.dateOfMfg = dateOfMfg;
		this.make = make;
		this.model = model;
		this.color = color;
		this.numberOfDoors = numberOfDoors;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getDateOfMfg() {
		return dateOfMfg;
	}

	public void setDateOfMfg(String dateOfMfg) {
		this.dateOfMfg = dateOfMfg;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String toString() {
		return "Vehicle [vin=" + vin + ", dateOfMfg=" + dateOfMfg + ", make=" + make + ", model=" + model + ", color="
				+ color + ", numberOfDoors=" + numberOfDoors + "]";
	}
	

}
