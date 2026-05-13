package com.jose;

public class Main {
    public static void main(String[] args) {
        Cracha cracha = new Cracha(1234567, "06/07/2067");
        Funcionario marcos = new Funcionario("Marcos Roberto Barbosa", "Cara do TI", cracha);
        
        marcos.exibirFuncionario();
    }
}