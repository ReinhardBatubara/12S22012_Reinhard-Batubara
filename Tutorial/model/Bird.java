package model;

// Concrete Class
public class Bird implements Animal {
    public String name;
    public Habitat habitat;

    public Bird(String name, Habitat habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void eat() {
        System.out.println(name + " is pecking seeds");
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    public String getHabitat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHabitat'");
    }
}
