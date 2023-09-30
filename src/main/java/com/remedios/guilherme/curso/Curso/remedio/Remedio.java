package com.remedios.guilherme.curso.Curso.remedio;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "remedio")
@Entity(name = "remedios")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Remedio {
	public Remedio(DadosCadastrosRemedio dados) {
		this.nome = dados.nome();		// TODO Auto-generated constructor stu
		this.via = dados.via();
		this.lote = dados.lote();
		this.quantidade = dados.quantidade();
		this.validade = dados.validade();
		this.laboratorio = dados.laboratorio();
	}

	@Getter
	@Setter
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Getter
	@Setter
	private String nome; 
	
	@Enumerated(EnumType.STRING)
	private Via via; 
	@Getter
	@Setter
	private String lote;
	
	@Getter
	@Setter
	private int quantidade;
	
	@Getter
	@Setter
	private LocalDate validade;
	
	@Enumerated(EnumType.STRING)
	private Laboratorio laboratorio;
		
}