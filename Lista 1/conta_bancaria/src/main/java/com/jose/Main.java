package com.jose;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(12345678);
        conta.setTitular("Heitor");
        conta.setSaldo(0);

        conta.depositar(100);
        conta.consularSaldo();
        conta.sacar(200);
        conta.sacar(20);
        conta.consularSaldo();
    }
}