package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    
        public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElse(null);
}

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
}

    public Customer updateCustomer(Long id, Customer newcustomer) {
    Customer existing = getCustomer(id);
    if (existing != null) {
        existing.setFirstName(newcustomer.getFirstName());
        existing.setLastName(newcustomer.getLastName());
        existing.setEmail(newcustomer.getEmail());
        existing.setPhone(newcustomer.getPhone());
        return customerRepository.save(existing);
    }
    return null;
}

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
}
}
    

