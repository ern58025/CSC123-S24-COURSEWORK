public class ChildMember1 extends Memberss 
{
    public ChildMember1(String membershipID, String firstName, String lastName, String dateOfBirth, String city, String zipCode, Memberss guardian) 
    {
        super(membershipID, firstName, lastName, dateOfBirth, city, zipCode, guardian);
        setGuardian(guardian);
    }

    @Override
    public String toString() 
    {
        return "ChildMember{" +
                "membershipID='" + getMembershipID() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", city='" + getCity() + '\'' +
                ", zipCode='" + getZipCode() + '\'' +
                ", guardian=" + getGuardian().getFirstName() + " " + getGuardian().getLastName() +
                '}';
    }
}
