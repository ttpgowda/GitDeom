package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.CustomerRepo;
import com.example.demo.model.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public String addCustomer(Customer customer) {
		 customerRepo.save(customer);
		 
		 return "Request SuceesFul";
	}

}
