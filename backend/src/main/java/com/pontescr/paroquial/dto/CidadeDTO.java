package com.pontescr.paroquial.dto;

import java.io.Serializable;

import com.pontescr.paroquial.entities.Cidade;


public class CidadeDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	
	private EstadoDTO estadoDTO;
	
	public CidadeDTO() {
	}

	public CidadeDTO(Long id, String nome, EstadoDTO estadoDTO) {
		this.id = id;
		this.nome = nome;
		this.estadoDTO = estadoDTO;
	}
	
	public CidadeDTO(Cidade entity) {
		id = entity.getId();
		nome = entity.getNome();
		estadoDTO = new EstadoDTO(entity.getEstado());
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

	public EstadoDTO getEstadoDTO() {
		return estadoDTO;
	}

	public void setEstadoDTO(EstadoDTO estadoDTO) {
		this.estadoDTO = estadoDTO;
	}
}
