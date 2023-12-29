package Builder.Prototype;

/* Prototype */
// When it's easier to copy an existing object to fully initialize a new one
// A partially or fully initialized object that you copy (clone) and make use of.

import java.util.Arrays;

class Address implements Cloneable {
    public String streetName;
    public int houseNumber;

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    @Override
    public Address clone() {
        // valid deep copy
        return new Address(streetName, houseNumber);
    }
}

class Person implements Cloneable {
    public String[] names;
    public Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }

    @Override
    public Person clone() {
        return new Person(
                names.clone(),
                address.clone()
        );
    }
}

public class Demo {

    public static void main(String[] args) throws Exception {
        // Simple example
        Person john = new Person(new String[]{"John", "Smith"}, new Address("London Road", 123));
        Person jane = john.clone();
        jane.names[0] = "Jane";
        jane.address.houseNumber = 124;

        System.out.println(john);
        System.out.println(jane);
    }
}
