package com.pontescr.paroquial.repositories;

import com.pontescr.paroquial.entities.Dizimista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pontescr.paroquial.entities.LancamentoReceita;

import java.util.List;

@Repository
public interface LancamentoReceitaRepository extends JpaRepository<LancamentoReceita, Long> {

    @Query("SELECT obj FROM LancamentoReceita obj WHERE obj.tipoReceita = 0")
    List<LancamentoReceita> findAllLancamentosDizimistas();

    @Query("SELECT obj FROM LancamentoReceita obj WHERE obj.tipoReceita != 0")
    List<LancamentoReceita> findAllLancamentosOutrasReceitas();

}
