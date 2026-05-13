package com.jose;

public class Computador {
    private String marca;
    private String processador;
    private PlacaMae placaMae;

    public Computador(String marca, String processador, PlacaMae placaMae) {
        this.marca = marca;
        this.processador = processador;
        this.placaMae = placaMae;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    public void exibirConfiguracao() {
        System.out.printf("Marca: %s\nProcessador: %s\nPlaca Mãe: %s chipset %s\n", getMarca(), getProcessador(), getPlacaMae().getModelo(), getPlacaMae().getChipset());
    }
}
