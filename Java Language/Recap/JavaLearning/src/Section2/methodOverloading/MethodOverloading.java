package Section2.methodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        // Method overloading
        logMyInfo("Giorgi", "Charkvi");
        logMyInfo("Giorgi", 21);
    }

    // Methods overloading
    public static void logMyInfo(String name, String surname) {
        System.out.println("My name is " + name + " and surname is " + surname);
    }

    public static void logMyInfo(String name, int age) {
        System.out.println("My name is " + name + " and age is " + age);
    }
}
