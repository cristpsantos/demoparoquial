package com.pontescr.paroquial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pontescr.paroquial.entities.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
