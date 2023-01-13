package com.customer.service;

import java.util.List;


import com.customer.model.Customer;

public interface CustomerServiceInterface {

	public Customer addCustomer(Customer customer);
	public List<Customer> viewAllCustomer();
	public Customer viewById(int customerId);
	public Customer updateByCustomerId( Customer customer,  int customerId);
	public void deleteByCustomerId(int customerId);


}
