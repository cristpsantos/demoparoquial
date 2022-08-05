package com.pontescr.paroquial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pontescr.paroquial.entities.Cidade;
import com.pontescr.paroquial.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repository;
	
	@Transactional(readOnly = true)
	public List<Cidade> findAll() {
		List<Cidade> list = repository.findAll();
		return list;
	}
}
