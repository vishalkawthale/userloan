package com.user.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.loan.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer>{

}
