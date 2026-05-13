package com.jose;

public class Main {
    public static void main(String[] args) {
        Motor motor_uno = new Motor("V8", 320, "22W3H09L");
        Carro uno_tunado = new Carro("Fiat", "Uno Bolinha", motor_uno);

        uno_tunado.ligarCarro();
        uno_tunado.exibirFichaTecnica();
    }
}