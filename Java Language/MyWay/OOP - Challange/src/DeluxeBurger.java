public class DeluxeBurger extends Hamburger {
    private boolean chips;
    private boolean drinks;

    public DeluxeBurger() {
        super("The best bread", "The best meat");
    }

    @Override
    public void order() {
        super.order();
        addPrice(5);
        addPrice(12);
    }

    @Override
    public void showTotalPrice() {
        super.showTotalPrice();
        System.out.println("\n Chips: 5");
        System.out.println("\n Drinks: 12");
    }
}
