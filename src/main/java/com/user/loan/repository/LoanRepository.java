package com.user.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.user.loan.model.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer>{

}
