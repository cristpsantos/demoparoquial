package com.pontescr.paroquial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pontescr.paroquial.entities.LancamentoReceita;

@Repository
public interface LancamentoReceitaRepository extends JpaRepository<LancamentoReceita, Long> {
}
