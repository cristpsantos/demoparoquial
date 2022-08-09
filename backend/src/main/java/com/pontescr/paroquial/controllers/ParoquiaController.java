package com.pontescr.paroquial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pontescr.paroquial.dto.ParoquiaDTO;
import com.pontescr.paroquial.service.ParoquiaService;

@RestController
@RequestMapping(value = "/paroquias")
public class ParoquiaController {

	@Autowired
	private ParoquiaService service;
	
	@GetMapping
	public ResponseEntity<Page<ParoquiaDTO>> findAll(Pageable pageable) {
		Page<ParoquiaDTO> list = service.findAll(pageable);
		return ResponseEntity.ok().body(list);
	}
}
