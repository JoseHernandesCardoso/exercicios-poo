package com.jose;

public class Gerente extends Funcionario{
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void exibir() {
        System.out.printf("Gerente %s [setor %s], salário: R$%.2f\n", nome, setor, salario);
    }
}
