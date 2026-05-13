package com.jose;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        int i;
        Scanner scan = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.printf("Digite o %d nome: ", i+1);
            nomes.add(scan.nextLine());
        }

        System.out.println("Nomes digitados:");
        for (String nome: nomes) {
            System.out.println(nome);
        }
        
        scan.close();
    }
}