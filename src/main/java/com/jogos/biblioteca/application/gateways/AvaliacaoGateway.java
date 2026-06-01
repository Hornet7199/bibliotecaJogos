package com.jogos.biblioteca.application.gateways;

import java.util.List;
import java.util.Optional;

import com.jogos.biblioteca.domain.Avaliacao;
import com.jogos.biblioteca.domain.Categoria;

public interface AvaliacaoGateway {
    Avaliacao cadastrar(Avaliacao avaliacao);

    List<Avaliacao> listar();

    Categoria editar(Integer id, Avaliacao avaliacao);

    void deletar(Integer id);

    Optional<Avaliacao> buscarPorId(Integer id);

}
