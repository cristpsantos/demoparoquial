package com.pontescr.paroquial.dto;

import java.io.Serializable;

import com.pontescr.paroquial.entities.Missa;

public class MissaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String horario;

	public MissaDTO() {

	}

	public MissaDTO(Long id, String horario) {
		this.id = id;
		this.horario = horario;
	}
	
	public MissaDTO(Missa entity) {
		id = entity.getId();
		horario = entity.getHorario();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

}
