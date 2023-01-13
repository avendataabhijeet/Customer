package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Customer;
import com.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {	

		return customerService.addCustomer(customer);
	}
	

	@GetMapping("/getCustomerDetailsById/{customerId}")
	public Customer viewAllCustomeById(@PathVariable int customerId) {

		return customerService.viewById(customerId);
	}

	@DeleteMapping("/deleteCustomerDetailsById/{customerId}")
	public void deleteCustomerById(@PathVariable int customerId) {

		customerService.deleteByCustomerId(customerId);

	}

	@PutMapping("/updateCustomerDetailsById/{customerId}")
	public Customer updateCustomerById(@RequestBody Customer customer,@PathVariable int customerId) {

		return customerService.updateByCustomerId(customer, customerId);

	}

}
