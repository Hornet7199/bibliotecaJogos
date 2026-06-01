package com.jogos.biblioteca.application.usecases;

import java.util.List;
import java.util.Optional;

import com.jogos.biblioteca.application.gateways.AvaliacaoGateway;
import com.jogos.biblioteca.domain.Avaliacao;
import com.jogos.biblioteca.domain.Categoria;

public class AvaliacaoUseCase {

    public final AvaliacaoGateway gateway;

    public AvaliacaoUseCase(AvaliacaoGateway gateway) {
        this.gateway = gateway;
    }

    public Avaliacao cadastrar(Avaliacao avaliacao) {
        return gateway.cadastrar(avaliacao);
    }

    public List<Avaliacao> listar() {
        return gateway.listar();
    }

    public Categoria editar(Integer id, Avaliacao avaliacao) {
        return gateway.editar(id, avaliacao);
    }

    public void deletar(Integer id) {
        gateway.deletar(id);
    }

    public Optional<Avaliacao> buscarPorId(Integer id) {
        return gateway.buscarPorId(id);
    }

}
