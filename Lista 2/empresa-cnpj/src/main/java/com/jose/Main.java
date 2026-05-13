package com.jose;

public class Main {
    public static void main(String[] args) {
        CNPJ cnpj = new CNPJ(1234566789, "Tudo certo");
        Empressa empresa = new Empressa("Jose Soluçẽs em TI", "Zé do TI", cnpj);

        empresa.exibirEmpresa();
    }
}