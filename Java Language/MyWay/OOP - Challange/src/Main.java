public class Main {
    public static void main(String[] args) {
        Hamburger myHam = new Hamburger();
        myHam.addCarrot().addLettuce().order();

        System.out.println("**********");

        HealthyBurger healthyBurger = new HealthyBurger("Just good");
        healthyBurger.addCarrot().addLettuce().addTomato().order();
        healthyBurger.totalPrice();
    }
}
