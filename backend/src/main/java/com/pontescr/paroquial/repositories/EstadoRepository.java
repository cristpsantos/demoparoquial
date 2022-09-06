package com.pontescr.paroquial.repositories;

import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pontescr.paroquial.entities.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

    @Modifying
    @Query(nativeQuery = true, value = "INSERT INTO tb_estados(nome) VALUES (:estado)")
    void insereEstado(@Param("estado") String estado);
}
