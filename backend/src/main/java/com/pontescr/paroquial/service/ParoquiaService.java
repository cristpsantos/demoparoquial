package com.pontescr.paroquial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pontescr.paroquial.dto.ParoquiaDTO;
import com.pontescr.paroquial.entities.Paroquia;
import com.pontescr.paroquial.repositories.ParoquiaRepository;

@Service
public class ParoquiaService {

	@Autowired
	private ParoquiaRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ParoquiaDTO> findAll(Pageable pageable) {
		Page<Paroquia> list = repository.findAll(pageable);
		return list.map(x -> new ParoquiaDTO(x));
	}
}
