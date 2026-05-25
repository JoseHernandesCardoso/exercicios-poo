package com.jose;

public class ContatoProfissional extends Contato {
    
    public ContatoProfissional(String nome, String numero) {
        super(nome, numero);
    }

    @Override
    public void exibir() {
        System.out.printf("[PROFISSIONAL] %s: %s\n", nome, numero);
    }
}
