public class Lion extends Animal {
    public Lion(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}