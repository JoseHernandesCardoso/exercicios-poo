package com.jose;

public class Filme {
    private String titulo;
    private String genero;
    private String duracao;
    private double avaliacao; // 0 < avaliacao < 10

    public Filme(String titulo, String genero, String duracao, double avaliacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        alterarAvaliacao(avaliacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void exibirFichaTecnica() {
        System.out.printf("%s [%s] | %s | Nota: %.1f\n", getTitulo(), getDuracao(), getGenero(), getAvaliacao());
    }
    
    public void alterarAvaliacao(double avaliacao) {
        if (avaliacao > 10) {
            avaliacao = 10.0;
        } else if (avaliacao < 0) {
            avaliacao = 0;
        }
        this.avaliacao = avaliacao;
    }
}