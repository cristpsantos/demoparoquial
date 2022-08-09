package com.pontescr.paroquial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pontescr.paroquial.dto.ComunidadeDTO;
import com.pontescr.paroquial.service.ComunidadeService;

@RestController
@RequestMapping(value = "/comunidades")
public class ComunidadeController {

	@Autowired
	private ComunidadeService service;
	
	@GetMapping
	public ResponseEntity<Page<ComunidadeDTO>> findAll(Pageable pageable) {
		Page<ComunidadeDTO> list = service.findAll(pageable);
		return ResponseEntity.ok().body(list);
	}
}
