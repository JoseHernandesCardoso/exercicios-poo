package com.jose;

public class Celular {
    private String marca;
    private String modelo;
    private int nivelBateria;

    public Celular(String marca, String modelo, int nivelBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.nivelBateria = nivelBateria;
    }

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

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public void carregarBateria(int valor) {
        nivelBateria += valor;
        if (nivelBateria > 100) {
            nivelBateria = 100;
        }
    }

    public void usarBateria(int valor) {
        nivelBateria -= valor;
        if (nivelBateria < 0) {
            nivelBateria = 0;
        }
    }
}

