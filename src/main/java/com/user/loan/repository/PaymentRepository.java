package com.user.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.loan.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	
	

}
