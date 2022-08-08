package com.pontescr.paroquial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pontescr.paroquial.dto.CidadeDTO;
import com.pontescr.paroquial.service.CidadeService;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeController {

	@Autowired
	private CidadeService service;
	
	@GetMapping
	public ResponseEntity<Page<CidadeDTO>> findAll(Pageable pageable) {
		Page<CidadeDTO> list = service.findAll(pageable);
		return ResponseEntity.ok().body(list);
	}
}
