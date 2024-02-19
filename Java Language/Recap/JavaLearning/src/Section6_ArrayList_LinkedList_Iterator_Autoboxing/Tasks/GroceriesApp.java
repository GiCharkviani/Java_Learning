package Section6_ArrayList_LinkedList_Iterator_Autoboxing.Tasks;

import java.util.ArrayList;

public class GroceriesApp {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();


    }

    public static void addItem(String item, ArrayList<String> list) {
        if(!list.contains(item)) {
            list.add(item);
        } else {
            System.out.println("The item " + item + " is already in the list");
        }
    }
}
