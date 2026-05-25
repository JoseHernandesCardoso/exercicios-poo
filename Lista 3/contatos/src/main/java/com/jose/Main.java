package com.jose;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new ContatoPessoal("Mamãe", "(44) 9999-9999"));
        contatos.add(new ContatoProfissional("Chefe", "(33) 1111-1111"));
        contatos.add(new ContatoPessoal("Juninho", "(44) 8888-8888"));
        contatos.add(new ContatoProfissional("Andreia Secretaria", "(44) 4444-4444"));

        for (Contato ctt : contatos) {
            ctt.exibir();
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for (Contato ctt : contatos) {
            if (ctt instanceof ContatoProfissional) {
                ctt.exibir();
            }
        }
    }
}