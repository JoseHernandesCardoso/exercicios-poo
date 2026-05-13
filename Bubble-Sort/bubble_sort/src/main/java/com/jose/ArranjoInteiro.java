package com.jose;

public class ArranjoInteiro implements Ordenador {
    private int[] arranjo;
    private int tam;

    public ArranjoInteiro(int[] arranjo) {
        this.arranjo = arranjo;
        this.tam = arranjo.length;
    }

    public int[] getArranjo() {
        return arranjo;
    }

    public void setArranjo(int[] arranjo) {
        this.arranjo = arranjo;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    @Override
    public void ordena() {
        int aux, i, j;

        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam - i - 1; j++) {
                if (arranjo[j] > arranjo[j+1]) {
                    aux = arranjo[j+1];
                    arranjo[j+1] = arranjo[j];
                    arranjo[j] = aux;
                }
            }
        }
    }
}
