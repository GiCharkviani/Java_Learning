package Section8_Generics.CompableAndComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};
        for(Integer i: others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five,
                    val==0 ? "==" : (val < 0) ? "<" : ">", i, val);
        }

        System.out.println("*****");

        String banana = "banana";
        String[] fruits = {"apple", "banana", "pear", "BANANA"};
        for(String fruit: fruits) {
            int val = banana.compareTo(fruit);
            System.out.printf("%s %s %s: compareTo=%d%n", banana,
                    val==0 ? "==" : (val < 0) ? "<" : ">", fruit, val);
        }

        System.out.println("*****");

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
        System.out.println("A: " + (int)'A' + " " + "a:" + (int)'b');
        System.out.println("B: " + (int)'B' + " " + "b:" + (int)'b');
        System.out.println("P: " + (int)'P' + " " + "p:" + (int)'b');

        System.out.println("*****");

        Student tim = new Student("Tim");
        Student[] students = {
                new Student("Zach"),
                new Student("Tim"),
                new Student("Ann")
        };
        Arrays.sort(students);;
        System.out.println(Arrays.toString(students));
        System.out.println("result = " + tim.compareTo(new Student("TIM")));

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));
    }
}

class StudentGPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return (s1.gpa + s2.getName()).compareTo(s2.gpa + s2.getName());
    }
}

class Student implements Comparable<Student> {
    private static int LAST_ID = 1000;
    private static Random random = new Random();
    private int id;
    protected double gpa;

    private String name;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

    @Override
    public int compareTo(Student student) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(student.id));
    }
}
