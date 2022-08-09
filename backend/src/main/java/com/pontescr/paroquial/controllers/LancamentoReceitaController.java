package com.pontescr.paroquial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pontescr.paroquial.dto.LancamentoReceitaDTO;
import com.pontescr.paroquial.service.LancamentoReceitaService;

@RestController
@RequestMapping(value = "/lancamentos")
public class LancamentoReceitaController {

	@Autowired
	private LancamentoReceitaService service;
	
	@GetMapping
	public ResponseEntity<Page<LancamentoReceitaDTO>> findAll(Pageable pageable) {
		Page<LancamentoReceitaDTO> list = service.findAll(pageable);
		return ResponseEntity.ok().body(list);
	}
}
