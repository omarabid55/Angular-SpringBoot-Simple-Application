package com.javasampleapproach.getobject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.getobject.repository.*;
import com.javasampleapproach.getobject.model.*;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers()
	{

		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}
	
	public Customer getCustomer(String name)
	{
		return customerRepository.findOne(name);
	}

	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public void updateCustomer(Customer customer, String name) {

		customerRepository.save(customer);
	}

	public void deleteCustomer(String name) {
		customerRepository.delete(name);
	}
}
