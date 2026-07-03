package com.jose.jogo_da_velha.model;

import com.jose.jogo_da_velha.exception.NomeInvalidoException;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private Simbolo simbolo;

    public Jogador(String nome, Simbolo simbolo) {
        if (nome == null || nome.isBlank()) throw new NomeInvalidoException();

        this.nome = nome;
        this.simbolo = simbolo;
    }

    protected Jogador() {

    }

    public long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public Simbolo getSimbolo() {
        return this.simbolo;
    }

}
