package com.pontescr.paroquial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pontescr.paroquial.entities.Missa;

@Repository
public interface MissaRepository extends JpaRepository<Missa, Long> {
}
