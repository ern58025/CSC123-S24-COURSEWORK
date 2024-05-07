import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryInterface 
{
	private Map<String, Memberss> members;
	private Map<String, Material> catalogue;
	private Map<String, String> loans;
	
	public LibraryInterface()
	{
		members = new HashMap<>();
		catalogue = new HashMap<>();
		loans = new HashMap<>();
	}
	public void newMembership()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter membership ID: ");
		String membershipID = scanner.nextLine();
		System.out.println("Enter first name: ");
		String firstName = scanner.nextLine();
		System.out.println("Enter Last name: ");
		String lastName = scanner.nextLine();
		System.out.println("Enter date of birth (MM/DD/YY): ");
		String dateOfBirth = scanner.nextLine();
		System.out.println("Enter city: ");
		String city = scanner.nextLine();
		System.out.println("Enter zip code: ");
		String zipCode = scanner.nextLine();
		System.out.println("Is this member an adult or child? (Enter A for Adult, C for Child):");
		String memberType = scanner.nextLine();
		
		Memberss member;
		Memberss guardian;
		if(memberType.equalsIgnoreCase("A"))
		{
			member = new AdultMember1(membershipID, firstName, lastName, dateOfBirth, city, zipCode, guardian);
		}
		else if(memberType.equalsIgnoreCase("C"))
		{
			System.out.println("Enter guardians first name: ");
			String guardianFirstName = scanner.nextLine();
			System.out.println("Enter guardians last name: ");
			String guardianLastName = scanner.nextLine();
		    member = new ChildMember1(membershipID, firstName, lastName, dateOfBirth, city, zipCode, guardian);
		}
		else
		{
			System.out.println("Invalid input.");
			return;
		}
		members.put(member.getMembershipID(), member);
		System.out.println("New membership created successfully. Membership number: " + member.getMembershipID());
	}

}
