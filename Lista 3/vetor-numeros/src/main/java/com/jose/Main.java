package com.jose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int soma = 0;
        int i;
        Scanner scan = new Scanner(System.in);

        for (i=0; i < 5; i++) {
            System.out.printf("Digite o %d número: ", i+1);
            numeros[i] = scan.nextInt();
        }

        System.out.printf("Números digitados: ");
        for (i=0; i < 5; i++) {
            System.out.printf("%d ", numeros[i]);
            soma += numeros[i];
        }
        System.out.append('\n');
        
        System.out.printf("A soma dos números digitados é %d\n", soma);

        scan.close();
    }
}   