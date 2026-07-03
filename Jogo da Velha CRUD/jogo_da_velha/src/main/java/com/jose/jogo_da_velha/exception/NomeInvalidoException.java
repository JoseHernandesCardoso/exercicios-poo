package com.jose.jogo_da_velha.exception;

public class NomeInvalidoException extends RuntimeException {
    public NomeInvalidoException() {
        super("Nome vazio inválido!");
    }
}
