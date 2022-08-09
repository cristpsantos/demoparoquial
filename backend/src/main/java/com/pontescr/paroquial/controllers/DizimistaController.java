package com.pontescr.paroquial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pontescr.paroquial.dto.DizimistaDTO;
import com.pontescr.paroquial.service.DizimistaService;

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
}
