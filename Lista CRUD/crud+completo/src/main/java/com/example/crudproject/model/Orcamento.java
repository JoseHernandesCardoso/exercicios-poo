package com.example.crudproject.model;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String descricao;
    private double valor;
    
    private StatusOrcamento status = StatusOrcamento.PENDENTE;
    
    @ManyToOne
    private Cliente cliente;

    @ManyToMany
    private List<Produto> produtos;
    
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Optional<Cliente> cliente) {
        this.cliente = cliente.orElse(null);
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusOrcamento getStatus() {
        return status;
    }

    public void setStatus(StatusOrcamento status) {
        this.status = status;
    }

    public void aprovar(){
        status = StatusOrcamento.APROVADO;
    }

    public void rejeitar(){
        status = StatusOrcamento.REJEITADO;
    }
    public double calcularValorTotal() {
        double soma = 0;
        for (Produto produto : produtos) {
            soma += produto.getPreco();
        }
        return soma;        
    }
}
