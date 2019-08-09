package com.github.dominaspl.myrestservice.services;

import com.github.dominaspl.myrestservice.domain.entities.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

}
