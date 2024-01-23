package Flyweight;
/* Flyweight pattern */
// A space optimization technique that lets us use less memory by storing
// externally the data associated with similar objects


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class User {
    private String fullName;

    public User(String fullName) {
        this.fullName = fullName;
    }
}

class User2 {
    static List<String> strings = new ArrayList<>();
    private int[] names;

    // Flyweight constructor
    public User2(String fullName) {
        Function<String, Integer> getOrAdd = (String s) -> {
            int idx = strings.indexOf(s);
            if (idx != -1) return idx;
            else {
                strings.add(s);
                return strings.size() - 1;
            }
        };

        names = Arrays.stream(fullName.split(" "))
                .mapToInt(getOrAdd::apply)
                .toArray();
    }
}


public class Demo {
    public static void main(String[] args) {
        User johnSmith = new User("John Smith");
        User janeSmith = new User("Jane Smith");

    }
}
