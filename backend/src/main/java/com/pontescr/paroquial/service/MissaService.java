package com.pontescr.paroquial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pontescr.paroquial.dto.MissaDTO;
import com.pontescr.paroquial.entities.Missa;
import com.pontescr.paroquial.repositories.MissaRepository;

@Service
public class MissaService {

	@Autowired
	private MissaRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MissaDTO> findAll(Pageable pageable) {
		Page<Missa> list = repository.findAll(pageable);
		return list.map(x -> new MissaDTO(x));
	}
}
