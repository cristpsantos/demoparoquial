package com.pontescr.paroquial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pontescr.paroquial.dto.CidadeDTO;
import com.pontescr.paroquial.entities.Cidade;
import com.pontescr.paroquial.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repository;
	
	@Transactional(readOnly = true)
	public Page<CidadeDTO> findAll(Pageable pageable) {
		Page<Cidade> list = repository.findAll(pageable);
		return list.map(x -> new CidadeDTO(x));
	}
}
