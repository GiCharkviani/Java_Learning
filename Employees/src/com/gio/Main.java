package com.gio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);


        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        Function<Employee, String> getLastName =
                (Employee employee) -> employee.getName().substring(employee.getName().indexOf(' ') + 1);

        for(Employee employee: employees)
            System.out.println(getName(getLastName, employee));

        System.out.println("\n********\n");

        Function<Employee, String> getFirstName = (Employee employee) ->
                employee.getName().substring(0, employee.getName().indexOf(' '));

        for(Employee employee: employees)
            System.out.println(getName(getFirstName, employee));
    }

    private static String getName(Function<Employee, String> getName, Employee employee) {
        return getName.apply(employee);
    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        System.out.println("==================");

        for(Employee employee: employees) {
            if (ageCondition.test(employee))
                System.out.println(employee.getName());
        }
    }
}
