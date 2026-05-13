package com.jose;

public class Aluno {
    private String nome;
    private String curso;
    private Carteirinha carteirinha;
    
    public Aluno(String nome, String curso, Carteirinha carteirinha) {
        this.nome = nome;
        this.curso = curso;
        this.carteirinha = carteirinha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Carteirinha getCarteirinha() {
        return carteirinha;
    }

    public void setCarteirinha(Carteirinha carteirinha) {
        this.carteirinha = carteirinha;
    }

    public void exibirDados() {
        System.out.printf("Aluno %s do curso %s (%d | %s)\n", getNome(), getCurso(), getCarteirinha().getNumero(), getCarteirinha().getDataEmissao());
    }
}
