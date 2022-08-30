public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        Branch tbilisi = myBank.addBranch("Tbilisi");
        Customer giorgi = tbilisi.addCustomer("Giorgi", 24);
        giorgi.addTransaction(23);
        giorgi.addTransaction(23);
        giorgi.addTransaction(23);
        giorgi.addTransaction(23);

        Customer lasha = tbilisi.addCustomer("Lasha", 23);
        lasha.addTransaction(23);
        lasha.addTransaction(33);
        lasha.addTransaction(53);
        lasha.addTransaction(75);

        Customer merabi = tbilisi.addCustomer("Merabi", 53);
        merabi.addTransaction(33);
        merabi.addTransaction(321);
        merabi.addTransaction(3213);
        merabi.addTransaction(3213);

        Branch batumi = myBank.addBranch("Batumi");
        Customer misha = batumi.addCustomer("Misha", 53);
        misha.addTransaction(43);
        misha.addTransaction(343);
        misha.addTransaction(32);
        misha.addTransaction(66);

        Customer guga = batumi.addCustomer("Guga", 53);
        guga.addTransaction(74);
        guga.addTransaction(54);
        guga.addTransaction(31);
        guga.addTransaction(31);

        myBank.printBranches();

        batumi.addCustomer("Guga", 231);

    }
}
