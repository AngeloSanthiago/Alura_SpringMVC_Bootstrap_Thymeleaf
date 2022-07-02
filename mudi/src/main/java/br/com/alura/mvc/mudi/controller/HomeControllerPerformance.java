package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllerPerformance {
	@GetMapping("/homeperformance")
	public String home(Model model) {
			
		model.addAttribute("java_home", System.getProperty("java.home"));
		
		return "homeperformance";
	}

}
