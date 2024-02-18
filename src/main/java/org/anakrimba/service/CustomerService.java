package org.anakrimba.service;

import org.anakrimba.entity.Customer;
import org.anakrimba.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public Customer findById(Long id) {
        return customerRepo.findById(id).orElse(null);
    }

    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }

    public Iterable<Customer> findAll() {
        return customerRepo.findAll();
    }

    public Customer findByEmail(String email) {
        return customerRepo.findByEmail(email);
    }
}
