import java.time.LocalDate;

public class Magazine111 extends Material
{
	private LocalDate publicationDate;
	private int issueNumber;

	public Magazine111(String ItemReference, String Title, boolean SuitableForChildren, double ReplacementValue, String Location, LocalDate PublicationDate, int IssueNumber)
	{
		super(ItemReference, Title, SuitableForChildren, ReplacementValue, Location);
		this.publicationDate = publicationDate;
		this.issueNumber = issueNumber;
	}
	public LocalDate getPublicationDate()
	{
		return publicationDate;
	}
	public void setPublicationDate(LocalDate publicationDate)
	{
		this.publicationDate = publicationDate;
	}
	public int getIssueNumber()
	{
		return issueNumber;
	}
	public void setIssueNumber(int issueNumber)
	{
		this.issueNumber = issueNumber;
	}
	@Override
	public String toString()
	{
		return "Magazine" + "itemReference='" + getItemReference() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", suitableForChildren=" + isSuitableForChildren() +
                ", replacementValue=" + getReplacementValue() +
                ", location='" + getLocation() + '\'' +
                ", publicationDate=" + publicationDate +
                ", issueNumber=" + issueNumber +
                '}';
	}
}
