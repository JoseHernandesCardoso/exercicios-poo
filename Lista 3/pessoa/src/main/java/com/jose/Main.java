package com.jose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[3];
        String nome, matricula, curso;
        int idade;
        int i;
        Scanner scan = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            System.out.printf("Digite o nome do %dº aluno: ", i+1);
            nome = scan.nextLine();
            
            System.out.printf("Digite a idade do %dº aluno: ", i+1);
            idade = scan.nextInt();
            scan.nextLine();

            System.out.printf("Digite a matricula do %dº aluno: ", i+1);
            matricula = scan.nextLine();

            System.out.printf("Digite o curso do %dº aluno: ", i+1);
            curso = scan.nextLine();

            alunos[i] = new Aluno(nome, idade, matricula, curso);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

        System.out.println("Alunos cadastrados:");
        for (Aluno aluno: alunos) {
            aluno.exibir();
        }

        scan.close();
    }
}