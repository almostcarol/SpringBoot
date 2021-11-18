package com.aprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping("/objetivos")

public class AprendizagemController {
	@GetMapping
	public String hello() {
		return "Objetivos de aprendizagem para semana: Banco de dados (MySQL) e SpringBoot";
	}
}