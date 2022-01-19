package com.user.loan.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "loan_table")
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loan_id")
	private int loanId;
	
	@Column(name = "loan_amount")
	private float loanAmount;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name = "trade_date")
	private Date tradeDate = new Date(System.currentTimeMillis());
	
	@Temporal(value = TemporalType.DATE)
	@Column(name = "loan_start_date", columnDefinition = "date")
	private Date loanStartDate;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name = "loan_maturity_date")
	private Date loanMaturityDate;
	
	@Column(name = "payment_frequency")
	private String paymentFrequency;
	
	@Column(name = "interest_rate")
	private float interestRate;
	
	@ManyToOne()
	private Customer customer;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "loan")
	private Payment payment;

}
