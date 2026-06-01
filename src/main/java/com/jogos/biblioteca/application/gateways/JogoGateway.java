package com.jogos.biblioteca.application.gateways;

import java.util.List;
import java.util.Optional;

import com.jogos.biblioteca.domain.Jogo;

public interface JogoGateway {

    Jogo cadastrar(Jogo jogo);

    List<Jogo> listar();

    void deletar(Integer id);

    Jogo editar(Integer id, Jogo jogo);

    Optional<Jogo> buscaPorId(Integer id);

    Optional<Jogo> buscarPorNome(String nome);

}
