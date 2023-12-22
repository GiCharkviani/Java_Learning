package SOLID.LiskovSubstitutionPrinciple;

/* Liskov substitution principle */
// You should be able to substitute subclass from base class
// if you violated this principle, you will end up with wrong result in terms of inheritance

/*
Basic Idea: The principle states that objects of a superclass should be replaceable with objects of its subclasses
without affecting the correctness of the program. In other words, if class B is a subclass of class A, then
we should be able to replace A with B without disrupting the behavior of the program.

Example:

Suppose you have a class Bird with a method fly().
You have a subclass Sparrow which is a type of Bird, and it can fly().
If you have another subclass Penguin which is also a type of Bird, but it can't fly(),
this design would violate the Liskov Substitution Principle. In this case, having fly() in Bird assumes all birds can fly, which isn't true for Penguin.
*/


// correct way
// Superclass
class Bird {
    public void eat() {
        System.out.println("This bird eats.");
    }
}

// Subclass 1
class Sparrow extends Bird {
    public void fly() {
        System.out.println("Sparrow flying high.");
    }
}

// Subclass 2
class Ostrich extends Bird {
    public void run() {
        System.out.println("Ostrich running fast.");
    }
}

class BirdTest {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();

        testBird(sparrow);
        testBird(ostrich);
    }

    public static void testBird(Bird bird) {
        bird.eat();
        // The method fly() or run() is not called here, since not all birds can fly or run.
        // This adheres to LSP, as any Bird object can be substituted without altering the program behavior.
    }
}

// wrong way
public class Demo {

    // bad way
    static void useIt(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        // area = width * 10
        System.out.println("Expected area of " + (width * 10) +
                ", got " + r.getArea());
    };

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        useIt(rc);

        Rectangle sq = new Square();
        sq.setWidth(5);
        useIt(sq);
    }
}
