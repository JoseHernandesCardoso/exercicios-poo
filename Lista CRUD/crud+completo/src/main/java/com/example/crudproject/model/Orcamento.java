package com.example.crudproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String descricao;
    private double valor;
    private StatusOrcamento status = StatusOrcamento.PENDENTE;

    @ManyToOne
    private Cliente cliente;

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusOrcamento getStatus() {
        return status;
    }

    public void setStatus(StatusOrcamento status) {
        this.status = status;
    }

    public void aprovar(){
        status = StatusOrcamento.APROVADO;
    }

    public void rejeitar(){
        status = StatusOrcamento.REJEITADO;
    }
}
