package com.jose;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Batalha nas Galáxias", "Ação", "3:12", 8.4);

        filme.exibirFichaTecnica();
        filme.alterarAvaliacao(-12.4);
        filme.exibirFichaTecnica();
        filme.alterarAvaliacao(21.2);
        filme.exibirFichaTecnica();
        filme.alterarAvaliacao(9.3);
        filme.exibirFichaTecnica();
    }
}