package com.jobiak.springbootvalidation.controller;

import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jobiak.springbootvalidation.model.SignupBean;

import ch.qos.logback.classic.Logger;



@Controller
public class SignupController {
	
	Logger logger=(Logger) LoggerFactory.getLogger(SignupController.class);
	/*
	 * @GetMapping("/signup") public String doSignup(Model model) { SignupBean
	 * signupBean = new SignupBean(); model.addAttribute("signupBean",signupBean);
	 * return "signup"; }
	 */

	@PostMapping("/signupform")
	public String doSignupForm(@Valid @ModelAttribute("signupBean")SignupBean signupBean,BindingResult errors,Model model) {
		
		logger.info(signupBean.toString());
		//System.out.println(signupBean);
		if(errors.hasErrors()) {
			return "signup";
		}
		model.addAttribute("signupBean",signupBean);
		return "success";
	}
}