package Section6_ArrayList_LinkedList_Iterator_Autoboxing.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> grocerieas = new LinkedList<>();
        grocerieas.add("Tomato");
        grocerieas.add("Potato");
        grocerieas.add("Bread");

//        System.out.println(grocerieas.get(0));
        grocerieas.addFirst("Banana");
//        System.out.println(grocerieas.get(0));

//        for(String item: grocerieas) {
//            System.out.println(item);
//        }

        var iterator = grocerieas.listIterator();
        for (int i = 0; i < grocerieas.size(); i++) {
            if(iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
