package com.github.hac1997.primeiroProjeto.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hac1997.primeiroProjeto.model.Produto;

@RestController
@RequestMapping("produtos")
public class produtoController {


    @PostMapping    
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto.toString());
        return produto;
        
    } 

}
