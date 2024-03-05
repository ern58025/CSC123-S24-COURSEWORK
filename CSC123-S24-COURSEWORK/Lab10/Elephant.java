
public class Elephant extends Animal
{
	private String proboscis;

	public Elephant(String name, int age, int weight, String proboscis)
	{
		super(name, age, weight);
		this.proboscis = proboscis;
	}
	public String getProboscis()
	{
		return proboscis;
	}
	public void setProboscis(String proboscis)
	{
		this.proboscis = proboscis;
	}
	public void makeSound()
	{
		System.out.println("*Snorts*");
	}
}
