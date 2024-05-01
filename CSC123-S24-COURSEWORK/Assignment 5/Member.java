import java.util.Date;

public class Member {
    private int membershipNumber;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String city;
    private String zipCode;

    public Member(int membershipNumber, String firstName, String lastName, Date dateOfBirth, String city, String zipCode) {
        this.membershipNumber = membershipNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.zipCode = zipCode;
    }

    public int getMembershipNumber() {
        return membershipNumber;
    }
    public void setgetMembershipNumber(int membershipNumber)
    {
    	this.membershipNumber = membershipNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
    	this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName)
    {
    	this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

    public String getCity() {
        return city;
    }
	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
        return zipCode;
    }
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
    @Override
    public String toString() {
        return "Member{" +
                "membershipNumber=" + membershipNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode;
    }
}