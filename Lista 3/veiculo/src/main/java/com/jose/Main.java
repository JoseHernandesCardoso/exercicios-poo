package com.jose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro[] carros = new Carro[4];
        String marca, modelo;
        int qntPortas, i;
        Scanner scan = new Scanner(System.in);

        for (i=0; i < 4; i++) {
            System.out.printf("Digite a marca do %d carro: ", i+1);
            marca = scan.next();
            
            System.out.printf("Digite o modelo do %d carro: ", i+1);
            modelo = scan.next();

            System.out.printf("Digite a quantidade de portas do %d carro: ", i+1);
            qntPortas = scan.nextInt();
            scan.nextLine();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            carros[i] = new Carro(marca, modelo, qntPortas);
        }

        System.out.println("Carros cadastrados: ");
        for (Carro c : carros) {
            c.exibir();
        }

        scan.close();
    }
}