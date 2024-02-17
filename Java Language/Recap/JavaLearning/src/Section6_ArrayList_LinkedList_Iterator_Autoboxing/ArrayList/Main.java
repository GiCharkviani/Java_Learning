package Section6_ArrayList_LinkedList_Iterator_Autoboxing.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Tomato");
        shoppingList.add("Potato");
        shoppingList.add("Apple");
        shoppingList.add("Butter");

        System.out.println(shoppingList);

        ArrayList<String> birjavikebi = new ArrayList<>(List.of("Gela", "Cupala", "Xistava"));
        birjavikebi.add("Msmelebi");
        System.out.println(birjavikebi);

        System.out.println("*****");

        System.out.println(birjavikebi.size());
        System.out.println(birjavikebi.get(2));
        birjavikebi.set(0, "Chuchulika");

        System.out.println(birjavikebi);

        System.out.println("** Find Element ***");
        System.out.println(shoppingList.contains("Potato"));

        shoppingList.sort(Comparator.naturalOrder());
        System.out.println(shoppingList);

        String[] bros = {"Guga", "Gaga", "Bejana", "Dato", "Nika"};
        var brosList = Arrays.asList(bros);
        var otherBrosList = List.of(bros);
    }
}
