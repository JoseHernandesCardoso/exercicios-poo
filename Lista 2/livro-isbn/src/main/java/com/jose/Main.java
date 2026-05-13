package com.jose;

public class Main {
    public static void main(String[] args) {
        ISBN isbn = new ISBN("1393521B3", "Editora Machadadas");
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", isbn);

        livro.exibirLivro();
    }
}