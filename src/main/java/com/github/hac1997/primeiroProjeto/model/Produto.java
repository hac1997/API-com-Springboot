package com.github.hac1997.primeiroProjeto.model;
import org.springframework.data.relational.core.mapping.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nomeProduto;
    private String descricao;
    private double preco;
    
    @Override
    
        public String toString() {
            return "Produto [id=" + id + ", nomeProduto=" + nomeProduto + ", descricao=" + descricao + ", preco=" + preco
                    + "]";
        }
    
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getNomeProduto() {
            return nomeProduto;
        }
        public void setNomeProduto(String nomeProduto) {
            this.nomeProduto = nomeProduto;
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
