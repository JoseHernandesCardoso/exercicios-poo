package com.jose;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public int gerNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numero) {
        this.numeroConta = numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.printf("Saldo insuficiente para sacar R$%.2f\n", valor);
        } else {
            this.saldo -= valor;
        }
    }

    public void consularSaldo() {
        System.out.printf("Seu saldo atual é R$%.2f\n", this.saldo);
    }
}
