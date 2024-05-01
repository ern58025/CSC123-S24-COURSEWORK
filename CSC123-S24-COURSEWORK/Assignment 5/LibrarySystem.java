import java.util.Date;
import java.util.Scanner;

public class LibrarySystem {
	public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        while (true) {
            librarySystem.displayMenu();
            int choice = librarySystem.scanner.nextInt();
            librarySystem.performAction(choice);
        }
    }
    private Library library;
    private Scanner scanner;

    public LibrarySystem() {
        library = new Library();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("1 – New Membership");
        System.out.println("2 – Add Material");
        System.out.println("3 – Issue Item");
        System.out.println("4 – Return Item");
        System.out.println("5 – Report Inventory");
        System.out.println("6 – Report Loans");
        System.out.println("7 – Lookup Membership");
        System.out.println("8 – Exit");
        System.out.print("Please enter your choice: ");
    }
    public void performAction(int choice) {
        switch (choice) {
        case 1:
            System.out.println("Registering new membership...");
            System.out.print("Enter First Name: ");
            String firstName = scanner.next();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.next();
            System.out.print("Enter Date of Birth (MM/DD/YY): ");
            String dobStr = scanner.next();
            Date dateOfBirth = parseDate(dobStr);
            System.out.print("Enter City: ");
            String city = scanner.next();
            System.out.print("Enter Zip code: ");
            String zipCode = scanner.next();

            System.out.println("Select Member Type:");
            System.out.println("1. Adult Member");
            System.out.println("2. Child Member");
            System.out.print("Enter your choice: ");
            int memberType = scanner.nextInt();

            Member newMember = null;
            switch (memberType) {
                case 1:
                    newMember = new AdultMember(generateMembershipNumber(), firstName, lastName, dateOfBirth, city, zipCode);
                    break;
                case 2:
                    System.out.print("Enter Guardian Name: ");
                    String guardianName = scanner.next();
                    newMember = new ChildMember(generateMembershipNumber(), firstName, lastName, dateOfBirth, city, zipCode, guardianName);
                    break;
                default:
                    System.out.println("Invalid member type.");
                    return;
            }
            library.addMember(newMember);

            System.out.println("New membership created successfully.");
            break;

            case 2:
                System.out.println("Adding new material...");
                System.out.print("Enter Item Reference: ");
                int itemReference = scanner.nextInt();
                System.out.print("Enter Title: ");
                String title = scanner.next();
                System.out.print("Is it suitable for children? (true/false): ");
                boolean suitableForChildren = scanner.nextBoolean();
                System.out.print("Enter Replacement Value: ");
                double replacementValue = scanner.nextDouble();
                System.out.print("Enter Location: ");
                String location = scanner.next();

                System.out.println("Select Material Type:");
                System.out.println("1. Book");
                System.out.println("2. Magazine");
                System.out.println("3. DVD");
                System.out.print("Enter your choice: ");
                int materialType = scanner.nextInt();

                ReferenceMaterial newMaterial = null;
                switch (materialType) {
                    case 1:
                        System.out.print("Enter Author: ");
                        String author = scanner.next();
                        System.out.print("Enter ISBN: ");
                        String isbn = scanner.next();
                        System.out.print("Enter Number of Pages: ");
                        int numberOfPages = scanner.nextInt();
                        newMaterial = new Book(itemReference, title, suitableForChildren, replacementValue, location, author, isbn, numberOfPages);
                        break;
                    case 2:
                        System.out.print("Enter Publication Date (month/year): ");
                        String publicationDate = scanner.next();
                        System.out.print("Enter Issue Number: ");
                        int issueNumber = scanner.nextInt();
                        newMaterial = new Magazine(itemReference, title, suitableForChildren, replacementValue, location, publicationDate, issueNumber);
                        break;
                    case 3:
                        System.out.print("Enter Release Date: ");
                        String releaseDate = scanner.next();
                        System.out.print("Enter Duration in Minutes: ");
                        int durationInMinutes = scanner.nextInt();
                        newMaterial = new DVD(itemReference, title, suitableForChildren, replacementValue, location, releaseDate, durationInMinutes);
                        break;
                    default:
                        System.out.println("Invalid material type.");
                        return;
                }

                library.addMaterial(newMaterial);

                System.out.println("New material added successfully.");
                break;

            case 3:
                System.out.println("Issuing item...");
                System.out.print("Enter Membership Number: ");
                int membershipNumber = scanner.nextInt();
                System.out.print("Enter Item Reference: ");
                int itemReference1 = scanner.nextInt();

                library.issueItem(membershipNumber, itemReference1);
                break;

            case 4:
                System.out.println("Returning item...");
                System.out.print("Enter Item Reference: ");
                int itemReference11 = scanner.nextInt();

                library.returnItem(itemReference11);
                break;
            case 5:
                System.out.println("Generating inventory report...");
                library.reportInventory();
                break;

            case 6:
                System.out.println("Generating loan report...");
                library.reportLoans();
                break;

            case 7:
                System.out.println("Looking up membership...");
                System.out.print("Enter Membership Number: ");
                int membershipNumber1 = scanner.nextInt();

                library.lookupMembership(membershipNumber1);
                break;

            case 8:
                System.out.println("Exiting the system...");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private int generateMembershipNumber() {
		return 0;
	}

    public void addMaterial() {
        System.out.println("Adding new material...");
        System.out.print("Enter Item Reference: ");
        int itemReference = scanner.nextInt();
        System.out.print("Enter Title: ");
        String title = scanner.next();
        System.out.print("Is it suitable for children? (true/false): ");
        boolean suitableForChildren = scanner.nextBoolean();
        System.out.print("Enter Replacement Value: ");
        double replacementValue = scanner.nextDouble();
        System.out.print("Enter Location: ");
        String location = scanner.next();

        System.out.println("Select Material Type:");
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.println("3. DVD");
        System.out.print("Enter your choice: ");
        int materialType = scanner.nextInt();

        ReferenceMaterial newMaterial = null;
        switch (materialType) {
            case 1:
                System.out.print("Enter Author: ");
                String author = scanner.next();
                System.out.print("Enter ISBN: ");
                String isbn = scanner.next();
                System.out.print("Enter Number of Pages: ");
                int numberOfPages = scanner.nextInt();
                newMaterial = new Book(itemReference, title, suitableForChildren, replacementValue, location, author, isbn, numberOfPages);
                break;
            case 2:
                System.out.print("Enter Publication Date (month/year): ");
                String publicationDate = scanner.next();
                System.out.print("Enter Issue Number: ");
                int issueNumber = scanner.nextInt();
                newMaterial = new Magazine(itemReference, title, suitableForChildren, replacementValue, location, publicationDate, issueNumber);
                break;
            case 3:
                System.out.print("Enter Release Date: ");
                String releaseDate = scanner.next();
                System.out.print("Enter Duration in Minutes: ");
                int durationInMinutes = scanner.nextInt();
                newMaterial = new DVD(itemReference, title, suitableForChildren, replacementValue, location, releaseDate, durationInMinutes);
                break;
            default:
                System.out.println("Invalid material type.");
                return;
        }
        library.addMaterial(newMaterial);

        System.out.println("New material added successfully.");
    }
    private Date parseDate(String dateStr) {
        return null;
    }

}