package com.example.crudproject.service;

import com.example.crudproject.exception.ValidacaoException;
import com.example.crudproject.model.Produto;
import com.example.crudproject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository productRepository;

    public List<Produto> findAll() {
        return productRepository.findAll();
    }

    public Produto findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Produto save(Produto product) {
        if (product.getPreco() >= 0){
            return productRepository.save(product);
        }
        else{
            throw new ValidacaoException("Preco invalido, menor que 0");
        }
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
