package com.jose.jogo_da_velha.exception;

public class PartidaEncerradaException extends RuntimeException{
    public PartidaEncerradaException() {
        super("A partida já terminou!");
    }
}
