public class Person 
{
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	
	//String DateOfBirth = "MM/DD/YY";
	
	public Person(String firstName, String lastName, String dateOfBirth)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		//this.dateOfBirth = LocalDate.parse(date)
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getFullName()
	{
		return firstName + "" + lastName;
	}
	public int getAge()
	{
		return dateOfBirth;
	}
}
