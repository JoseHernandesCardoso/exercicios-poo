package com.jose;

public class Main {
    public static void main(String[] args) {
        Aluno maria = new Aluno();
        maria.setNome("Maria");
        maria.setNota1(9.5);
        maria.setNota2(9.0);

        Aluno joao = new Aluno();
        joao.setNome("João");
        joao.setNota1(4.3);
        joao.setNota2(6.5);

        maria.mostraResumo();
        System.err.println("-=-=-=-=-=-=-=-=-=-=-=-");
        joao.mostraResumo();
    }
}