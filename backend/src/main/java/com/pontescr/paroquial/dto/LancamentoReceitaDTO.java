package com.pontescr.paroquial.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.pontescr.paroquial.entities.LancamentoReceita;
import com.pontescr.paroquial.enums.Receitas;

public class LancamentoReceitaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private LocalDate dataDevolucao;
	private LocalDate mesReferente;
	private Double valor;
	private Receitas tipoReceita;
	
	private DizimistaDTO dizimistaDTO;
	
	private MissaDTO missaDTO;
	
	private ComunidadeDTO comunidadeDTO;
	
	private UsuarioDTO usuarioDTO;
	
	public LancamentoReceitaDTO() {
	}

	public LancamentoReceitaDTO(Long id, LocalDate dataDevolucao, LocalDate mesReferente, Receitas tipoReceita, Double valor,
			DizimistaDTO dizimistaDTO, MissaDTO missaDTO, ComunidadeDTO comunidadeDTO, UsuarioDTO usuarioDTO) {
		this.id = id;
		this.dataDevolucao = dataDevolucao;
		this.mesReferente = mesReferente;
		this.valor = valor;
		this.dizimistaDTO = dizimistaDTO;
		this.missaDTO = missaDTO;
		this.comunidadeDTO = comunidadeDTO;
		this.usuarioDTO = usuarioDTO;
		this.tipoReceita = tipoReceita;
	}
	
	public LancamentoReceitaDTO(LancamentoReceita entity) {
		id = entity.getId();
		dataDevolucao = entity.getDataDevolucao();
		mesReferente = entity.getMesReferente();
		valor = entity.getValor();
		dizimistaDTO = new DizimistaDTO(entity.getDizimista());
		missaDTO = new MissaDTO(entity.getMissa());
		comunidadeDTO = new ComunidadeDTO(entity.getComunidade());
		usuarioDTO = new UsuarioDTO(entity.getUsuario());
		tipoReceita = entity.getTipoReceita();
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

	public LocalDate getMesReferente() {
		return mesReferente;
	}

	public void setMesReferente(LocalDate mesReferente) {
		this.mesReferente = mesReferente;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Receitas getTipoReceita() {
		return tipoReceita;
	}

	public void setTipoReceita(Receitas tipoReceita) {
		this.tipoReceita = tipoReceita;
	}

	public DizimistaDTO getDizimistaDTO() {
		return dizimistaDTO;
	}

	public void setDizimistaDTO(DizimistaDTO dizimistaDTO) {
		this.dizimistaDTO = dizimistaDTO;
	}

	public MissaDTO getMissaDTO() {
		return missaDTO;
	}

	public void setMissaDTO(MissaDTO missaDTO) {
		this.missaDTO = missaDTO;
	}

	public ComunidadeDTO getComunidadeDTO() {
		return comunidadeDTO;
	}

	public void setComunidadeDTO(ComunidadeDTO comunidadeDTO) {
		this.comunidadeDTO = comunidadeDTO;
	}

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
}
