public class Cat {

    private static int catCount = 0;

    String name;

    int age;

    int livesRemaining;

    // LivesRemaining = 9 lives

    public void meow(){
        System.out.println("Meow");
    }

    public Cat () {
        catCount++;
    }

    public static int getCatCount(){
        return catCount;
    }

}
