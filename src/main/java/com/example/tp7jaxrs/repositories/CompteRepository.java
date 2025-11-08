package com.example.tp7jaxrs.repositories;

import com.example.tp7jaxrs.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}