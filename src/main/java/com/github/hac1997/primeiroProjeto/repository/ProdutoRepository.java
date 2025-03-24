package com.github.hac1997.primeiroProjeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hac1997.primeiroProjeto.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
