package com.remedios.guilherme.curso.Curso.remedio;

public record DadosCadastrosRemedio(
		String nome, 
		Via via, 
		String lote, 
		String quantidade, 
		String validade, 
		Laboratorio laboratorio
		) {

}
