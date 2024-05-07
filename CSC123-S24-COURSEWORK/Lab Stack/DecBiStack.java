import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Set;

public class DecBiStack 
{
	public static void main(String[] args)
	{
		Map<Double, Double> decimalToBinary = new HashMap<Double,Double>();
		decimalToBinary.put(10.0, 10.0);
		decimalToBinary.put(8.0, 8.0);
		decimalToBinary.put(5.0, 5.0);
		decimalToBinary.put(2.0, 2.0);
		decimalToBinary.get(10.0);
		decimalToBinary.get(8.0);
		decimalToBinary.get(5.0);
		decimalToBinary.get(2.0);
		
		Set<Double> keys=decimalToBinary.keySet();
		System.out.print(decimalToBinary.pop);
		java.util.Set s = Map.keySet();
		
		Collection<Double> values = decimalToBinary.values();
		//((Stack) decimalToBinary).pop();
		for(Double value :values)
		{
			System.out.print(decimalToBinary.pop);
		}
	}

}
