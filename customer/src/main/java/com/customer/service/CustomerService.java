package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.customer.dao.CustomerDao;
import com.customer.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;

	public Customer addCustomer(Customer customer) {
		// List<Customer> list = customerDao.findAll();
		return customerDao.save(customer);

	}

	public List<Customer> viewAllCustomer() {
		return customerDao.findAll();

	}

	public Customer viewById(int customerId) {
		return customerDao.findById(customerId).get();
	}

	public Customer updateByCustomerId(@RequestBody Customer customer, @PathVariable int customerId) {
		Customer customerUpdate = customerDao.findById(customerId).get();
		customerUpdate.setFirstName(customer.getFirstName());
		customerUpdate.setLastName(customer.getLastName());
		customerUpdate.setEmail(customer.getEmail());
		customerUpdate.setAge(customer.getAge());
		return customerDao.save(customerUpdate);

	}
	
	public void deleteByCustomerId(int customerId) {
		
		customerDao.deleteById(customerId);
	}
}
