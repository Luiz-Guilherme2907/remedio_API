package com.remedios.guilherme.curso.Curso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.guilherme.curso.Curso.remedio.DadosAtualizarRemedio;
import com.remedios.guilherme.curso.Curso.remedio.DadosCadastrosRemedio;
import com.remedios.guilherme.curso.Curso.remedio.DadosListagemRemedio;
import com.remedios.guilherme.curso.Curso.remedio.Remedio;
import com.remedios.guilherme.curso.Curso.remedio.RemedioRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
	
	
	@Autowired
	private RemedioRepository repository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastrosRemedio dados){

			repository.save(new Remedio(dados));
		
	}
	
	
	@GetMapping
	public List<DadosListagemRemedio> listar(){
		return repository.findAll().stream().map(DadosListagemRemedio::new).toList();
	}
	
	
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizarRemedio dados) {
		var remedio = repository.getReferenceById(dados.id()); //pegando o obj pelo id
		remedio.atualizarInformacoes(dados);
		
		
	}
	//@DeleteMapping ("/{id}")
	//@Transactional
	//public void deletarRemedio(@PathVariable Long id) {
		//repository.deleteById(id);
		
		
		
	//}
	
	
}
