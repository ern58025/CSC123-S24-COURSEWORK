import java.util.Scanner;

public class userInterface {
    private Libraryy library;
    private Scanner scanner;

    public userInterface() {
        library = new Libraryy();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to the Library Management System!");
        System.out.println("1 - New Membership");
        System.out.println("2 - Add Material");
        System.out.println("3 - Issue Item");
        System.out.println("4 - Return Item");
        System.out.println("5 - Report Inventory");
        System.out.println("6 - Report Loans");
        System.out.println("7 - Lookup Membership");
        System.out.println("8 - Exit");
    }

    public void run() {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    System.out.println("New Membership Registration:");
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Date of Birth (MM/DD/YY): ");
                    String dateOfBirth = scanner.nextLine();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter Zip Code: ");
                    String zipCode = scanner.nextLine();
                    
                    // Check if member is adult or child
                    System.out.print("Is this member an adult? (Y/N): ");
                    String isAdultInput = scanner.nextLine().toUpperCase();
                    boolean isAdult = isAdultInput.equals("Y");

                    if (!isAdult) {
                        // For child members, also get guardian details
                        System.out.print("Enter Guardian's First Name: ");
                        String guardianFirstName = scanner.nextLine();
                        System.out.print("Enter Guardian's Last Name: ");
                        String guardianLastName = scanner.nextLine();
                        Memberss guardian = new Memberss(UUID.randomUUID().toString(), guardianFirstName, guardianLastName, "", "", "");
                        // Create child member with guardian
                        Memberss childMember = new ChildMember1(UUID.randomUUID().toString(), firstName, lastName, dateOfBirth, city, zipCode, guardian);
                        Libraryy.newMembershipID(childMember);
                    } else {
                        
                        Memberss adultMember = new AdultMember1(UUID.randomUUID().toString(), firstName, lastName, dateOfBirth, city, zipCode);
                        library.newMembership(adultMember);
                    }
                    break;

                    
                case 2:
                	System.out.println("Enter your member ID: ");
                	int memberID = scanner.nextInt();
                	Libraryy.listMemberBooks(memberID);
                    // Call methods to handle adding material
                    break;
                case 3:
                    // Call methods to handle issuing item
                    break;
                case 4:
                    // Call methods to handle returning item
                    break;
                case 5:
                    // Call methods to handle reporting inventory
                    break;
                case 6:
                    // Call methods to handle reporting loans
                    break;
                case 7:
                    // Call methods to handle looking up membership
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);
    }
    public static void main(String[] args) 
    {
    	userInterface app = new userInterface();
        app.run();
    }
}
