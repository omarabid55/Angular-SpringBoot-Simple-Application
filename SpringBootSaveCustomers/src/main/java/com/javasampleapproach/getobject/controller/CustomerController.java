package com.javasampleapproach.getobject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.getobject.model.Customer;
import com.javasampleapproach.getobject.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;		

	private final static String POST_CUSTOMER_URL = "/api/post/customer";

	@PostMapping(POST_CUSTOMER_URL)
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		
		System.out.println("Create Customer: " + customer.toString());
		customerService.addCustomer(customer);
		return ResponseEntity.ok(customer);
	}
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers() {		
		return customerService.getAllCustomers();
	}
}
