package com.jose;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarProduto() {
        System.out.printf("%s R$%.2f\n", nome, preco);
    }
}