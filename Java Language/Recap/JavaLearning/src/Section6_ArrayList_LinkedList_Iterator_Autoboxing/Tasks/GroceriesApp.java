package Section6_ArrayList_LinkedList_Iterator_Autoboxing.Tasks;

import java.util.ArrayList;

public class GroceriesApp {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();

        addItem("Tomato", groceries);
        addItem("Potato", groceries);
        addItem("Cucumber", groceries);
        addItem("Bread", groceries);
        addItem("Souse", groceries);
        addItem("Pasta", groceries);
        addItem("Pepsi", groceries);
        showItems(groceries);

        System.out.println("*****");

        deleteItem("Tomato", groceries);
        showItems(groceries);

        System.out.println("*****");

        updateItem("Kitri", 1, groceries);
        showItems(groceries);

        System.out.println("*** Errors **");
        // Errors
        addItem("Pasta", groceries);
        deleteItem("Wine", groceries);
    }

    public static void addItem(String item, ArrayList<String> list) {
        if (!list.contains(item)) {
            list.add(item);
        } else {
            System.out.println("The item " + item + " is already in the list");
        }
    }

    public static void deleteItem(String item, ArrayList<String> list) {
        if (list.contains(item)) {
            list.remove(item);
        } else {
            System.out.println("The item " + item + " is not in the list");
        }
    }

    public static void showItems(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void updateItem(String newItem, int index, ArrayList<String> list) {
        list.set(index, newItem);
    }
}
