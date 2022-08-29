package com.pontescr.paroquial.dto;

import com.pontescr.paroquial.entities.Usuario;

import java.io.Serializable;

public class UsuarioInsereDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String login;
    private Integer senha;

    public UsuarioInsereDTO() {
    }

    public UsuarioInsereDTO(Long id, String nome, String login, Integer senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public UsuarioInsereDTO(Usuario entity) {
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

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
}
