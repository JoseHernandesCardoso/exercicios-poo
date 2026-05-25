package com.jose;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Ronaldo", 3562.41, "2B"));
        funcionarios.add(new Gerente("Marcia", 3562.41, "1B"));

        funcionarios.add(new Vendedor("Marcos", 1563.90));
        funcionarios.add(new Vendedor("Roberta", 1632.70));
        funcionarios.add(new Vendedor("Lucas", 1200.00));

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibir();
        }
    }
}