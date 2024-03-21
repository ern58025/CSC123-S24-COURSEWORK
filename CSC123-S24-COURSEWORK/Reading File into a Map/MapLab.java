import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class MapLab 
{
	public static void main(String[] args) throws Exception
	{
		HashMap<String, String> currencyMap = new HashMap<>();
		File f =new File("C:\\Users\\renes\\Downloads\\currencies.csv");
		Scanner sc = new Scanner(f);
		
		if(sc.hasNextLine())
		{
			sc.nextLine();
		}
		while(sc.hasNextLine())
		{
			String line = sc.nextLine();
			String[] parts = line.split(",");
			if(parts.length >= 2)
			{
				String currencyCode = parts[0].trim();
				currencyMap.put(currencyCode, line);
			}
		}
		for(String key : currencyMap.keySet())
		{
			System.out.println("Currency Code: " + key + ", Line: " + currencyMap.get(key));
		}
	}
}
