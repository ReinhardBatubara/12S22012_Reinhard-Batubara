package model;

// Concrete Class
public class Dog extends Mammal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is running");
    }
}

