package com.gio.springdemo.rest;

import com.gio.springdemo.entity.Customer;
import com.gio.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    private CustomerService customerService;

    @Autowired
    private void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable int customerId) {
        Customer customer = customerService.getCustomer(customerId);

        if(customer == null)
            throw new CustomerNotFoundException("Customer id not found - " + customerId);

        return customer;
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer theCustomer) {
        theCustomer.setId(0);
        this.customerService.saveCustomer(theCustomer);
        return theCustomer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer theCustomer) {
        this.customerService.saveCustomer(theCustomer);

        return theCustomer;
    }

    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId) {
        Customer customer = this.customerService.getCustomer(customerId);

        if(customer == null)
            throw new CustomerNotFoundException("Customer id not found - " + customerId);

        this.customerService.deleteCustomer(customerId);

        return "Customer deleted. ID - " + customerId;
    }





}
