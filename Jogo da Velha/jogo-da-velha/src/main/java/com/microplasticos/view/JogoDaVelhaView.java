package com.microplasticos.view;

import java.util.Scanner;

import com.microplasticos.controller.JogoDaVelhaController;
import com.microplasticos.exception.JogadaInvalidaException;
import com.microplasticos.model.StatusPartida;

public class JogoDaVelhaView {
    private JogoDaVelhaController controller;
    private Scanner scan;

    public JogoDaVelhaView() {
        scan = new Scanner(System.in);
    }

    public void iniciaPartida() {
        String nome1, nome2;
        StatusPartida status;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("                JOGO DA VELHA");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.printf("Nome do jogador 1: ");
        nome1 = scan.nextLine();
        System.out.printf("Nome do jogador 2: ");
        nome2 = scan.nextLine();

        controller = new JogoDaVelhaController(nome1, nome2);

        do {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            jogada();
            status = controller.getStatus();
        } while (status.equals(StatusPartida.EM_ANDAMENTO));

        if (status.equals(StatusPartida.VITORIA)) {
            System.out.printf("VITÓRIA DO JOGADOR %s!\n", controller.getJogadorAtual().getNome());
        } else {
            System.out.println("EMPATE! DEU VELHA!");
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(controller.gridTabuleiro());
        System.out.println("FIM DE JOGO!");
    }

    public void jogada() {
        String nome_atual = controller.getJogadorAtual().getNome();
        String simbolo = controller.getJogadorAtual().getSimbolo().name();
        int lin, col;

        System.out.printf("Vez do jogador %s (%s)\n", nome_atual, simbolo);
        System.out.println(controller.gridTabuleiro());

        System.out.printf("Linha (0, 1 ou 2): ");
        lin = Integer.parseInt(scan.nextLine());
        System.out.printf("Coluna (0, 1 ou 2): ");
        col = Integer.parseInt(scan.nextLine());

        try {
            controller.fazerJogada(lin, col);
        } catch (JogadaInvalidaException e) {
            System.out.printf("JOGADA INVÁLIDA: %s\n", e.getMessage());
        }
    }
}
