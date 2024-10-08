// Lucas 9/19/24
// Main.java
// Driver file for Animal and Hyena class usage.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to my Zoo Program!");

        // Open the arriving animals file.
        try {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("\"C:\\Users\\BE218\\Downloads\\arrivingAnimals.txt\""))
        String myLine;

        // Read the file one line at a time
        while (myLine = bufferedReader.readLine()) != null) {
            System.out.println(myLine);
        }
        } catch (IOException e) {
            throw new RuntimeException(e);
            }


        // Create an Animal object.
        Animal myAnimalObject = new Animal();

        myAnimalObject.setAge(4);

        // Use our new Animal object.
        System.out.println("\nMy animal's age is: " + myAnimalObject.getAge() + " years old.");

        // Create a Hyena object
        Hyena myNewHyena = new Hyena();

        myNewHyena.setAge(7);

        // Output the age of our Hyena
        System.out.println("\nThe age of our Hyena is " + myNewHyena.getAge() +  " years old.");

        // Create a Lion object
        Lion myLion = new Lion();

        // Make the lion 12 years old

        myLion.setAge(12);

        // Output our lion's age.
        System.out.println("\nOur lion is " + myLion.getAge() + " years old.");

        // Output the number of animals.
        System.out.println("\nThe number of animals created is: " + Animal.numOfAnimals);



    }
}