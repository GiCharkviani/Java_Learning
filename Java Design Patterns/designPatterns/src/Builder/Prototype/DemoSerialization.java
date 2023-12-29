package Builder.Prototype;

/* Prototype */
// Serialization

import java.io.Serializable;

class Foo implements Serializable {
    public int stuff;
    public String whatever;

    public Foo(int stuff, String whatever) {
        this.stuff = stuff;
        this.whatever = whatever;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "stuff=" + stuff +
                ", whatever='" + whatever + '\'' +
                '}';
    }
}


public class DemoSerialization {
    public static void main(String[] args) {
        Foo foo = new Foo(42, "life");
        /*
        from apache common
            1. Serializing
            2. Deserializing
         */
//        SerializationUtils.roundtrip(foo);
    }
}
