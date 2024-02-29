import java.util.ArrayList;

public class CarOwner 
{
	private int carsOwned;
	private String modelOfCars;
	private int mileage;
	private String colors;
	private String dailyCar;
	private ArrayList<Car> cars;
	
	public CarOwner(int carsOwned, String modelOfCars, int mileage, String colors, String dailyCar)
	{
		this.carsOwned = carsOwned;
		this.modelOfCars = modelOfCars;
		this.mileage = mileage;
		this.colors = colors;
		this.dailyCar = dailyCar;
		cars = new ArrayList<Car>();
	}
	public int getCarsOwned()
	{
		return carsOwned;
	}
	public String getModelOfCars()
	{
		return modelOfCars;
	}
	public int getMileage()
	{
		return mileage;
	}
	public String getColors()
	{
		return colors;
	}
	public String getDailyCar()
	{
		return dailyCar;
	}
	public String toString()
	{
		return "Cars owned: " + carsOwned + ", Model of cars: " + modelOfCars + ", Mileage: " + mileage;
	}
	public void addCar(Car car) 
	{
			
	}

}
