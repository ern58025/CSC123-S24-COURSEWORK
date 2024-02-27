import java.util.ArrayList;
import java.util.List;
public class Library 
{
	private String libraryName;
	private String city;
	private String state;
	private List<Book>books;
	
	public Library(String libraryName, String city, String state)
	{
		this.libraryName = libraryName;
		this.city = city;
		this.state = state;
		this.books = new ArrayList<>();
	}
	public String getLibraryName()
	{
		return libraryName;
	}
	public void setLibraryName(String libraryName)
	{
		this.libraryName = libraryName;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String State)
	{
		this.state = state;
	}
	public List<Book>getBooks()
	{
		return books;
	}
	public void addBook(Book B)
	{
		books.add(B);
	}
	public void removeBook(Book B)
	{
		books.remove(B);
	}
	public String toString()
	{
		return "Library Name: " + libraryName + ", City: " + city + ", State: " + state + ", Books: " + books;
	}
	public boolean equals(Library h)
	{
		return getLibraryName().equals(h.getLibraryName()) && getCity().equals(h.getCity()) && getState().equals(h.getState());
	}
}



