public class Memberss 
{
    private String membershipID;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String city;
    private String zipCode;
    private Memberss guardian; 

    public Memberss(String membershipID, String firstName, String lastName, String dateOfBirth, String city, String zipCode, Memberss guardian) 
    {
        this.membershipID = membershipID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.zipCode = zipCode;
        this.guardian = guardian;
    }
    public String getMembershipID() 
    {
        return membershipID;
    }
    public void setMembershipID(String membershipID) 
    {
        this.membershipID = membershipID;
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
    public String getCity() 
    {
        return city;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }
    public String getZipCode() 
    {
        return zipCode;
    }
    public void setZipCode(String zipCode) 
    {
        this.zipCode = zipCode;
    }
    public Memberss getGuardian() 
    {
        return guardian;
    }
    public void setGuardian(Memberss guardian) 
    {
        this.guardian = guardian;
    }
    @Override
    public String toString() 
    {
        return "Member{" +
                "membershipID='" + membershipID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}

