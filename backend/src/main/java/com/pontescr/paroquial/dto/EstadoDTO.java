package com.pontescr.paroquial.dto;

import java.io.Serializable;

import com.pontescr.paroquial.entities.Estado;

public class EstadoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	
	public EstadoDTO() {
	}

	public EstadoDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public EstadoDTO(Estado entity) {
		id = entity.getId();
		nome = entity.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
