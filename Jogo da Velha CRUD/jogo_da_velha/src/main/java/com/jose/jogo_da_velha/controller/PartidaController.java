package com.jose.jogo_da_velha.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jose.jogo_da_velha.model.Partida;
import com.jose.jogo_da_velha.service.PartidaService;

@RestController
@RequestMapping("/partidas")
public class PartidaController {
    
    private final PartidaService partidaService;

    public PartidaController(PartidaService partidaService) {
        this.partidaService = partidaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Partida criar(@RequestParam String nomeJogadorX,
                                @RequestParam String nomeJogadorO) {

        return partidaService.criarPartida(nomeJogadorX, nomeJogadorO);
    }

    @GetMapping
    public List<Partida> listar() {
        return partidaService.listarPartidas();
    }

    @GetMapping("/{id}")
    public Partida encontrar(@PathVariable long id) {
        return partidaService.encontrarPartida(id);
    }

    @PutMapping("/{id}/jogar")
    public Partida jogar(@PathVariable long id,
        @RequestParam String nomeJogador,
        @RequestParam int linha,
        @RequestParam int coluna
    ) {
        return partidaService.fazerJogada(id, nomeJogador, linha, coluna);
    }

    @DeleteMapping("/{id}/apagar")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void apagar(@PathVariable long id) {
        partidaService.apagarPartida(id);
    }
}
