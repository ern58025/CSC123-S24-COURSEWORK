import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private Map<Integer, ReferenceMaterial> catalog;
    private Map<Integer, Member> members;
    private Map<Integer, LoanRecord> loans;

    public Library() {
        catalog = new HashMap<>();
        members = new HashMap<>();
        loans = new HashMap<>();
    }

    public void addMaterial(ReferenceMaterial material) {
        catalog.put(material.getItemReference(), material);
    }

    public void issueItem(int membershipNumber, int itemReference) {
        if (!catalog.containsKey(itemReference)) {
            System.out.println("Item does not exist.");
            return;
        }

        ReferenceMaterial material = catalog.get(itemReference);
        if (!material.isAvailable()) {
            System.out.println("Item is on loan.");
            return;
        }

        Member borrower = members.get(membershipNumber);
        if (borrower == null) {
            System.out.println("Member does not exist.");
            return;
        }

        Date dueDate = null;
		LoanRecord loanRecord = new LoanRecord(itemReference,membershipNumber,dueDate);  
        loans.put(itemReference, loanRecord);
        material.setAvailable(false);
        System.out.println("Item issued successfully.");
    }

    public void returnItem(int itemReference) {
        if (!loans.containsKey(itemReference)) {
            System.out.println("Item is not on loan.");
            return;
        }

        LoanRecord loanRecord = loans.get(itemReference);
        ReferenceMaterial material = catalog.get(itemReference);

        material.setAvailable(true);
        loans.remove(itemReference);
        System.out.println("Item returned successfully.");
    }

    public void reportInventory() {
        System.out.println("Inventory Report:");
        for (ReferenceMaterial material : catalog.values()) {
            System.out.println(material);
        }
    }

    public void reportLoans() {
        System.out.println("Loan Report:");
        for (LoanRecord loanRecord : loans.values()) {
            System.out.println(loanRecord);
        }
    }

    public void lookupMembership(int membershipNumber) {
        Member member = members.get(membershipNumber);
        if (member == null) {
            System.out.println("Member not found.");
        } else {
            System.out.println(member);
        }
    }
    public void addMember(Member member) {
        members.put(member.getMembershipNumber(), member);
    }
}