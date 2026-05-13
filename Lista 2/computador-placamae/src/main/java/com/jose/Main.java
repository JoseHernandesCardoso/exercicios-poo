package com.jose;

public class Main {
    public static void main(String[] args) {
        PlacaMae placa = new PlacaMae("Asus B250", "Intel");
        Computador positivao = new Computador("Positivo", "Intel Celeron 2.0 Master Turbo Gamer RGB", placa);

        positivao.exibirConfiguracao();
    }
}