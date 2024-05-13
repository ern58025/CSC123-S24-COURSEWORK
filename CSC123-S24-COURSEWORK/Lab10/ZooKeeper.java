public class ZooKeeper 
{
	public static void main(String[] args)
	{
		Animal lion = new Lion("Leo", 5, 200);
        Animal elephant = new Elephant("Jumbo", 10, 5000);
        Animal monkey = new Monkey("George", 3, 50);

        Animal[] animals = {lion, elephant, monkey};
        for (Animal animal : animals) {
            animal.makeSound();
	}
	
}}