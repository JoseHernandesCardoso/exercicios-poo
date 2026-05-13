package com.jose;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Professor> professores = new ArrayList<>();
        String nome;
        Scanner scan = new Scanner(System.in);

        professores.add(new Professor("Choma", 36, "POO", 10));
        professores.add(new Professor("Malbarbo", 48, "Fundamentos de Algoritmo", 4000.00));
        professores.add(new Professor("Anderson", 65, "Compiladores", 5000.20));
        
        System.out.println("Professores cadastrados:");
        for (Professor p : professores) {
            System.out.println(p.getNome());
        }

        do {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.printf("Digite o nome de um professor para obter mais informações (ENTER para sair): ");
            nome = scan.nextLine();
            for (Professor p : professores) {
                if (nome.equals(p.getNome())) {
                    p.exibir();
                }
            }
        } while (nome != "");
        scan.close();
    }
}