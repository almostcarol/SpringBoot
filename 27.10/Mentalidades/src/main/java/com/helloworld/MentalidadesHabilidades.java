package com.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
	
public class MentalidadesHabilidades {

	@RestController 
	@RequestMapping("/mentalidades")
	public class helloController {

		@GetMapping
		public String hello() {
			return "Para realizar essa atividade foi necessário continuar persistindo e direcionar muita atenção aos detalhes ";
		}
	}
}