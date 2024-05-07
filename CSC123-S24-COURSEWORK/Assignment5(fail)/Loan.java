
public class Loan 
{
	private String itemReference;
	private String member;
	private String dueBackDate;
	
	public Loan(String itemReference, String member, String dueBackDate) 
	{
		super();
		this.itemReference = itemReference;
		this.member = member;
		this.dueBackDate = dueBackDate;
	}
	public String getItemReference() 
	{
		return itemReference;
	}
	public void setItemReference(String itemReference) 
	{
		this.itemReference = itemReference;
	}
	public String getMember() 
	{
		return member;
	}
	public void setMember(String member) 
	{
		this.member = member;
	}
	public String getDueBackDate() 
	{
		return dueBackDate;
	}
	public void setDueBackDate(String dueBackDate) 
	{
		this.dueBackDate = dueBackDate;
	}
	

}
