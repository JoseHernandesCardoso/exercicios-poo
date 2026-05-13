package com.jose;

public class Main {
    public static void main(String[] args) {
        Perfil perf_jose = new Perfil("C. Comp - UEM | Gamer B)", "Foto_Maneira.png", "Público");
        Usuario jose = new Usuario("JoseGamer123", "jose@email.com", perf_jose);

        jose.exibirUsuario();
    }
}