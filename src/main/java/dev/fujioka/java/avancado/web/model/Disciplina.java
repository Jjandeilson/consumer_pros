package dev.fujioka.java.avancado.web.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Disciplina implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String nome;
	
	private Long cargaHoraria; 
	
	private String professor;
	
	private StatusDisciplina status;
	
	private String observacao;
}
