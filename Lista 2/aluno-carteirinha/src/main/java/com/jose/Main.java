package com.jose;

public class Main {
    public static void main(String[] args) {
        Carteirinha cart_jose = new Carteirinha(12345, "12/03/2025");
        Aluno jose = new Aluno("José", "Ciência da Computação", cart_jose);

        jose.exibirDados();
    }
}