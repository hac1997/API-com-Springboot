package com.github.hac1997.primeiroProjeto.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hac1997.primeiroProjeto.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);

    List<Produto>  findByPreco(double preco);


}
