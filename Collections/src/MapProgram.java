import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        // If you use reserved for class name, you can fix it so:
//        java.util.Map<String, String> languages = new HashMap<>();

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code")); // returns null
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));

        // in Maps keys are uniques, new will overwrite existing one:
        languages.put("Java", "this course is about Java");
        System.out.println(languages.put("Java", "this course is about Java")); // will return previous value
//        System.out.println(languages.get("Java"));

        // check if key is contained:
        if(languages.containsKey("Java"))
            System.out.println("Java is already in the map");
        else
            languages.put("Java", "This course is about Java");

        System.out.println("----------------------");

        // removing items
//        languages.remove("Lisp");

        if(languages.remove("Algol", "a family of algorithmic languages"))
            System.out.println("Algo removed");
        else
            System.out.println("Algo not removed, key/value pair not found");

        // replacing item
//        System.out.println(languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features")); // will return previous entry
        System.out.println(languages.replace("Scala", "this will not be added")); // returns null

        if(languages.replace("Lisp", "this won't work", "a functional programming language with imperative features"))
            System.out.println("Lisp replaced");
        else
            System.out.println("Lisp was not replaced");

        // printing keys
        for(String key: languages.keySet())
            System.out.println(key + " -> " + languages.get(key));



    }
}
