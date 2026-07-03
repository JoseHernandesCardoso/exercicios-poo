package com.jose.jogo_da_velha.exception;

public class PartidaNaoEncontradaException extends RuntimeException{
    public PartidaNaoEncontradaException() {
        super("Não foi possível encontrar a partida!");
    }
}
