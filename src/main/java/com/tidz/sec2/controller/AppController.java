package com.tidz.sec2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tidz.sec2.repository.UserRepository;

@Controller
public class AppController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
}
