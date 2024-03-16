import java.util.Date;

public class Registration 
{
	int uniqueID;
	Date startDate;
	Date endDate;
	Owner owner;
	Vehicle vehicle;
	String plate;
	
	public Registration(int uniqueID, Date startDate, Date endDate, Owner owner, Vehicle vehicle, String plate)
	{
		this.uniqueID = uniqueID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.owner = owner;
		this.vehicle = vehicle;
		this.plate = plate;
	}
	
}


