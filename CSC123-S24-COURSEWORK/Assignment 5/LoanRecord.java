import java.util.Date;

public class LoanRecord {
    private int itemReference;
    private int membershipNumber;
    private Date dueDate;

    public LoanRecord(int itemReference, int membershipNumber, Date dueDate) {
        this.itemReference = itemReference;
        this.membershipNumber = membershipNumber;
        this.dueDate = dueDate;
    }

    public int getItemReference() {
        return itemReference;
    }
    public void setItemReference(int itemReference)
    {
    	this.itemReference = itemReference;
    }
    public int getMembershipNumber() {
        return membershipNumber;
    }
    public void setMembershipNumber(int membershipNumber)
    {
    	this.membershipNumber = membershipNumber;
    }
    public Date getDueDate() {
        return dueDate;
    }
    public void setDueDate(Date dueDate)
    {
    	this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "LoanRecord" +
                "itemReference=" + itemReference +
                ", membershipNumber=" + membershipNumber +
                ", dueDate=" + dueDate;
    }
}