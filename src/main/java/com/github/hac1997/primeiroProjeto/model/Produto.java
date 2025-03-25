package com.github.hac1997.primeiroProjeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;
    private String descricao;
    private double preco;
    
    @Override
    
        public String toString() {
            return "Produto [id=" + id + ", nomeProduto=" + nome + ", descricao=" + descricao + ", preco=" + preco
                    + "]";
        }
    
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nomeProduto) {
            this.nome = nomeProduto;
        }
        public String getDescricao() {
            return descricao;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
        public double getPreco() {
            return preco;
        }
        public void setPreco(double preco) {
            this.preco = preco;
        }


}
