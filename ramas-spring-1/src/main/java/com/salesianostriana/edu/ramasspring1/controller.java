package com.salesianostriana.edu.ramasspring1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

	@GetMapping("/")
	public String holaMundo(Model model) {
		model.addAttribute("mensaje","Hola mundo");
		return "index";
	}
	
}
