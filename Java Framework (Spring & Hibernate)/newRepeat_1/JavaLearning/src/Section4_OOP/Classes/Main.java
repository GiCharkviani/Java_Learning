package Section4_OOP.Classes;

public class Main {
    public static void main(String[] args) {
        Car BMW = new Car("M5", "N58");
        BMW.setColor("Black");
        System.out.println(BMW.getColor());
    }
}