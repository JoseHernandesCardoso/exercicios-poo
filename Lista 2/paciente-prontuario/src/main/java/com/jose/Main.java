package com.jose;

public class Main {
    public static void main(String[] args) {
        Prontuario pront = new Prontuario(251221, "AB+", "Nenhuma");
        Paciente paciente = new Paciente("Jorginho Matos", 21, pront);

        paciente.exibirProntuario();
    }
}