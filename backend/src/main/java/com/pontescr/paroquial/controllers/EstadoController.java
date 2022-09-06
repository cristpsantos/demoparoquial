package com.pontescr.paroquial.controllers;

import com.pontescr.paroquial.dto.DizimistaDTO;
import com.pontescr.paroquial.dto.EstadoDTO;
import com.pontescr.paroquial.dto.MissaDTO;
import com.pontescr.paroquial.entities.Estado;
import com.pontescr.paroquial.service.EstadoService;
import com.pontescr.paroquial.service.MissaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/estados")
public class EstadoController {

	@Autowired
	private EstadoService service;
	
	@GetMapping
	public ResponseEntity<List<EstadoDTO>> findAll() {
		List<EstadoDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@PostMapping
	public ResponseEntity<EstadoDTO> insert(@RequestBody EstadoDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
}
