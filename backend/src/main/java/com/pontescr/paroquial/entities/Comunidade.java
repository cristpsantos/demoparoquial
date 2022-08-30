package com.pontescr.paroquial.entities;

import com.pontescr.paroquial.dto.CidadeDTO;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_comunidades")
public class Comunidade implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String endereco;
	
	@ManyToOne
	@JoinColumn(name = "paroquia_id")
	private Paroquia paroquia;
	
	@ManyToOne
	@JoinColumn(name = "cidade_id")
	private Cidade cidade;
	
	public Comunidade() {
	}

	public Comunidade(Long id) {
		this.id = id;
		this.paroquia = new Paroquia(id);
		this.cidade = new Cidade(id);
	}

	public Comunidade(Long id, String nome, String endereco, Paroquia paroquia, Cidade cidade) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.paroquia = paroquia;
		this.cidade = cidade;
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

	public Paroquia getParoquia() {
		return paroquia;
	}

	public void setParoquia(Paroquia paroquia) {
		this.paroquia = paroquia;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comunidade other = (Comunidade) obj;
		return Objects.equals(id, other.id);
	}
}
