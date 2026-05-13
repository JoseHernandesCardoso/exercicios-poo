package com.jose;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao) {
        this.nome = nome;
        this.nivel = 0;
        this.pontuacao = 0;
        adicionarPontos(pontuacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public void adicionarPontos(int valor) {
        pontuacao += valor;
        if (pontuacao >= 100) {
            nivel += pontuacao / 100; // Divisão inteira
            pontuacao = pontuacao % 100;
        }
    }

    public void subirNivel() {
        nivel++;
    }
}
