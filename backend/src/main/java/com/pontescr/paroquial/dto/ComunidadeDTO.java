package com.pontescr.paroquial.dto;

import com.pontescr.paroquial.entities.Comunidade;

public class ComunidadeDTO {

	private Long id;
	private String nome;
	private String endereco;
	
	private CidadeDTO cidadeDTO;
	
	private ParoquiaDTO paroquiaDTO;
	
	public ComunidadeDTO() {
	}

	public ComunidadeDTO(Long id, String nome, String endereco, ParoquiaDTO paroquiaDTO, CidadeDTO cidadeDTO) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.paroquiaDTO = paroquiaDTO;
		this.cidadeDTO = cidadeDTO;
	}
	
	public ComunidadeDTO(Comunidade entity) {
		id = entity.getId();
		nome = entity.getNome();
		endereco = entity.getEndereco();
		paroquiaDTO = new ParoquiaDTO(entity.getParoquia());
		cidadeDTO = new CidadeDTO(entity.getCidade());
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public CidadeDTO getCidadeDTO() {
		return cidadeDTO;
	}

	public void setCidadeDTO(CidadeDTO cidadeDTO) {
		this.cidadeDTO = cidadeDTO;
	}

	public ParoquiaDTO getParoquiaDTO() {
		return paroquiaDTO;
	}

	public void setParoquiaDTO(ParoquiaDTO paroquiaDTO) {
		this.paroquiaDTO = paroquiaDTO;
	}	
}
