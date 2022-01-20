package com.user.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.user.loan.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	
	

}
