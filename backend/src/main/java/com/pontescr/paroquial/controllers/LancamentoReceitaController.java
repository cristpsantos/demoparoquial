package com.pontescr.paroquial.controllers;

import com.pontescr.paroquial.dto.LancamentoReceitaBasicoDTO;
import com.pontescr.paroquial.dto.UsuarioInsereDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pontescr.paroquial.dto.LancamentoReceitaFullDTO;
import com.pontescr.paroquial.service.LancamentoReceitaService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/lancamentos")
public class LancamentoReceitaController {

	@Autowired
	private LancamentoReceitaService service;

	@GetMapping
	public ResponseEntity<Page<LancamentoReceitaFullDTO>> findAll(Pageable pageable) {
		Page<LancamentoReceitaFullDTO> list = service.findAll(pageable);
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/dizimistas")
	public ResponseEntity<List<LancamentoReceitaFullDTO>> findAllLancamentosDizimistas() {
		List<LancamentoReceitaFullDTO> list = service.findAllLancamentosDizimistas();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/outrasreceitas")
	public ResponseEntity<List<LancamentoReceitaBasicoDTO>> findAllLancamentosOutrasReceitas() {
		List<LancamentoReceitaBasicoDTO> list = service.findAllfindAllLancamentosOutrasReceitas();
		return ResponseEntity.ok().body(list);
	}


	@PostMapping
	public ResponseEntity<LancamentoReceitaFullDTO> insert(@RequestBody LancamentoReceitaFullDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
}
