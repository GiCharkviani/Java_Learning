public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 100;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        /* Enhanced (encapsulated) Player */

        EnhancedPlayer player = new EnhancedPlayer("Gio", 50, "M4");
        System.out.println("Initial health is " + player.getHitPoints());
        player.loseHealth(49);
        System.out.println("Initial health is " + player.getHitPoints());
        player.loseHealth(4);
        System.out.println("Initial health is " + player.getHitPoints());

        /* Printer Challenge */
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }
}
