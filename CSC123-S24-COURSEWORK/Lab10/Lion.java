
public class Lion extends Animal
{
	public String lionType;

	public Lion(String name, int age, int weight, String lionType)
	{
		super(name, age, weight);
		this.lionType = lionType;
	}
	public String getLionType()
	{
		return lionType;
	}
	public void setLionType(String lionType)
	{
		this.lionType = lionType;
	}
	public void makeSound()
	{
		System.out.println("Roar");
	}
}
