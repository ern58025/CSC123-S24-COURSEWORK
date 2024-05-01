import java.util.Date;

public class ChildMember extends Member {
    private String guardianName;

    public ChildMember(int membershipNumber, String firstName, String lastName, Date dateOfBirth, String city, String zipCode, String guardianName) {
        super(membershipNumber, firstName, lastName, dateOfBirth, city, zipCode);
        this.guardianName = guardianName;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    @Override
    public String toString() {
        return "ChildMember" +
                "membershipNumber=" + getMembershipNumber() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", city='" + getCity() + '\'' +
                ", zipCode='" + getZipCode() + '\'' +
                ", guardianName='" + guardianName + '\'';
    }
}