package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenticationController {
	@GetMapping("AccountLogin")
	public String accountLogin() {
		return "AccountLogin";
	}
	
	@PostMapping("/homepage")
	public String show(@RequestParam("username") String username,
			@RequestParam("password") String password,
			ModelMap modelMap) {
		modelMap.put("username", username);
		modelMap.put("password", password);
		if(!username.equals("Engin Akar") || !password.equals("12345")) { return "AccountLogin";}
		return "Entry";
	}

}
