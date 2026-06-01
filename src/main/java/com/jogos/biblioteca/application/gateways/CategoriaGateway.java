package com.jogos.biblioteca.application.gateways;

import java.util.List;
import java.util.Optional;

import com.jogos.biblioteca.domain.Categoria;

public interface CategoriaGateway {
    Categoria cadastrar(Categoria categoria);

    List<Categoria> listar();

    Categoria editar(Integer id, Categoria categoria);

    void deletar(Integer id);

    Optional<Categoria> buscarPorId(Integer id);

}
