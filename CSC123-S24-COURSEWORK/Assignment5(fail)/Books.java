
public class Books 
{
	private String Title;
	private String Author;
	private String ISBN;
	private String numOfPages;
	
	public Books(String Title, String Author, String ISBN, String numOfPages)
	{
		this.Title = Title;
		this.Author = Author;
		this.ISBN = ISBN;
		this.numOfPages = numOfPages;
	}
	public String getTitle() 
	{
		return Title;
	}
	public void setTitle(String title) 
	{
		Title = title;
	}
	public String getAuthor() 
	{
		return Author;
	}
	public void setAuthor(String author) 
	{
		Author = author;
	}
	public String getISBN() 
	{
		return ISBN;
	}
	public void setISBN(String iSBN) 
	{
		ISBN = iSBN;
	}
	public String getNumOfPages() 
	{
		return numOfPages;
	}
	public void setNumOfPages(String numOfPages) 
	{
		this.numOfPages = numOfPages;
	}
	public  String toString()
	{
		return "Title: " + Title + "," + "Author: " + "," + Author + "," + "ISBN: " + ISBN + "Number of pages: " + numOfPages;
	}
	public Books listBooks()
	{
		Books h = new Book1(Title, Author, ISBN, numOfPages);
		return h;
	}
	
}
