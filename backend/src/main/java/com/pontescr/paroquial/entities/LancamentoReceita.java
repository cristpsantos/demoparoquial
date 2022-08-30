package com.pontescr.paroquial.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.*;

import com.pontescr.paroquial.enums.Receitas;

@Entity
@Table(name = "tb_lancamentoreceitas")
public class LancamentoReceita implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dataDevolucao;
	private LocalDate mesReferente;
	private Double valor;
	private Receitas tipoReceita;
	
	@ManyToOne
	@JoinColumn(name = "dizimista_id")
	private Dizimista dizimista;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "missa_id")
	private Missa missa;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "comunidade_id")
	private Comunidade comunidade;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	public LancamentoReceita() {
	}

	public LancamentoReceita(Long id, LocalDate dataDevolucao, Double valor, LocalDate mesReferente, Receitas tipoReceita,
			Dizimista dizimista, Missa missa, Comunidade comunidade, Usuario usuario) {
		this.id = id;
		this.dataDevolucao = dataDevolucao;
		this.valor = valor;
		this.mesReferente = mesReferente;
		this.dizimista = dizimista;
		this.missa = missa;
		this.comunidade = comunidade;
		this.usuario = usuario;
		this.tipoReceita = tipoReceita;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDate getMesReferente() {
		return mesReferente;
	}

	public void setMesReferente(LocalDate mesReferente) {
		this.mesReferente = mesReferente;
	}

	public Receitas getTipoReceita() {
		return tipoReceita;
	}

	public void setTipoReceita(Receitas tipoReceita) {
		this.tipoReceita = tipoReceita;
	}

	public Dizimista getDizimista() {
		return dizimista;
	}

	public void setDizimista(Dizimista dizimista) {
		this.dizimista = dizimista;
	}

	public Missa getMissa() {
		return missa;
	}

	public void setMissa(Missa missa) {
		this.missa = missa;
	}

	public Comunidade getComunidade() {
		return comunidade;
	}

	public void setComunidade(Comunidade comunidade) {
		this.comunidade = comunidade;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
		LancamentoReceita other = (LancamentoReceita) obj;
		return Objects.equals(id, other.id);
	}

}
