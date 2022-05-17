package com.jobiak.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mvc.model.Customer;
import com.jobiak.mvc.repository.CustomerRepository;


@Controller
public class CustomerController {
	
	@Autowired
	CustomerRepository  repo;

	/*
	 * public CustomerController() { // TODO Auto-generated constructor stub }
	 * 
	 * public CustomerController(CustomerRepository repo) { this.repo = repo; }
	 */
	@RequestMapping(path="/test1",method=RequestMethod.GET)
	public String redirect() {
		return "custform";
	}
 @RequestMapping(path="/custform",method=RequestMethod.POST)
	public String doBank(@ModelAttribute("customer")Customer customer) {
	 repo.save(customer); 
		return "customersuccess";
	}
}
