package com.example.crudproject.repository;

import com.example.crudproject.model.Orcamento;
import com.example.crudproject.model.StatusOrcamento;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcamentoRepository extends JpaRepository<Orcamento, Integer> {
    List<Orcamento> findByStatus(StatusOrcamento status);
}
