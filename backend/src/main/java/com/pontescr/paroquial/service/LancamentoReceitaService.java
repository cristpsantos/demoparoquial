package com.pontescr.paroquial.service;

import com.pontescr.paroquial.dto.LancamentoReceitaBasicoDTO;
import com.pontescr.paroquial.dto.UsuarioInsereDTO;
import com.pontescr.paroquial.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pontescr.paroquial.dto.LancamentoReceitaFullDTO;
import com.pontescr.paroquial.repositories.LancamentoReceitaRepository;

@Service
public class LancamentoReceitaService {

	@Autowired
	private LancamentoReceitaRepository repository;

	@Transactional(readOnly = true)
	public Page<LancamentoReceitaBasicoDTO> findAllBasico(Pageable pageable) {
		Page<LancamentoReceita> list = repository.findAll(pageable);
		return list.map(x -> new LancamentoReceitaBasicoDTO(x));
	}

	@Transactional(readOnly = true)
	public Page<LancamentoReceitaFullDTO> findAll(Pageable pageable) {
		Page<LancamentoReceita> list = repository.findAll(pageable);
		return list.map(x -> new LancamentoReceitaFullDTO(x));
	}

	@Transactional
	public LancamentoReceitaFullDTO insert(LancamentoReceitaFullDTO dto) {
		LancamentoReceita entidade = new LancamentoReceita();
		copiaDtoParaEntidade(dto, entidade);
		entidade = repository.save(entidade);
		return new LancamentoReceitaFullDTO(entidade);
	}

	public void copiaDtoParaEntidade(LancamentoReceitaFullDTO dto, LancamentoReceita entidade) {

		entidade.setDataDevolucao(dto.getDataDevolucao());
		entidade.setMesReferente(dto.getMesReferente());
		entidade.setTipoReceita(dto.getTipoReceita());
		entidade.setValor(dto.getValor());
		entidade.setDizimista(new Dizimista(dto.getDizimistaDTO().getId()));
		entidade.setUsuario(new Usuario(dto.getUsuarioDTO().getId()));
		entidade.setMissa(new Missa(dto.getMissaDTO().getId()));
		entidade.setComunidade(new Comunidade(dto.getComunidadeDTO().getId()));
	}
}
