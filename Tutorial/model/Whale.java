package model;

// Concrete Class
public class Whale extends Mammal {
    public Whale(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Sing");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is swimming");
    }
}
