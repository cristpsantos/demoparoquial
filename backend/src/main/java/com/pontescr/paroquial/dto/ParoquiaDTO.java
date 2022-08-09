package com.pontescr.paroquial.dto;

import java.io.Serializable;

import com.pontescr.paroquial.entities.Paroquia;

public class ParoquiaDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String endereco;
	
	private CidadeDTO cidadeDTO;
	
	public ParoquiaDTO() {
	}

	public ParoquiaDTO(Long id, String nome, String endereco, CidadeDTO cidadeDTO) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cidadeDTO = cidadeDTO;
	}
	
	public ParoquiaDTO(Paroquia entity) {
		id = entity.getId();
		nome = entity.getNome();
		endereco = entity.getEndereco();
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
}
