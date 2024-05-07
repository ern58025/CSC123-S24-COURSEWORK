import java.util.UUID;

public class DVDlll extends Material
{
	private String releaseDate;
	private int durationInMinutes;
	
	public DVDlll(String Title, boolean SuitableForChildren, double ReplacementValue,
            String Location, String releaseDate, int durationInMinutes)
	{
		super(UUID.randomUUID().toString(), Title, SuitableForChildren, ReplacementValue, Location);
		this.releaseDate = releaseDate;
		this.durationInMinutes = durationInMinutes;
	}
	public String getReleaseDate()
	{
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate)
	{
		this.releaseDate = releaseDate;
	}
	public int getDurationInMinutes()
	{
		return durationInMinutes;
	}
	public void setDurationInMinutes(int durationInMinutes)
	{
		this.durationInMinutes = durationInMinutes;
	}
	@Override
	public String toString()
	{
		return "DVD: "+"Item Reference: "+getItemReference()+", Title: "+getTitle()+",Suitable for Children: "+getSuitableForChildren()+", Replacement Value: "+getReplacementValue()+",Location: "+getLocation()+", Release Date: "+ releaseDate+ ", Duration in minutes: "+durationInMinutes;
	}

}
