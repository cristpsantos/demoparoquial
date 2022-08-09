package com.pontescr.paroquial.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.pontescr.paroquial.entities.Dizimista;

public class DizimistaDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String endereco;
	private String telefone;
	private LocalDate nascimento;
	
	private CidadeDTO cidadeDTO;
	
	public DizimistaDTO() {
	}

	public DizimistaDTO(Long id, String nome, String endereco, String telefone, LocalDate nascimento, CidadeDTO cidadeDTO) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.cidadeDTO = cidadeDTO;
	}
	
	public DizimistaDTO(Dizimista entity) {
		id = entity.getId();
		nome = entity.getNome();
		endereco = entity.getEndereco();
		telefone = entity.getTelefone();
		nascimento = entity.getNascimento();
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public CidadeDTO getCidadeDTO() {
		return cidadeDTO;
	}

	public void setCidadeDTO(CidadeDTO cidadeDTO) {
		this.cidadeDTO = cidadeDTO;
	}
}
