package Section4_OOP.Classes;

public class Main {
    public static void main(String[] args) {
//        Car.logFactoryInfo();

        // Record
        PojoCar myPojoCar = new PojoCar("MERCEDES", "Merci");
        myPojoCar.model();


        Car BMW = new Car("M5", "N58");
        Car mercedes = new Car("C", "v6", 4, 4);
        Car toyota = new Car("4Runner");


//        BMW.setColor("red");
//        System.out.println(BMW.getColor());


        String myName = "Giorgi";
        String friendName = "Avto";

        if (myName.equals(friendName))
            System.out.println("They equal");
        else
            System.out.println("They don't equal");


        System.out.println(myName.length());
        System.out.println(myName.endsWith("i"));
        System.out.println(myName.charAt(0));

        StringBuilder myCar = new StringBuilder("Toyota");
        

    }
}