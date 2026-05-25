package com.jose;

public class ContatoPessoal extends Contato {
    
    public ContatoPessoal(String nome, String numero) {
        super(nome, numero);
    }

    @Override
    public void exibir() {
        System.out.printf("[PESSOAL] %s: %s\n", nome, numero);
    }
}
