// Lucas 9/10/24
// App.java
// String point to create objects from my classes

public class App {
    public static void main(String[] args) {

        System.out.println("\n\nWelcome to classes and object-oriented programming!\n");

        Student myNewStudent = new Student();

        myNewStudent.age = 64;
        myNewStudent.gpa = 3.4;
        myNewStudent.major = "History";
        myNewStudent.firstName = "Dennis";
        myNewStudent.lastName = "Mohle";
        myNewStudent.onProbation = true;

        // Output some stuff about or new object
        System.out.println("\n The first name of our student is: " + myNewStudent.firstName + "\n\n");

        // Create two more students.
        Student anotherStudent = new Student();
        Student oneMoreStu = new Student();

        oneMoreStu.major = "History";

        anotherStudent.age = 44;

        // How many students?
        System.out.println(" \n There were " + Student.numOfStudents + " Students objects crated!");

        // Create a phone object
        Phone myNewPhone = new Phone();

        myNewPhone.model = "Pixel 8";
        myNewPhone.numOfCameras = 3;

        System.out.println("\n myNewPhone has " + myNewPhone.numOfCameras + " Cameras!\n");

        // Create an array of Students
       stuArray = new Student[100];


        for (int i = 0; i < 100; i++) {
            // Create 100 new Student objects
            // Create names for my objects
            // Create Student objects
            Student studentNum = new Student();
        }

        // Create a cat object
        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;

        Cat.name = "George";

    }
}