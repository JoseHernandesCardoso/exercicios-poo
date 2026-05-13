package com.jose;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidade;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
    }

    public void frear(int velocidade) {
        this.velocidade -= velocidade;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
    }

    public void exibirVelocidade() {
        System.out.printf("Velocidade atual: %dKm/h\n", this.velocidade);
    }
}
