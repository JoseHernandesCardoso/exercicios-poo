package com.jose;

public class Main {
    public static void main(String[] args) {
        Endereco ender = new Endereco("XV de Novembro", 999, "Centro", "São Jorge do Ivaí");
        Casa casa = new Casa("Laranja", 4, ender);

        casa.exibirCasa();
    }
}