package com.remedios.guilherme.curso.Curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.remedios.guilherme.curso.Curso.remedio.RemedioRepository;

@SpringBootApplication
public class CursoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
		
	}

}
