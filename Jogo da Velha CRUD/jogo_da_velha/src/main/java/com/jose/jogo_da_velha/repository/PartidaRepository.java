package com.jose.jogo_da_velha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jose.jogo_da_velha.model.Partida;

public interface PartidaRepository extends JpaRepository<Partida, Long>{
    
}
