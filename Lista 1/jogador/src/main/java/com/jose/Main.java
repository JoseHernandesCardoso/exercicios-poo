package com.jose;

public class Main {
    public static void main(String[] args) {
        Jogador p1 = new Jogador("José", 204);

        System.out.printf("Nivel %d (pontos = %d)\n", p1.getNivel(), p1.getPontuacao());
        p1.subirNivel();
        p1.adicionarPontos(312);
        System.out.printf("Nivel %d (pontos = %d)\n", p1.getNivel(), p1.getPontuacao());
    }
}