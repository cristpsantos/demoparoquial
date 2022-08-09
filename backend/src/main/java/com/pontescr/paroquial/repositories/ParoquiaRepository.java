package com.pontescr.paroquial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pontescr.paroquial.entities.Paroquia;

@Repository
public interface ParoquiaRepository extends JpaRepository<Paroquia, Long> {
}
