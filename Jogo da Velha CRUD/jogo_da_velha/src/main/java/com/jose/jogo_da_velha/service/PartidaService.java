package com.jose.jogo_da_velha.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jose.jogo_da_velha.exception.PartidaNaoEncontradaException;
import com.jose.jogo_da_velha.model.Partida;
import com.jose.jogo_da_velha.repository.PartidaRepository;

import jakarta.transaction.Transactional;

@Service
public class PartidaService {

    private final PartidaRepository partidaRepository;

    public PartidaService(PartidaRepository partidaRepository) {
        this.partidaRepository = partidaRepository;
    }

    private Partida buscaPartida(long id) {
        return partidaRepository.findById(id)
               .orElseThrow(PartidaNaoEncontradaException::new);
    }

    public Partida criarPartida(String nomeJogadorX, String nomeJogadorO) {
        Partida partida = new Partida(nomeJogadorX, nomeJogadorO);
        return partidaRepository.save(partida);
    }

    public List<Partida> listarPartidas() {
        return partidaRepository.findAll();
    }

    public Partida encontrarPartida(long id) {
        return buscaPartida(id);
    }

    @Transactional
    public Partida fazerJogada(long idPartida, String nomeJogador, int linha, int coluna) {
        Partida partida = buscaPartida(idPartida);

        partida.marcarPosicao(nomeJogador, linha, coluna);
        return partidaRepository.save(partida);
    }

    public void apagarPartida(long id) {
        Partida partida = buscaPartida(id);
        partidaRepository.delete(partida);
    }
}
