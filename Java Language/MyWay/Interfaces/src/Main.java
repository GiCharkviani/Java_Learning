public class Main {
    public static void main(String[] args) {
//        ITelephone myPhone = new DeskPhone(123456); // it's not valid
//        DeskPhone myPhone = new DeskPhone(123456); // it's valid
        ITelephone myPhone;
        myPhone = new DeskPhone(123456);
        myPhone.powerOn();
        myPhone.callPhone(123456);
        myPhone.answer();

        /* We can store the class which implements the same interface */
        myPhone = new MobilePhone(5444123);
        myPhone.powerOn();
        myPhone.callPhone(5444123);
        myPhone.answer();

        /* Saveable Challenge (simplified) */
        ISaveable player = new Player("Gio", 100, 100);
        ISaveable monster = new Monster("Guga", 32, 32);

    }
}
