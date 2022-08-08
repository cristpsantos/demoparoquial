package com.pontescr.paroquial.dto;

import java.io.Serializable;

import com.pontescr.paroquial.entities.Cidade;


public class CidadeDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	private EstadoDTO estadoDTO;
	
	public CidadeDTO() {
	}

	public CidadeDTO(Long id, String name, EstadoDTO estadoDTO) {
		this.id = id;
		this.name = name;
		this.estadoDTO = estadoDTO;
	}
	
	public CidadeDTO(Cidade entity) {
		id = entity.getId();
		name = entity.getName();
		estadoDTO = new EstadoDTO(entity.getEstado());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EstadoDTO getEstadoDTO() {
		return estadoDTO;
	}

	public void setEstadoDTO(EstadoDTO estadoDTO) {
		this.estadoDTO = estadoDTO;
	}
}
