import java.util.*;
import model.*;

// Driver Class
public class Driver1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Whale whale = new Whale("Willy", 10);
        Bird bird = new Bird("Robin", Habitat.LAND);

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(whale);
        animals.add(bird);

        for (Animal animal : animals) {
            if (animal instanceof Mammal) {
                Mammal mammal = (Mammal) animal;
                System.out.println("Name: " + mammal.getName());
                System.out.println("Age: " + mammal.getAge());
                mammal.makeSound();
                mammal.eat();
                mammal.move();
            } else if (animal instanceof Bird) {
                Bird birdObj = (Bird) animal;
                System.out.println("Name: " + birdObj.getName());
                System.out.println("Age: Unknown");
                birdObj.makeSound();
                birdObj.eat();
                System.out.println("Habitat: " + birdObj.getHabitat());
            }

            System.out.println();
        }
    }
}
