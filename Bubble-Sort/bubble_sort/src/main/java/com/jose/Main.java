package com.jose;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 10, 6, 3, 5, 1};
        ArranjoInteiro arranjo = new ArranjoInteiro(arr);
        int i;

        System.out.println("Desordenado: ");
        i = 0;
        System.out.printf("[");
        do {
            System.out.printf("%d, ", arranjo.getArranjo()[i]);
            i++;
        } while (i < arranjo.getTam() - 1);
        System.out.printf("%d]\n", arranjo.getArranjo()[i]);

        arranjo.ordena();
        System.out.println("Ordenado: ");
        i = 0;
        System.out.printf("[");
        do {
            System.out.printf("%d, ", arranjo.getArranjo()[i]);
            i++;
        } while (i < arranjo.getTam() - 1);
        System.out.printf("%d]\n", arranjo.getArranjo()[i]);
    }
}