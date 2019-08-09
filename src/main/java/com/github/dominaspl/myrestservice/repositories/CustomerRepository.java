package com.github.dominaspl.myrestservice.repositories;

import com.github.dominaspl.myrestservice.domain.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {



}
