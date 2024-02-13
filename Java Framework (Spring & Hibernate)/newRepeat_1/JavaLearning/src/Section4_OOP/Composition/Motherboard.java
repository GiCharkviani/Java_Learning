package Section4_OOP.Composition;

public class Motherboard extends Product {
    private int ramSlot;
    private int cardSlot;
    private String bios;

    public Motherboard(String model, String manufacturer, int width, int height, int depth, int ramSlot, int cardSlot, String bios) {
        super(model, manufacturer, width, height, depth);
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public String getBios() {
        return bios;
    }
}
