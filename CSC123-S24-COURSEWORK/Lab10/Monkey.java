
public class Monkey extends Animal
{
	private String scream;
	
	public Monkey(String name, int age, int weight, String scream)
	{
		super(name, age, weight);
		this.scream = scream;
	}
	public String getScream()
	{
		return scream;
	}
	public void setScream(String scream)
	{
		this.scream = scream;
	}
	public void makeSound()
	{
		System.out.println("OO AH AH");
	}

}
