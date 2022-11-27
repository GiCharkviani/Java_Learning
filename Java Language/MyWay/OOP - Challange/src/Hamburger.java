public class Hamburger {
    private String rollType;
    private String  meat;
    private double BASE_PRICE = 4.5;
    private double price;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;

    public Hamburger() {
        this("White Bread", "Beef");
    }

    public Hamburger(String rollType) {
        this(rollType, "Beef");
    }

    public Hamburger(String rollType, String meat) {
        this.rollType = rollType;
        this.meat = meat;
    }

    public Hamburger addLettuce() {
        lettuce = true;
        return this;
    }

    public Hamburger addTomato() {
        tomato = true;
        return this;
    }

    public Hamburger addCarrot() {
        carrot = true;
        return this;
    }

    protected void addPrice(double price) {
        this.price += price;
    }

    public void order() {
        price += BASE_PRICE;
        if(lettuce)
            addPrice(0.5);
        if(tomato)
            addPrice(1.5);
        if(carrot)
            addPrice(0.7);
        showTotalPrice();
    }

    public void totalPrice() {
        System.out.println("\n Total price: " + price);;
    }

    protected void showTotalPrice() {
        System.out.println("Ordered burger price: \n Base: " + BASE_PRICE);
        if(lettuce)
            System.out.println("\n Lettuce: 0.5");
        if(tomato)
            System.out.println("\n Tomato: 1.5");
        if(carrot)
            System.out.println("\n Carrot: 0.7");
    }


}
