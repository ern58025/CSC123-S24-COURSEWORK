
public class AdultMember1 extends Memberss 
{
    public AdultMember1(String membershipID, String firstName, String lastName, String dateOfBirth, String city, String zipCode, Memberss guardian) 
    {
        super(membershipID, firstName, lastName, dateOfBirth, city, zipCode, guardian);
    }
    @Override
    public String toString() 
    {
        return "AdultMember" +
                "membershipID='" + getMembershipID() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", city='" + getCity() + '\'' +
                ", zipCode='" + getZipCode() + '\'' +
                ", guardian=" + getGuardian().getFirstName() + " " + getGuardian().getLastName();
    }
}
