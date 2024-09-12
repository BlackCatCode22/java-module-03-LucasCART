// Lucas 9/12/24
// Main.java

import myanimals.Animal;
import myanimals.Dog;
import myanimals.Cat;
import mystudent.Student;
import mystudent.App;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello and welcome from the Main \n");

        // Create a student object.
        Student student = new Student();

        // Create an object from a runnable class.
        App app = new App();

        // Use a method from the Student class.
        // I know that I have a static method in the Student class, and I know how to call a static class method
        Student.sayHello();

        // Call a method that belongs to the student object.
        student.sayHi();

        // Output the number of animals before any are created
        System.out.println("\nThe number of animals is " + Animal.numOfAnimals);

        // Create a Cat object.
        Cat cat = new Cat();
        // Use a method that is available to the Cat object named cat
        System.out.println("\nThis sound is coming from the Cat object named cat...");
        cat.animalSound();

        // Create a Dog object.
        Dog dog = new Dog();
        // Use a method that is available to the Dog object named dog
        System.out.println("\nThis sound is coming from the Dog object named dog...");
        dog.animalSound();

        // Output the number of animals after a few Animal objects were created!
        System.out.println("\nThe number of animals after a few were created is " + Animal.numOfAnimals);


    }
}