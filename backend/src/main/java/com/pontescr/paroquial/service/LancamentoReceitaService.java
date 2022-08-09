package com.pontescr.paroquial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pontescr.paroquial.dto.LancamentoReceitaDTO;
import com.pontescr.paroquial.entities.LancamentoReceita;
import com.pontescr.paroquial.repositories.LancamentoReceitaRepository;

@Service
public class LancamentoReceitaService {

	@Autowired
	private LancamentoReceitaRepository repository;
	
	@Transactional(readOnly = true)
	public Page<LancamentoReceitaDTO> findAll(Pageable pageable) {
		Page<LancamentoReceita> list = repository.findAll(pageable);
		return list.map(x -> new LancamentoReceitaDTO(x));
	}
}
