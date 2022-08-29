package com.pontescr.paroquial.service;

import com.pontescr.paroquial.dto.CidadeDTO;
import com.pontescr.paroquial.entities.Cidade;
import com.pontescr.paroquial.entities.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pontescr.paroquial.dto.DizimistaDTO;
import com.pontescr.paroquial.entities.Dizimista;
import com.pontescr.paroquial.repositories.DizimistaRepository;

@Service
public class DizimistaService {

	@Autowired
	private DizimistaRepository repository;
	
	@Transactional(readOnly = true)
	public Page<DizimistaDTO> findAll(Pageable pageable) {
		Page<Dizimista> list = repository.findAll(pageable);
		return list.map(x -> new DizimistaDTO(x));
	}

	@Transactional
	public DizimistaDTO insert(DizimistaDTO dto) {
		Dizimista entidade = new Dizimista();
		copiaDtoParaEntidade(dto, entidade);
		entidade = repository.save(entidade);
		return new DizimistaDTO(entidade);
	}

	public void copiaDtoParaEntidade(DizimistaDTO dto, Dizimista entidade) {

		entidade.setNome(dto.getNome());
		entidade.setEndereco(dto.getEndereco());
		entidade.setTelefone(dto.getTelefone());
		entidade.setNascimento(dto.getNascimento());
		entidade.setCidade(new Cidade(dto.getCidadeDTO().getId()));
	}
}
