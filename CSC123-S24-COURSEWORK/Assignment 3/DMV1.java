import java.util.ArrayList;
import java.util.List;

public class DMV1 {
    private String state;
    private List<Registration> registrations;
    private List<Citation> citations;
    
    public DMV1(String state) {
        this.state = state;
        this.registrations = new ArrayList<>();
        this.citations = new ArrayList<>();
    }
    
    // Methods
    public void registerVehicle(Owner owner, Vehicle vehicle) {
        Registration registration = new Registration(generateUniqueID(), getCurrentDate(), null, owner, vehicle, null);
        registrations.add(registration);
    }
    public void registerCitation(Citation citation) {
        citations.add(citation);
    }
    
    public void listRegistrations() {
        for (Registration registration : registrations) {
            System.out.println(registration);
        }
    }
    
    public void listCitations() {
        for (Citation citation : citations) {
            System.out.println(citation);
        }
    }
    
    private int generateUniqueID() {
        return 0; 
    }
    
    private String getCurrentDate() {
        return "2000-01-01"; 
    }
    public Registration searchRegistrationByPlate(String plate) {
        for (Registration registration : registrations) {
            if (registration.getPlate().equals(plate)) {
                return registration;
            }
        }
        return null; 
    }
    
    public Registration searchRegistrationByID(int uniqueID) {
        for (Registration registration : registrations) {
            if (registration.getUniqueID() == uniqueID) {
                return registration;
            }
        }
        return null; 
    }
    
    public List<Registration> searchRegistrationByOwner(Owner owner) {
        List<Registration> ownerRegistrations = new ArrayList<>();
        for (Registration registration : registrations) {
            if (registration.getOwner().equals(owner)) {
                ownerRegistrations.add(registration);
            }
        }
        return ownerRegistrations;
    }
    
    public List<Citation> searchCitationByRegistration(Registration registration) {
        List<Citation> registrationCitations = new ArrayList<>();
        for (Citation citation : citations) {
            if (citation.getRegistration().equals(registration)) {
                registrationCitations.add(citation);
            }
        }
        return registrationCitations;
    }
    
    public List<Citation> searchCitationByOwner(Owner owner) {
        List<Citation> ownerCitations = new ArrayList<>();
        for (Citation citation : citations) {
            if (citation.getRegistration().getOwner().equals(owner)) {
                ownerCitations.add(citation);
            }
        }
        return ownerCitations;
    }
    
    public Citation searchCitationByID(int offenceCode) {
        for (Citation citation : citations) {
            if (citation.getOffenceCode() == offenceCode) {
                return citation;
            }
        }
        return null; 
    }
   
}
