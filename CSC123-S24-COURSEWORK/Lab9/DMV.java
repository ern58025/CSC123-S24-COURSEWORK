
public class DMV 
{
	private String license;
	private String records;
	private String streetQualified;
	private String legalPapers;
	private String awareness;
	
	public DMV(String license, String records, String streetQualified, String legalPapers, String awareness)
	{
		this.license = license;
		this.records = records;
		this.streetQualified = streetQualified;
		this.legalPapers = legalPapers;
		this.awareness = awareness;
	}
	public String getLicense()
	{
		return license;
	}
	public String getRecords()
	{
		return records;
	}
	public String getStreetQualified()
	{
		return streetQualified;
	}
	public String getLegalPapers()
	{
		return legalPapers;
	}
	public String getAwareness()
	{
		return awareness;
	}
	public String toString()
	{
		return "License: " + license + ", Records: " + records + ", Street ready?: " + streetQualified + ", legal papers?: " + legalPapers + ", Awareness: " + awareness;
	}
	
	

}
