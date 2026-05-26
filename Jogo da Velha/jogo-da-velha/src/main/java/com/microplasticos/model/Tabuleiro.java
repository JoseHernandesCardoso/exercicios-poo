package com.microplasticos.model;

import com.microplasticos.exception.JogadaInvalidaException;

public class Tabuleiro {
    private Simbolo[][] tabuleiro;
    
    public Tabuleiro() {
        this.tabuleiro = new Simbolo[3][3];
    }

    public Simbolo[][] getTabuleiro() {
        return this.tabuleiro;
    }
    
    public boolean posicaoLivre(int lin, int col) {
        return tabuleiro[lin][col] == null;
    }

    public void registraJogada(Simbolo simbolo, int lin, int col) throws JogadaInvalidaException {
        if (lin < 0 || col < 0 || lin > 2 || col > 2) {
            throw new JogadaInvalidaException("Posição inválida para a jogada!");
        } else if (!posicaoLivre(lin, col)) {
            throw new JogadaInvalidaException("Já existe um símbolo nessa posição!");
        }

        tabuleiro[lin][col] = simbolo;
    }

    public boolean verificaVitoria() {
        int i;
        // Verifica linhas
        for (i=0; i < 3; i++) {
            if (tabuleiro[i][0] != null && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                return true;
            }
        }

        // Verifica colunas
        for (i=0; i < 3; i++) {
            if (tabuleiro[0][i] != null && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
                return true;
            }
        }

        // Verifica diagonais
        if (tabuleiro[0][0] != null && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            return true;
        } else if (tabuleiro[0][2] != null && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            return true;
        }

        return false;
    }

    public boolean verificaEmpate() {
        int i, j;
        boolean preenchido = true;
        for (i=0; i < 3; i++) {
            for (j=0; j < 3; j++) {
                if (posicaoLivre(i, j)) {
                    preenchido = false;
                }
            }
        }
        return preenchido && !verificaVitoria();
    }
}
