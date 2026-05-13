package com.jose;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Bertoni");
        funcionario.setCargo("Filho do dono");
        funcionario.setSalario(320000.00);

        funcionario.exibirFuncionario();
        funcionario.aumentarSalario(0.2);
        funcionario.exibirFuncionario();
    }
}