package com.jose;

public class Vendedor extends Funcionario{ 
    
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibir() {
        System.err.printf("Vendedor %s, salário: R$%.2f\n", nome, salario);
    } 
}
