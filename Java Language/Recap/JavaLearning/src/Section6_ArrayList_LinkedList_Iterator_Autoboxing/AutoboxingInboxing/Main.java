package Section6_ArrayList_LinkedList_Iterator_Autoboxing.AutoboxingInboxing;

public class Main {
    public static void main(String[] args) {
//        LinkedList<int> numbers = new LinkedList<int>(); // Will throw error
        Integer myAge = 21; // Autoboxing
        Double amount = Double.valueOf(33.2); // boxing
        Integer number = Integer.valueOf(22);

        int myNewAge = myAge.intValue(); // manually unboxing
        int numberNumber = myAge; // automatic unboxing

        System.out.println(myAge);
    }
}
