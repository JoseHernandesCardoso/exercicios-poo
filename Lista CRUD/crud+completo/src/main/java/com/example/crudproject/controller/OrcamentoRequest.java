package com.example.crudproject.controller;

import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import com.example.crudproject.model.Produto;

public record OrcamentoRequest(
    double valor,
    String descricao,
    int clienteId,
    List<Long> produtoIds
) {
}
