package com.jose;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno;
        String nome;
        int i;
        Scanner scan = new Scanner(System.in);

        alunos.add(new Aluno("José", 19, "RA11111", "CC"));
        alunos.add(new Aluno("Gabriel", 18, "RA22222", "Engenharia de Software"));
        alunos.add(new Aluno("Marcos", 22, "RA33333", "Letras"));

        
        do {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Alunos cadastrados:");
            for (Aluno a : alunos) {
                System.out.println(a.getNome());
            }

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.printf("Digite o nome de um aluno para remover (ENTER para sair): ");
            nome = scan.nextLine();

            for (i = 0; i < alunos.size(); i++) {
                aluno = alunos.get(i);
                if (nome.equals(aluno.getNome())) {
                    alunos.remove(i);
                }
            }

        } while (nome != "");
        scan.close();
    }
}