package com.jobiak.mvcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mvcbank.model.Bank;
import com.jobiak.mvcbank.repository.BankRepository;

@Controller
public class BankController {

	@Autowired
	BankRepository repo;
	
	public BankController() {
		// TODO Auto-generated constructor stub
	}

	public BankController(BankRepository repo) {
		this.repo = repo;
	}

	@RequestMapping(path="/test1",method=RequestMethod.GET)
	public String redirect() {
		return "bankform";
	}
 @RequestMapping(path="/bankform",method=RequestMethod.POST)
	public String bank(@ModelAttribute("bank")Bank bank) {

	 	 
	 repo.save(bank); 
		return "banksuccess";
	}
}
