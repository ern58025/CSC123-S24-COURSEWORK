import java.util.Date;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)
	{
		Owner o1 = new Owner("John", "Arrow", "123 Main ST", "NewYork", "CA", "39002");
		Owner o2 = new Owner("Jake", "Buker", "321 Flower ST", "Canada", "CA", "9902");
		
		ArrayList<Owner> owner = new ArrayList<>();
		owner.add(o1);
		owner.add(o2);
		
		Date dateOfMfg = new Date(0);
		Vehicle vehicle = new Vehicle("DSSSSDDDsss", dateOfMfg, "Toyota", "Camry", "Black", 4);
		Citation citation = new Citation(382, 200.0, "Unpaid", registration);
		
		System.out.println("Owner 1: " + o1.firstName + " " + o1.lastName);
		System.out.println("Owner 2: " + o2.firstName + " " + o2.lastName);
		System.out.println("Vehicle: " + vehicle.make + " " + vehicle.model);
		System.out.println("Registration: " + registration.uniqueID);
		System.out.println("Citation: " + citation.offenceCode);

	}

}
