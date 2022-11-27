import java.util.Scanner;

public class Main {
    private static boolean exit = false;
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        run();
        scanner.close();
    }

    public static void run() {
        while (!exit) {
            printMenu();
            switchChoice();
        }
    }

    public static void printMenu() {
        System.out.println("\n __CONTACTS__");
        System.out.println("\n Pick an options: ");
        System.out.println("\t 0 - List");
        System.out.println("\t 1 - add");
        System.out.println("\t 2 - Update");
        System.out.println("\t 3 - Search");
        System.out.println("\t 4 - Remove");
        System.out.println("\t 5 - Quit");
        System.out.print("\n Option #: ");
    }



    public static void switchChoice() {
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 0:
                print();
                break;
            case 1:
                add();
                break;
            case 2:
                update();
                break;
            case 3:
                search();
                break;
            case 4:
                remove();
                break;
            case 5:
                exit = true;
                break;
        }
    }

    private static void print() {
        mobilePhone.printAll();
    }

    private static void add() {
        System.out.print("Enter contact name: ");
        String contactName = scanner.nextLine();
        System.out.print("Enter contact Phone Number: ");
        long contactPhoneNumber = scanner.nextLong();
        mobilePhone.store(new Contacts(contactName, contactPhoneNumber));
    }

    private static void update() {
        System.out.print("Enter current contact name: ");
        String contactName = scanner.nextLine();
        if(mobilePhone.find(contactName)) {
            System.out.print("Enter new contact name: ");
            String newContactName = scanner.nextLine();
            System.out.print("Enter new contact Phone Number: ");
            int contactPhoneNumber = scanner.nextInt();
            Contacts newContact = new Contacts(newContactName, contactPhoneNumber);
            mobilePhone.modify(contactName, newContact);
        } else
            System.out.println("Contact name " + contactName + " doesn't exist");
    }

    private static void search() {
        System.out.print("Enter contact name to search: ");
        String contactName = scanner.nextLine();
        Contacts foundContact = mobilePhone.search(contactName);
        if(foundContact != null)
            System.out.println("Found contact with name "
                    + foundContact.getName() + " and phone number "
                    + foundContact.getPhoneNumber());
        else
            System.out.println("No contact found with name " + contactName);
    }

    public static void remove() {
        System.out.print("Enter contact name to remove: ");
        String contactName = scanner.nextLine();
        if(mobilePhone.remove(contactName))
            System.out.println("Contact with name " + contactName + " was removed");
        else
            System.out.println("Contact with name " + contactName + " was not found to remove");
    }
}
