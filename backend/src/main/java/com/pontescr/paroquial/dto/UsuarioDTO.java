package com.pontescr.paroquial.dto;

import java.io.Serializable;

import com.pontescr.paroquial.entities.Usuario;

public class UsuarioDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String login;
	
	public UsuarioDTO() {
	}

	public UsuarioDTO(Long id, String nome, String login) {
		this.id = id;
		this.nome = nome;
		this.login = login;
	}
	
	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		nome = entity.getNome();
		login = entity.getLogin();
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
}
