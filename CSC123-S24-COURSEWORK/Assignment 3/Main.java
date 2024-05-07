public class Main {
    public static void main(String[] args) {
        // Create DMV instance
        DMV1 dmv = new DMV1("California");
        
        // Create some sample data
        Owner owner1 = new Owner("John", "Doe", "111 Main St", "Los Angeles", "CA", "90001");
        Vehicle vehicle1 = new Vehicle("ABC123", "2111-01-01", "Toyota", "Camry", "Black", 4);
        
        Owner owner2 = new Owner("Jane", "Smith", "111 Oak Ave", "San Francisco", "CA", "91111");
        Vehicle Vehicle = new Vehicle("XYZ456", "2111-01-11", "Honda", "Accord", "Silver", 4);
        
        dmv.registerVehicle(owner1, vehicle1);
        dmv.registerVehicle(owner2, Vehicle);
        
        // List registrations
        System.out.println("Registrations:");
        dmv.listRegistrations();
        
        System.out.println("\nSearch Registration by Plate:");
        Registration foundRegistration = dmv.searchRegistrationByPlate("ABC123");
        if (foundRegistration != null) {
            System.out.println(foundRegistration);
        } else {
            System.out.println("Registration not found.");
        }
        
        Citation citation = new Citation("2024-05-06", 12345, 100.0, "Pending", foundRegistration);
        
        dmv.registerCitation(citation);
        
        System.out.println("\nCitations:");
        dmv.listCitations();
        
        System.out.println("\nSearch Citation by ID:");
      
    }
}
