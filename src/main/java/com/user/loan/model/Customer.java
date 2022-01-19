package com.user.loan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "customer_table")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name = "customer_id")
	private int customerId;
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "customer_city")
	private String customerCity;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
	private List<Loan> loan;
	

}
