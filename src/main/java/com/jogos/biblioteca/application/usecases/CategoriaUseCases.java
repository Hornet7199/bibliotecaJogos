package com.jogos.biblioteca.application.usecases;

import java.util.List;
import java.util.Optional;

import com.jogos.biblioteca.application.gateways.CategoriaGateway;
import com.jogos.biblioteca.domain.Categoria;

public class CategoriaUseCases {
    public final CategoriaGateway gateway;

    public CategoriaUseCases(CategoriaGateway gateway) {
        this.gateway = gateway;
    }

    public Categoria cadastrar(Categoria categoria) {
        return gateway.cadastrar(categoria);
    }

    public List<Categoria> listar() {
        return gateway.listar();
    }

    public void deletar(Integer id) {
        gateway.deletar(id);
    }

    public Categoria editar(Integer id, Categoria categoria) {
        return gateway.editar(id, categoria);
    }

    public Optional<Categoria> buscarPorId(Integer id) {
        return gateway.buscarPorId(id);
    }

}
