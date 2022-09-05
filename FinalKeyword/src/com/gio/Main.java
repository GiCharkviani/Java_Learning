package com.gio;

public class Main {
    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
////        one.instanceNumber = 4; // won't assign
//        System.out.println(Math.PI);
//
//        int pw = 59345331;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(444);
//        password.letMeIn(3123131);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(59345331);


        // Statics are called only once
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

        System.out.println("-----");

        SIBTest test2 = new SIBTest();
        test2.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
