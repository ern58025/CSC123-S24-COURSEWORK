import java.util.UUID;
public class Bookss extends Material
{
	private String Author;
	private String ISBN;
	private int NumberOfPages;
	
	public Bookss(String Title, boolean SuitableForChildren, double ReplacementValue,
            String Location, String Author, String ISBN, int numberOfPages)
	{
		super(UUID.randomUUID().toString(), Title, SuitableForChildren, ReplacementValue, Location);
		this.Author = Author;
		this.ISBN = ISBN;
		this.NumberOfPages = NumberOfPages;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getNumberOfPages() {
		return NumberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		NumberOfPages = numberOfPages;
	}
	@Override
	public String toString()
	{
		return "Book: " + "itemReference: " + getItemReference()+ ", tile: "+ getTitle()+", suitable for children: "+isSuitableForChildren()+", Replacemetn value: " getReplacementValue()+", Location: "+getLocation()+", Author: "+ Author+", ISBN: "+ISBN+", Number of Pages: "+NumberOfPages;
	}
	

}
