package com.jose.jogo_da_velha.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(PartidaNaoEncontradaException.class)
    public ResponseEntity<ErroResponse> trataNaoEncontrado(
        PartidaNaoEncontradaException ex) {

        ErroResponse response = new ErroResponse(
            404,
            "Not Found",
            ex.getMessage()
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

    @ExceptionHandler(JogadaInvalidaException.class)
    public ResponseEntity<ErroResponse> trataJogadaInvalida(
        JogadaInvalidaException ex) {

        ErroResponse response = new ErroResponse(
            409,
            "Conflict",
            ex.getMessage()
        );

        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }

    @ExceptionHandler(PartidaEncerradaException.class)
    public ResponseEntity<ErroResponse> trataPartidaEncerrada(
        PartidaEncerradaException ex) {

        ErroResponse response = new ErroResponse(
            409,
            "Conflict",
            ex.getMessage()
        );

        return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
    }

    @ExceptionHandler(NomeInvalidoException.class)
    public ResponseEntity<ErroResponse> trataNomeInvalido(
        NomeInvalidoException ex) {

            ErroResponse response = new ErroResponse(
                400,
                "Bad Request",
                ex.getMessage()
            );

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
}