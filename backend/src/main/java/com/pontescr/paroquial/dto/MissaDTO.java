package com.pontescr.paroquial.dto;

import java.io.Serializable;

import com.pontescr.paroquial.entities.Missa;

public class MissaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String horario;
	
	private ComunidadeDTO comunidadeDTO;

	public MissaDTO() {

	}

	public MissaDTO(Long id, String horario, ComunidadeDTO comunidadeDTO) {
		this.id = id;
		this.horario = horario;
		this.comunidadeDTO = comunidadeDTO;
	}
	
	public MissaDTO(Missa entity) {
		id = entity.getId();
		horario = entity.getHorario();
		comunidadeDTO = new ComunidadeDTO(entity.getComunidade());
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

	public ComunidadeDTO getComunidadeDTO() {
		return comunidadeDTO;
	}

	public void setComunidadeDTO(ComunidadeDTO comunidadeDTO) {
		this.comunidadeDTO = comunidadeDTO;
	}
}
