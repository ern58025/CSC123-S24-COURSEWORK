
public class Material 
{
	private String ItemReference;
	private String Title;
	private boolean SuitableForChildren;
	private double ReplacementValue;
	private String Location;
	
	public Material(String ItemReference, String Title, boolean SuitableForChildren,double ReplacementValue, String Location)
	{
		this.ItemReference = ItemReference;
		this.Title = Title;
		this.SuitableForChildren = SuitableForChildren;
		this.ReplacementValue = ReplacementValue;
		this.Location = Location;
	}

	public String getItemReference() 
	{
		return ItemReference;
	}
	public void setItemReference(String itemReference) 
	{
		ItemReference = itemReference;
	}
	public String getTitle() 
	{
		return Title;
	}
	public void setTitle(String title) 
	{
		Title = title;
	}
	public boolean getSuitableForChildren() 
	{
		return SuitableForChildren;
	}

	public void setSuitableForChildren(boolean suitableForChildren) 
	{
		SuitableForChildren = suitableForChildren;
	}

	public double getReplacementValue() 
	{
		return ReplacementValue;
	}

	public void setReplacementValue(double replacementValue) 
	{
		ReplacementValue = replacementValue;
	}

	public String getLocation() 
	{
		return Location;
	}

	public void setLocation(String location) 
	{
		Location = location;
	}
	public String toString()
	{
		return "Item Reference: " +ItemReference+ "Title: "+ Title+ "Suitable for children"+ SuitableForChildren+"" ;
	}
	
	
	

}
