package com.pontescr.paroquial.dto;

import java.io.Serializable;

import com.pontescr.paroquial.entities.Estado;

public class EstadoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	
	public EstadoDTO() {
	}

	public EstadoDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public EstadoDTO(Estado entity) {
		id = entity.getId();
		name = entity.getName();
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
}
