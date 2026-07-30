package com.luis.spring_boot_encurtador_url;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("titulo", "Encurtador de URL");
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
}
	
}


