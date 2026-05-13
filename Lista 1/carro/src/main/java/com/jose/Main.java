package com.jose;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Volkswagen");
        carro.setModelo("Fusca");
        carro.setVelocidade(0);

        carro.acelerar(200);
        carro.exibirVelocidade();
        carro.frear(50);
        carro.exibirVelocidade();
        carro.acelerar(10);
        carro.exibirVelocidade();
        carro.frear(180);
        carro.exibirVelocidade();
    }
}