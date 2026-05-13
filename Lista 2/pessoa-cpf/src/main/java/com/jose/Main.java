package com.jose;

public class Main {
    public static void main(String[] args) {
        Cpf cpf_jose = new Cpf("123.456.789-00", "Devendo o Serasa");
        Pessoa jose = new Pessoa("Jose", 19, cpf_jose);

        cpf_jose.exibirDados();
        jose.exibirDados();
    }
}