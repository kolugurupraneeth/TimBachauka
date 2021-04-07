package Inheritance;

public class Main3 {

    public static void main(String[] args) {


        Animal animal = new Animal("German Shephered", 1, 1, 5, 5);
        // creating a dog class
        Dog dog = new Dog("chewy", 8, 20, 2, 4, 1, 20, "long silky");

        dog.eat();
        dog.walk();
        dog.run();
    }
}
