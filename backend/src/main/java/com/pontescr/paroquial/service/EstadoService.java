package com.pontescr.paroquial.service;

import com.pontescr.paroquial.dto.DizimistaDTO;
import com.pontescr.paroquial.dto.EstadoDTO;
import com.pontescr.paroquial.dto.MissaDTO;
import com.pontescr.paroquial.entities.Dizimista;
import com.pontescr.paroquial.entities.Estado;
import com.pontescr.paroquial.entities.Missa;
import com.pontescr.paroquial.repositories.EstadoRepository;
import com.pontescr.paroquial.repositories.MissaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repository;
	
	@Transactional(readOnly = true)
	public List<EstadoDTO> findAll() {
		List<Estado> list = repository.findAll();
		return list.stream().map(x -> new EstadoDTO(x)).collect(Collectors.toList());
	}

	@Transactional
	public EstadoDTO insert(EstadoDTO dto) {
		Estado entidade = new Estado();
		entidade.setNome(dto.getNome());
		repository.insereEstado(entidade.getNome());
		return new EstadoDTO(entidade);
	}
}
