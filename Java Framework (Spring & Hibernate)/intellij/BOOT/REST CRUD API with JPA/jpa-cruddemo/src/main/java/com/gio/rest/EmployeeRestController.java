package com.gio.rest;

import com.gio.entity.Employee;
import com.gio.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee findById(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);

        if(employee == null)
            throw new RuntimeException("Employee id not found - " + employeeId);

        return employee;
    }

    @PostMapping("/employees")
    public Employee AddEmployee(@RequestBody Employee theEmployee) {
        theEmployee.setId(0);
        employeeService.save(theEmployee);
        return theEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
        employeeService.save(theEmployee);
        return theEmployee;
    }

    @DeleteMapping("/employee/{employeeId}")
    public Employee deleteEmployeeById(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);
        if(employee == null)
            throw new RuntimeException("Employee id not found - " + employeeId);
        employeeService.deleteById(employeeId);
        return employee;
    }

}
