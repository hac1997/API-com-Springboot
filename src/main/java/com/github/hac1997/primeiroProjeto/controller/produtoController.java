package com.github.hac1997.primeiroProjeto.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hac1997.primeiroProjeto.model.Produto;
import com.github.hac1997.primeiroProjeto.repository.ProdutoRepository;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;
    

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }


    @PostMapping    
    public void salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto.toString());
        produtoRepository.save(produto);
        
        } 

    @GetMapping
    public Produto obterPorId(@RequestBody String id){

        return produtoRepository.findById(id).orElse(null);


    }

}
