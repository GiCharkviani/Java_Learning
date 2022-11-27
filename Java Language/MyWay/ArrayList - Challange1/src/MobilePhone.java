import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    public void store(Contacts newContact) {
        int contactIndex = findContact(newContact.getName());
        if(contactIndex >= 0)
            System.out.println("Contact " + newContact.getName() + " already exists");
        else
            contacts.add(newContact);
    }

    public void modify(String currentContactName, Contacts newContact) {
        int contactIndex = findContact(currentContactName);
        if(contactIndex >= 0)
            replaceContact(contactIndex, newContact);
    }

    public boolean remove(String contactName) {
        int contactIndex = findContact(contactName);
        if(contactIndex >= 0) {
            contacts.remove(contactIndex);
            return true;
        } else
            return false;
    }

    public Contacts search(String contactName) {
        int contactIndex = findContact(contactName);
        if(contactIndex >= 0)
            return contacts.get(contactIndex);
        else
            return null;
    }

    public boolean find(String contactName) {
        return findContact(contactName) >= 0;
    }

    public void printAll() {
        ArrayList<Contacts> contactsArrayCopy = new ArrayList<Contacts>(getContacts());
        for(int i = 0; i < contactsArrayCopy.size(); i++) {
            Contacts foundContact = contactsArrayCopy.get(i);
            System.out.println("----- * ----");
            System.out.println("Contact name: " + foundContact.getName());
            System.out.println("Contact Phone number: " + foundContact.getPhoneNumber());
        }
    }

    private ArrayList<Contacts> getContacts() {
        return contacts;
    }

    private void replaceContact(int position, Contacts contact) {
        contacts.set(position, contact);
    }

    private int findContact(String contactName) {
        int foundContactIndex = -1;
        for(int i = 0; i < contacts.size(); i++) {
            if(contactName.equals(contacts.get(i).getName())) {
                foundContactIndex = contacts.indexOf(contacts.get(i));
                break;
            }
        }
        return foundContactIndex;
    }
}
