package com.jose;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LivroDidatico[] livros_arr = new LivroDidatico[3];
        ArrayList<LivroDidatico> livros_lst = new ArrayList<>();
        String titulo, autor, disciplina, continua;
        Scanner scan = new Scanner(System.in);

        livros_arr[0] = new LivroDidatico("Os Elementos", "Euclides", "Matemática");
        livros_arr[1] = new LivroDidatico("O Principe", "Maquiavel", "Filosofia");
        livros_arr[2] = new LivroDidatico("Arquitetura e Organização de Computadores", "Tanembaum", "Arquitetura de Computadores");

        do {
            System.out.printf("Digite o título do livro: ");
            titulo = scan.nextLine();
            
            System.out.printf("Digite o autor do livro: ");
            autor = scan.nextLine();

            System.out.printf("Digite a disciplina do livro: ");
            disciplina = scan.nextLine();

            livros_lst.add(new LivroDidatico(titulo, autor, disciplina));

            System.out.printf("Gostaria de continuar? (ENTER para sair): ");
            continua = scan.nextLine();
        } while (continua != "");

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Livros cadastrados: ");
        for (Livro l : livros_arr) {
            l.exibir();
        }
        for (LivroDidatico l: livros_lst) {
            l.exibir();
        }
    }
}