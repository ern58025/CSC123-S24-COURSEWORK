public class Magazine extends ReferenceMaterial {
    private String publicationDate;
    private int issueNumber;

    public Magazine(int itemReference, String title, boolean suitableForChildren, double replacementValue, String location,
                    String publicationDate, int issueNumber) {
        super(itemReference, title, suitableForChildren, replacementValue, location);
        this.publicationDate = publicationDate;
        this.issueNumber = issueNumber;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine" +
                "itemReference=" + getItemReference() +
                ", title='" + getTitle() + '\'' +
                ", suitableForChildren=" + isSuitableForChildren() +
                ", replacementValue=" + getReplacementValue() +
                ", location='" + getLocation() + '\'' +
                ", available=" + isAvailable() +
                ", publicationDate='" + publicationDate + '\'' +
                ", issueNumber=" + issueNumber;
    }
}