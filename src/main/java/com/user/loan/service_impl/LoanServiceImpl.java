package com.user.loan.service_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.loan.model.Loan;
import com.user.loan.repository.LoanRepository;
import com.user.loan.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService {
	
	@Autowired
	private LoanRepository loanRepository;

	@Override
	public Loan addLoan(Loan loan) {
		Loan savedLoan = this.loanRepository.save(loan);
		return savedLoan;
	}

}
