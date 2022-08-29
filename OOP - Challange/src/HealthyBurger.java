public class HealthyBurger extends Hamburger {
    private boolean olives;
    private boolean onion;

    public HealthyBurger(String meat) {
        super("Brown rye bread", meat);
    }

    @Override
    public void order() {
        super.order();
        addPrice(2.4);
        addPrice(1.2);
    }

    @Override
    public void showTotalPrice() {
        super.showTotalPrice();
        System.out.println("\n Tomato: 2.4");
        System.out.println("\n Onion: 1.2");
    }
}
