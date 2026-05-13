package com.jose;

public class Main {
    public static void main(String[] args) {
        Celular cel = new Celular("Samsung", "J4", 80);

        cel.carregarBateria(1000000);
        System.out.println(cel.getNivelBateria());
        cel.usarBateria(100000);
        System.out.println(cel.getNivelBateria());
        cel.carregarBateria(50);
        System.out.println(cel.getNivelBateria());
    }
}