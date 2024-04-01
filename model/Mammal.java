package model;

// Abstract Class
public abstract class Mammal implements Animal {
    public String name;
    public int age;

    public Mammal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

    // Abstract method
    public abstract void move();
}

