package dev.fujioka.java.avancado.web.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String nome;
	
	private String duracao;
	
	private Long quantidadePeriodo;
	
}
