import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }
}

public class Main {
    public static void main(String [] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Gio");

        // if we want to add integers
//        ArrayList<IntClass> intArrayList = new ArrayList<>();
//        intArrayList.add(new IntClass(54));


        Integer inter = new Integer(54);
        Double doubleValue = new Double(44);

        ArrayList<Integer> intArrayList = new ArrayList<>();

        // Autoboxing
        for(int i = 0; i <= 10; i++)
            intArrayList.add(Integer.valueOf(i)); // we could just pass i

        // Unboxing
        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        // autoboxing - improved
        Integer myIntValue = 56; // Integer.valueOf(56)
        // unboxing - improved
        int myInt = myIntValue; // myIntValue.intValue()


        // Just Doubles - not good
        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double dbl = 0.0; dbl < 10.0; dbl+= 0.5)
            myDoubleValues.add(Double.valueOf(dbl));

        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }

        // Doubles - improved
        ArrayList<Double> myDoubleValues1 = new ArrayList<>();
        for(double dbl = 0.0; dbl < 10.0; dbl+= 0.5)
            myDoubleValues1.add(dbl);

        for(int i = 0; i < myDoubleValues1.size(); i++) {
            double value = myDoubleValues1.get(i);
            System.out.println(i + " --> " + value);
        }


    }
}
