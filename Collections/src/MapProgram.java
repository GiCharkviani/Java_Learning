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

        // printing keys
        for(String key: languages.keySet())
            System.out.println(key + " -> " + languages.get(key));
    }
}
