package com.jose;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto maisCaro;

        produtos.add(new Produto("Martelo", 87.99));
        produtos.add(new Produto("Pamonha", 4.00));
        produtos.add(new Produto("Placa-mãe", 329.99));
        produtos.add(new Produto("Cadeira", 200.00));
        produtos.add(new Produto("Fone de Ouvido Motorola Air Buds", 299.90));

        maisCaro = produtos.getFirst();
        System.out.println("Produtos cadastrados: ");
        for (Produto p : produtos) {
            System.out.printf("%s: R$%.2f\n", p.getNome(), p.getPreco());
            if (p.getPreco() > maisCaro.getPreco()) {
                maisCaro = p;
            }
        }
        System.out.printf("O produto mais caro é %s\n", maisCaro.getNome());

    }
}