package com.jose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[4];
        String nome, matricula, curso, disciplina;
        int idade, i;
        double salario;
        Scanner scan = new Scanner(System.in);

        for (i = 0; i < 2; i++) {
            System.out.printf("Digite o nome do %dº aluno: ", i+1);
            nome = scan.nextLine();
            
            System.out.printf("Digite a idade do %dº aluno: ", i+1);
            idade = scan.nextInt();
            scan.nextLine();

            System.out.printf("Digite a matricula do %dº aluno: ", i+1);
            matricula = scan.nextLine();

            System.out.printf("Digite o curso do %dº aluno: ", i+1);
            curso = scan.nextLine();

            pessoas[i] = new Aluno(nome, idade, matricula, curso);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

        for (i = 0; i < 2; i++) {
            System.out.printf("Digite o nome do %dº professor: ", i+1);
            nome = scan.nextLine();
            
            System.out.printf("Digite a idade do %dº professor: ", i+1);
            idade = scan.nextInt();
            scan.nextLine();

            System.out.printf("Digite a disciplina do %dº professor: ", i+1);
            disciplina = scan.nextLine();

            System.out.printf("Digite o salario do %dº professor: ", i+1);
            salario = scan.nextFloat();
            scan.nextLine();

            pessoas[i+2] = new Professor(nome, idade, disciplina, salario);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        
        System.out.println("pessoas cadastrados:");
        for (Pessoa p: pessoas) {
            p.exibir();
        }

        scan.close();
    }
}