package com.jose;

public class Livro {
    private String titulo;
    private String autor;
    private ISBN isbn;
    
    public Livro(String titulo, String autor, ISBN isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public ISBN getIsbn() {
        return isbn;
    }

    public void setIsbn(ISBN isbn) {
        this.isbn = isbn;
    }
    
    public void exibirLivro() {
        System.out.printf("%s, %s [ISBN: %s - %s]\n", getTitulo(), getAutor(), getIsbn().getCodigo(), getIsbn().getEditora());
    }
}
