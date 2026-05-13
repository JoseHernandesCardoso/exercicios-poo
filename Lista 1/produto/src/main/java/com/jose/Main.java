package com.jose;

public class Main {
    public static void main(String[] args) {
        Produto nescau = new Produto();
        nescau.setNome("Nescau lata 500g");
        nescau.setPreco(16.90);

        Produto toddy = new Produto();
        toddy.setNome("Toddy pacote 1Kg");
        toddy.setPreco(31.99);

        toddy.mostrarProduto();
        nescau.mostrarProduto();
    }
}