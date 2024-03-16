import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DMV1
{
	String state;
	ArrayList<Registration> registration;
	ArrayList<Citation> citation;
	
	public DMV1(String state)
	{
		this.state = state;
		registration = new ArrayList<Registration>();
		citation = new ArrayList<Citation>();
	}
	public void registerVehicle(Owner owner, Vehicle vehicle)
	{
		Registration registration = new Registration();
		Vehicle vehicle = new Vehicle()
		
	}
	public void registerCitation(Citation citation)
	{
		Citation citation = new Citation();
	}
	public void listRegistration()
	{
		System.out.println(Registration.toString());
	}
	
	

}
