package com.remedios.guilherme.curso.Curso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.guilherme.curso.Curso.remedio.DadosCadastrosRemedio;
import com.remedios.guilherme.curso.Curso.remedio.Remedio;
import com.remedios.guilherme.curso.Curso.remedio.RemedioRepository;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
	
	
	@Autowired
	private RemedioRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastrosRemedio dados){

			repository.save(new Remedio(dados));
		
	}
}
