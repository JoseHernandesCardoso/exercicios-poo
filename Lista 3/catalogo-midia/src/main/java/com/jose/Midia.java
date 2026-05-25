package com.jose;

public class Midia {
    String nome;
    int ano;

    public Midia(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAno() {
        return this.ano;
    }

    public void exibir() {
        System.err.printf("[%s] %s (%d)\n", getClass().getSimpleName(), getNome(), getAno());
    }
}
