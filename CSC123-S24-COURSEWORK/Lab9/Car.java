
public class Car 
{
	private String seat;
	private String tires;
	private String wheel;
	private String mirror;
	private String gas;
	CarOwner owner;
	
	public Car(String seat, String tires, String wheel, String mirror, String gas)
	{
		this.seat = seat;
		this.tires = tires;
		this.wheel = wheel;
		this.mirror = mirror;
		this.gas = gas;
	}
	public void setOwner(CarOwner b) 
	{	
		if(owner==null||!owner.equals(b))
		{
			owner = b;
		}
		b.addCar(this);
	}
	public CarOwner getCarOwner()
	{
		return owner;
	}
	public String getSeat()
	{
		return seat;
	}
	public String getTires()
	{
		return tires;
	}
	public String getWheel()
	{
		return wheel;
	}
	public String getMirror()
	{
		return mirror;
	}
	public String getGas()
	{
		return gas;
	}
	public String toString()
	{
		return "seat: " + seat + ", Tires: " + tires + ", Wheel: " + wheel + ", Mirror: " + mirror + ", Gas: " + gas;
	}
	

}
