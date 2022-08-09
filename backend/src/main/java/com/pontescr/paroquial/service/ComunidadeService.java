package com.pontescr.paroquial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pontescr.paroquial.dto.ComunidadeDTO;
import com.pontescr.paroquial.entities.Comunidade;
import com.pontescr.paroquial.repositories.ComunidadeRepository;

@Service
public class ComunidadeService {

	@Autowired
	private ComunidadeRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ComunidadeDTO> findAll(Pageable pageable) {
		Page<Comunidade> list = repository.findAll(pageable);
		return list.map(x -> new ComunidadeDTO(x));
	}
}
