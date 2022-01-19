package com.user.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.loan.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
