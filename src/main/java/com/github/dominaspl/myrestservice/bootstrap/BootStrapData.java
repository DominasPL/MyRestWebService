package com.github.dominaspl.myrestservice.bootstrap;

import com.github.dominaspl.myrestservice.domain.entities.Customer;
import com.github.dominaspl.myrestservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Customer customer1 = new Customer();
        customer1.setFirstName("Dominik");
        customer1.setLastName("Stepuch");
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setFirstName("Arek");
        customer2.setLastName("Geszwanden");
        customerRepository.save(customer2);

        Customer customer3 = new Customer();
        customer3.setFirstName("Andrzej");
        customer3.setLastName("Stonoga");
        customerRepository.save(customer3);

        System.out.println("Customers saved: " + customerRepository.count());

    }
}
