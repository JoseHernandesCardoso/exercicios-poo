package com.microplasticos.model;

public class Jogador {
    String nome;
    Simbolo simbolo;

    public Jogador(String nome, Simbolo simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
    }

    public String getNome() {
        return this.nome;
    }

    public Simbolo getSimbolo() {
        return this.simbolo;
    }

}
