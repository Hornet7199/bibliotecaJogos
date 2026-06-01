package com.jogos.biblioteca.application.usecases;

import java.util.List;
import java.util.Optional;

import com.jogos.biblioteca.application.gateways.JogoGateway;
import com.jogos.biblioteca.domain.Jogo;

public class JogoUseCase {

    public final JogoGateway gateway;

    public JogoUseCase(JogoGateway gateway) {
        this.gateway = gateway;
    }

    public Jogo cadastrar(Jogo jogo) {
        return gateway.cadastrar(jogo);
    }

    public List<Jogo> listar() {
        return gateway.listar();
    }

    public void deletar(Integer id) {
        gateway.deletar(id);
    }

    public Jogo editar(Integer id, Jogo jogo) {
        return gateway.editar(id, jogo);
    }

    public Optional<Jogo> buscarPorId(Integer id) {
        return gateway.buscaPorId(id);
    }

    public Optional<Jogo> buscarPorNome(String nome) {
        return gateway.buscarPorNome(nome);
    }

}
