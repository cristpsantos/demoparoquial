package com.pontescr.paroquial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pontescr.paroquial.dto.MissaDTO;
import com.pontescr.paroquial.service.MissaService;

@RestController
@RequestMapping(value = "/missas")
public class MissaController {

	@Autowired
	private MissaService service;
	
	@GetMapping
	public ResponseEntity<Page<MissaDTO>> findAll(Pageable pageable) {
		Page<MissaDTO> list = service.findAll(pageable);
		return ResponseEntity.ok().body(list);
	}
}
