package com.jose;

public class Main {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        ret.setAltura(10);
        ret.setLargura(8.5);

        System.out.printf("A área do retângulo é: %.2f\nO perímetro do retângulo é: %.2f\n",
            ret.calculaArea(),
            ret.calculaPerimetro()
        );
    }
}