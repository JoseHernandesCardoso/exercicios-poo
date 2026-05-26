package com.microplasticos.controller;

import com.microplasticos.model.*;
import com.microplasticos.exception.JogadaInvalidaException;

public class JogoDaVelhaController {
    private Tabuleiro tabuleiro;
    private Jogador jogador1, jogador2, jogadorAtual;
    private StatusPartida status;

    public JogoDaVelhaController(String nome1, String nome2) {
        tabuleiro = new Tabuleiro();
        jogador1 = new Jogador(nome1, Simbolo.X);
        jogador2 = new Jogador(nome2, Simbolo.O);
        jogadorAtual = jogador1;
        status = StatusPartida.EM_ANDAMENTO;
    }

    public Jogador getJogadorAtual() {
        return jogadorAtual;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public StatusPartida getStatus() {
        return status;
    }

    public String gridTabuleiro() {
        int i, j;
        String grid = "";
        Simbolo simb;

        for (i=0; i < 3; i++) {
            for (j=0; j < 3; j++) {
                simb = tabuleiro.getTabuleiro()[i][j];
                if (simb == null) {
                    grid += "   ";
                } else {
                    grid += " " + simb.name() + " ";
                }

                if (j < 2) {
                    grid += "|";
                } else {
                    grid += "\n";
                }
            }

            if (i < 2) {
                grid += "-----------\n";
            }
        }

        return grid;
    }

    public void fazerJogada(int lin, int col) throws JogadaInvalidaException{
        tabuleiro.registraJogada(jogadorAtual.getSimbolo(), lin, col);
        
        if (tabuleiro.verificaVitoria()) {
            status = StatusPartida.VITORIA;
        } else if (tabuleiro.verificaEmpate()) {
            status = StatusPartida.EMPATE;
        } else {
            // Jogo não acabou -> alterna jogador
            if (jogadorAtual.equals(jogador1)) {
                jogadorAtual = jogador2;
            } else {
                jogadorAtual = jogador1;
            }
        }
    }
}
