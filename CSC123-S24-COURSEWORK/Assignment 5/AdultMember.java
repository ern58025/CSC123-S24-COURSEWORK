import java.util.Date;

public class AdultMember extends Member {

    public AdultMember(int membershipNumber, String firstName, String lastName, Date dateOfBirth, String city, String zipCode) {
        super(membershipNumber, firstName, lastName, dateOfBirth, city, zipCode);
    }

    @Override
    public String toString() {
        return "AdultMember{" +
                "membershipNumber=" + getMembershipNumber() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", city='" + getCity() + '\'' +
                ", zipCode='" + getZipCode() + '\'' +
                '}';
    }
}