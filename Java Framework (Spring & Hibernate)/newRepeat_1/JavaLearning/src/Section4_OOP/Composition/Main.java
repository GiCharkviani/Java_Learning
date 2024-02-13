package Section4_OOP.Composition;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Motherboard myMotherboard = new Motherboard("xlxxs", "ASUS", 21, 32, 2, 4, 4, "Intel Bios");
        DigitalProduct myDigitalProduct = new DigitalProduct("Rgac", "vigac", "version 1", new Date());

        myMotherboard.logProductModel();

        // Using composition
        Demensions myMBDemenesions = myMotherboard.getDemensions();
        System.out.println(myMBDemenesions.getDepth());
    }
}
