public class Monkey extends Animal {
    public Monkey(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Oo oo aa aa");
    }
}