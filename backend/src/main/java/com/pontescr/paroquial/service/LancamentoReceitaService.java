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

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LancamentoReceitaService {

	@Autowired
	private LancamentoReceitaRepository repository;

	@Transactional(readOnly = true)
	public Page<LancamentoReceitaFullDTO> findAll(Pageable pageable) {
		Page<LancamentoReceita> list = repository.findAll(pageable);
		return list.map(x -> new LancamentoReceitaFullDTO(x));
	}

	@Transactional(readOnly = true)
	public List<LancamentoReceitaFullDTO> findAllLancamentosDizimistas() {
		List<LancamentoReceita> list = repository.findAllLancamentosDizimistas();
		return list.stream().map(x -> new LancamentoReceitaFullDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public List<LancamentoReceitaBasicoDTO> findAllfindAllLancamentosOutrasReceitas() {
		List<LancamentoReceita> list = repository.findAllLancamentosOutrasReceitas();
		return list.stream().map(x -> new LancamentoReceitaBasicoDTO(x)).collect(Collectors.toList());
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
		System.out.println("Teste" + dto.getDizimistaDTO().getId());
		entidade.setUsuario(new Usuario(dto.getUsuarioDTO().getId()));
		entidade.setMissa(new Missa(dto.getMissaDTO().getId()));
		entidade.setComunidade(new Comunidade(dto.getComunidadeDTO().getId()));

		if (dto.getDizimistaDTO().getId() != null) {
			entidade.setDizimista(new Dizimista(dto.getDizimistaDTO().getId()));
		} else {
			entidade.setDizimista(null);
		}
	}
}
