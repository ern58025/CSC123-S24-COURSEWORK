import java.util.Date;

public class Registration 
{
	int uniqueID;
	String startDate;
	String endDate;
	Owner owner;
	Vehicle vehicle;
	String plate;
	
	public Registration(int uniqueID, String startDate, String endDate, Owner owner, Vehicle vehicle, String plate)
	{
		this.uniqueID = uniqueID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.owner = owner;
		this.vehicle = vehicle;
		this.plate = plate;
	}

	public int getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	@Override
	public String toString() {
		return "Registration [uniqueID=" + uniqueID + ", startDate=" + startDate + ", endDate=" + endDate + ", owner="
				+ owner + ", vehicle=" + vehicle + ", plate=" + plate + "]";
	}
	
}


