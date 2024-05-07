
public class DVD1 
{
	private String title;
	private String releaseDate;
	private String DurationInMin;
	
	public DVD1(String title, String releaseDate, String durationInMin) 
	{
		super();
		this.title = title;
		this.releaseDate = releaseDate;
		DurationInMin = durationInMin;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public String getReleaseDate() 
	{
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) 
	{
		this.releaseDate = releaseDate;
	}
	public String getDurationInMin() 
	{
		return DurationInMin;
	}
	public void setDurationInMin(String durationInMin) 
	{
		DurationInMin = durationInMin;
	}

}
