package com.gio.controller;

import com.gio.models.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class DemoController {
    private List<Employee> employees;

    @PostConstruct
    private void loadData() {
        this.employees = new ArrayList<>();

        this.employees.add(new Employee("Gio", "Charkviani", "gi@gmail.com"));
        this.employees.add(new Employee("Java", "Gugava", "java@gmail.com"));
        this.employees.add(new Employee("Javascript", "Mamacia", "js@gmail.com"));
    }

    @GetMapping("/hello")
    public String sayHello(Model theModel) {
        theModel.addAttribute("theDate", new java.util.Date());

        return "helloWorld";
    }

    @GetMapping("/employees")
    public String getEmployees(Model theModel) {
        theModel.addAttribute("employees", this.employees);

        return "employees";
    }
}
