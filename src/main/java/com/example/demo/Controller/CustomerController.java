package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CustomerService;
import com.example.demo.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/Customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	
	@PostMapping("/addCust")
	public String addCustomer(@RequestBody Customer customer) {
		//TODO: process POST request
		return customerService.addCustomer(customer);
	}
	

}
