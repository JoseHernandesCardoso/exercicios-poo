package com.jose;

public class Casa {
    private String cor;
    private int quantidadeQuartos;
    private Endereco endereco;
    
    public Casa(String cor, int quantidadeQuartos, Endereco endereco) {
        this.cor = cor;
        this.quantidadeQuartos = quantidadeQuartos;
        this.endereco = endereco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidadeQuartos() {
        return quantidadeQuartos;
    }

    public void setQuantidadeQuartos(int quantidadeQuartos) {
        this.quantidadeQuartos = quantidadeQuartos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void exibirCasa() {
        Endereco e = getEndereco();
        System.out.printf("Casa cor %s de %d quartos\n", getCor(), getQuantidadeQuartos());
        System.out.printf("Endereço: %s, %d, %s, %s\n", e.getRua(), e.getNumero(), e.getBairro(), e.getCidade());
    }
}
