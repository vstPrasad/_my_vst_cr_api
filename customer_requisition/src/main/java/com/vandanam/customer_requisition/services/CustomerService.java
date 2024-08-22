package com.vandanam.customer_requisition.services;

import com.vandanam.customer_requisition.models.Customer;
import com.vandanam.customer_requisition.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void deleteCustomer(String id) {
        Customer c=customerRepository.findById(id).get();
        c.setIsActive(false);
        customerRepository.save(c);
    }
}