package com.jose;

public class Retangulo {
    private double largura;
    private double altura;

    public double getLargura() {
        return this.largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double calculaArea() {
        return this.altura * this.largura;
    }

    public double calculaPerimetro() {
        return (this.altura * 2) + (this.largura * 2);
    }
}
