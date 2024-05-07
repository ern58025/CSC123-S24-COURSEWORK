
public class Member2 
{
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String city;
	private String zipCode;
	private String memberShipNumber;
	private String isChild;
	private String guardianMember; //(if isChild == true)
	
	public Member2(String firstName, String lastName, String date, String dateOfBirth, String city, String zipCode, String memberShipNumber, String isChild, String guardianMember)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.city = city;
		this.zipCode = zipCode;
		this.memberShipNumber = memberShipNumber;
		this.isChild = isChild;
		this.guardianMember = guardianMember;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getDateOfBirth()
	{
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	public String getZipCode()
	{
		return zipCode;
	}
	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}
	public String getMemberShipNumber()
	{
		return memberShipNumber;
	}
	public void setMemberShipNumber(String memberShipNumber)
	{
		this.memberShipNumber = memberShipNumber;
	}
	public String getIsChild()
	{
		return isChild;
	}
	public void setIsChild(String isChild)
	{
		this.isChild = isChild;
	}
	public String getGuardianMember()
	{
		return guardianMember;
	}
	public void setGuardianMember(String guardianMember)
	{
		this.guardianMember = guardianMember;
	}
	public String toString()
	{
		return "First & Last Name: " + firstName + lastName + "," + "Date of birth: " + dateOfBirth + "." + "City: " + city + "." + "Zip Code: " + zipCode + ".";
	
	}
	
	

}
