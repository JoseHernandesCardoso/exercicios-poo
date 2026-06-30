package com.example.crudproject.controller;

import com.example.crudproject.model.Cliente;
import com.example.crudproject.model.Produto;
import com.example.crudproject.service.ProdutoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import javax.management.RuntimeErrorException;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> getAllProducts() {
        return produtoService.findAll();
    }

    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping("/{id}")
    public Produto getProduct(@PathVariable Long id){
        return produtoService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Produto> createProduct(@RequestBody Produto produto){
        Produto produtoo = produtoService.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoo);
    }
    @PutMapping("/{id}")
    public Produto updateProduto(@PathVariable long id, @RequestBody Produto produto){
        if (produtoService.findById(id) != null){
            return produtoService.save(produto);
        }
        else{
            throw new RuntimeException("Produto nao encontrado");
        }
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable long id){
        produtoService.deleteById(id);
    }
}

