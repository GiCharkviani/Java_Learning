package Section4_OOP.Composition;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Motherboard myMotherboard = new Motherboard("xlxxs", "ASUS", 21, 32, 2, 4, 4, "Intel Bios");
        DigitalProduct myDigitalProduct = new DigitalProduct("Rgac", "vigac", 21, 32, 3, "version 1", new Date());


    }
}
