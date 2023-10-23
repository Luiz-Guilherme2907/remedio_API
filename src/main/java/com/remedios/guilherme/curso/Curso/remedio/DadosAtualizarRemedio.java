package com.remedios.guilherme.curso.Curso.remedio;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarRemedio(
		@NotNull
		Long id,

		String nome, 
		Via via, 
		Laboratorio laboratorio) {
		
}
