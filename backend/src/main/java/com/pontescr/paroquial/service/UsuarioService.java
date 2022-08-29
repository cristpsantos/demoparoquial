package com.pontescr.paroquial.service;

import com.pontescr.paroquial.dto.DizimistaDTO;
import com.pontescr.paroquial.dto.UsuarioInsereDTO;
import com.pontescr.paroquial.entities.Cidade;
import com.pontescr.paroquial.entities.Dizimista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pontescr.paroquial.dto.UsuarioDTO;
import com.pontescr.paroquial.entities.Usuario;
import com.pontescr.paroquial.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Transactional(readOnly = true)
	public Page<UsuarioDTO> findAll(Pageable pageable) {
		Page<Usuario> list = repository.findAll(pageable);
		return list.map(x -> new UsuarioDTO(x));
	}

	@Transactional
	public UsuarioInsereDTO insert(UsuarioInsereDTO dto) {
		Usuario entidade = new Usuario();
		copiaDtoParaEntidade(dto, entidade);
		entidade = repository.save(entidade);
		return new UsuarioInsereDTO(entidade);
	}

	public void copiaDtoParaEntidade(UsuarioInsereDTO dto, Usuario entidade) {

		entidade.setNome(dto.getNome());
		entidade.setLogin(dto.getLogin());
		entidade.setSenha(dto.getSenha());
	}
}
