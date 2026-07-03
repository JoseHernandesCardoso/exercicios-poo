package com.jose.jogo_da_velha.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jose.jogo_da_velha.exception.JogadaInvalidaException;
import com.jose.jogo_da_velha.exception.PartidaEncerradaException;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "jogadorX_id", nullable = false)
    private Jogador jogadorX;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "jogadorO_id", nullable = false)
    private Jogador jogadorO;

    private String tabuleiro;
    private Simbolo turnoAtual;
    private StatusPartida status;

    @OneToOne
    @JoinColumn(name = "vencedor_id")
    private Jogador vencedor;

    public Partida(String nomeJogadorX, String nomeJogadorO) {
        this.jogadorX = new Jogador(nomeJogadorX, Simbolo.X);
        this.jogadorO = new Jogador(nomeJogadorO, Simbolo.O);
        
        this.tabuleiro = "---------";
        this.turnoAtual = Simbolo.X;
        this.status = StatusPartida.EM_ANDAMENTO;
        this.vencedor = null;
    }

    protected Partida() {

    }


    public long getId() {
        return this.id;
    }

    public Jogador getJogadorX() {
        return this.jogadorX;
    }

    public Jogador getJogadorO() {
        return this.jogadorO;
    }

    @JsonIgnore
    public String getTabuleiroString() {
        return this.tabuleiro;
    }

    public Character[][] getTabuleiro() {
        Character[][] tabuleiroMatriz = new Character[3][3];

        for (int i=0; i < 9; i++) {
            if (tabuleiro.charAt(i) != '-') {
                tabuleiroMatriz[i/3][i%3] = tabuleiro.charAt(i);
            } else {
                tabuleiroMatriz[i/3][i%3] = null;
            }
        }

        return tabuleiroMatriz;
    }

    public Simbolo getTurnoAtual() {
        return this.turnoAtual;
    }

    public StatusPartida getStatus() {
        return this.status;
    }

    public Jogador getVencedor() {
        return this.vencedor;
    }

    private int posicaoAbsoluta(int linha, int coluna) {
        return (3*linha) + coluna;
    }

    public char verificarPos(int linha, int coluna) {
        return tabuleiro.charAt(posicaoAbsoluta(linha, coluna));
    }

    public boolean posicaoLivre(int linha, int coluna) {
        return verificarPos(linha, coluna) == '-';
    }

    public void alternarTurno() {
        if (turnoAtual == Simbolo.X) {
            turnoAtual = Simbolo.O;
        } else {
            turnoAtual = Simbolo.X;
        }
    }

    public boolean verificarEmpate() {
        if (!tabuleiro.contains("-") && status != StatusPartida.VITORIA) {
            status = StatusPartida.EMPATE;
            return true;
        }
        return false;
    }

    public boolean verificarVitoria() {
        boolean vitoria = false;
        int i;

        // Verifica linhas
        for (i=0; i < 3; i++) {
            if (verificarPos(i, 0) != '-' &&
            verificarPos(i, 0) == verificarPos(i, 1) &&
            verificarPos(i, 1) == verificarPos(i, 2)) vitoria = true;
        }

        // Verifica colunas
        for (i=0; i < 3; i++) {
            if (verificarPos(0, i) != '-' &&
            verificarPos(0, i) == verificarPos(1, i) &&
            verificarPos(1, i) == verificarPos(2, i)) vitoria = true;
        }

        // Verifica diagonais
        if (verificarPos(0, 0) != '-' &&
        verificarPos(0, 0) == verificarPos(1, 1) &&
        verificarPos(1, 1) == verificarPos(2, 2)) vitoria = true;

        else if (verificarPos(0, 2) != '-' &&
        verificarPos(0, 2) == verificarPos(1, 1) &&
        verificarPos(1, 1) == verificarPos(2, 0)) vitoria = true;

        // Atualiza status, vencedor e retorna resultado
        if (vitoria) {
            status = StatusPartida.VITORIA;
            if (turnoAtual == Simbolo.X) vencedor = jogadorX;
            else vencedor = jogadorO;
        }
        return vitoria;
    }

    public void marcarPosicao(String nomeJogador, int linha, int coluna) {
        if (status != StatusPartida.EM_ANDAMENTO) {
            throw new PartidaEncerradaException();
        }

        if (!nomeJogador.equals(jogadorO.getNome()) && !nomeJogador.equals(jogadorX.getNome())) {
            throw new JogadaInvalidaException("Jogador \"" + nomeJogador + "\" não está na partida!");
        }

        if ((nomeJogador.equals(jogadorO.getNome()) && turnoAtual != Simbolo.O) ||
            (nomeJogador.equals(jogadorX.getNome()) && turnoAtual != Simbolo.X)) {

                throw new JogadaInvalidaException("Não é a vez do jogador \"" + nomeJogador + "\"!");
            }

        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            throw new JogadaInvalidaException("Jogada fora dos limites do tabuleiro!");
        }

        if (!posicaoLivre(linha, coluna)) {
            throw new JogadaInvalidaException("Posição já está ocupada!");
        }


        StringBuilder novoTabuleiro = new StringBuilder(tabuleiro);
        char marca = turnoAtual.toString().charAt(0);
        novoTabuleiro.setCharAt(posicaoAbsoluta(linha, coluna), marca);
        tabuleiro = novoTabuleiro.toString();

        if (!verificarVitoria() && !verificarEmpate()) {
            alternarTurno();
        }
    }

}
