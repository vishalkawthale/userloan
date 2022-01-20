package com.user.loan.service_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.loan.model.Customer;
import com.user.loan.repository.CustomerRepository;
import com.user.loan.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		Customer savedCustomer = this.customerRepository.save(customer);
		return savedCustomer;
	}

}
