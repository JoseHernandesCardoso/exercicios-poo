package com.jose.jogo_da_velha.exception;

public record ErroResponse (
    int status,
    String erro,
    String mensagem
) {}

