package com.khs.customer;

import org.springframework.stereotype.Service;

@Service ("customerService")
public class CustomerServiceImpl implements CustomerService {

	private Customer customer = new Customer("John", "Smith");

	@Override
	public String sayHello() {
		return "Hello from  " + customer.getFirstName() + " " + customer.getLastName()  ;
	}
}
