
public class Tires 
{
	private String rubber;
	private String rim;
	private String resistance;
	private String durability;
	private int size;
	
	public Tires(String rubber, String rim, String resistance, String durability, int size)
	{
		this.rubber = rubber;
		this.rim = rim;
		this.resistance = resistance;
		this.durability = durability;
		this.size = size;
	}
	public String getRubber()
	{
		return rubber;
	}
	public String getRim()
	{
		return rim;
	}
	public String getResistance()
	{
		return resistance;
	}
	public String getDruability()
	{
		return durability;
	}
	public int getSize()
	{
		return size;
	}
	public String toString()
	{
		return "Rubber: " + rubber + ", Rim: " + rim + ", Resistance: " + resistance + ", durability: " + durability + ", size: " + size;
	}

}
