package com.jose;

public class Funcionario {
    private String nome;
    private String cargo;
    private Cracha cracha;
    
    public Funcionario(String nome, String cargo, Cracha cracha) {
        this.nome = nome;
        this.cargo = cargo;
        this.cracha = cracha;
    }

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

    public Cracha getCracha() {
        return cracha;
    }

    public void setCracha(Cracha cracha) {
        this.cracha = cracha;
    }

    public void exibirFuncionario() {
        System.out.printf("%s, %s. Crachá: %d (%s)\n", getNome(), getCargo(), getCracha().getCodigo(), getCracha().getDataValidade());
    }
}
