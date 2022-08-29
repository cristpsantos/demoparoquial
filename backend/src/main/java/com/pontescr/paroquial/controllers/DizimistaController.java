package com.pontescr.paroquial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pontescr.paroquial.dto.DizimistaDTO;
import com.pontescr.paroquial.service.DizimistaService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/dizimistas")
public class DizimistaController {

	@Autowired
	private DizimistaService service;
	
	@GetMapping
	public ResponseEntity<Page<DizimistaDTO>> findAll(Pageable pageable) {
		Page<DizimistaDTO> list = service.findAll(pageable);
		return ResponseEntity.ok().body(list);
	}

	@PostMapping
	public ResponseEntity<DizimistaDTO> insert(@RequestBody DizimistaDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
}
