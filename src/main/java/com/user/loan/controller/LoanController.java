package com.user.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.loan.model.Loan;
import com.user.loan.service.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {
	
	@Autowired
	private LoanService loanService;
	
	@PostMapping("/addLoan")
	public ResponseEntity<Loan> addLoanDetails(@RequestBody Loan loan){
		Loan addLoan = this.loanService.addLoan(loan);
		return new ResponseEntity<Loan>(addLoan, HttpStatus.CREATED);
	}
	
	

}
