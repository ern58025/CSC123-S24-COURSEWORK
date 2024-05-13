public class Elephant extends Animal {
    public Elephant(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("*Trumpet sound*");
    }
}