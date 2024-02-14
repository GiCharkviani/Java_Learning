package Section4_OOP.Composition;

public class Motherboard extends Product {
    private int ramSlot;
    private int cardSlot;
    private String bios;

    // Composition
    private Demensions demensions;

    public Motherboard(String model, String manufacturer, int width, int height, int depth, int ramSlot, int cardSlot, String bios) {
        super(model, manufacturer);
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
        this.demensions = new Demensions(width, height, depth);
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

    public Demensions getDemensions() {
        return demensions;
    }
}
