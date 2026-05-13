package com.jose;

public class Funcionario {
    private String nome;
    private String cargo;
    private Double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario += this.salario * porcentagem;
    }

    public void exibirFuncionario() {
        System.out.printf("%s [%s]: R$%.2f\n", this.nome, this.cargo, this.salario);
    }
}
