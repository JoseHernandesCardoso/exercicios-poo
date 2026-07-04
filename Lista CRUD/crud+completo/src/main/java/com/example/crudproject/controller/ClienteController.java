package com.example.crudproject.controller;

import com.example.crudproject.model.Cliente;
import com.example.crudproject.service.ClienteService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping
    public List<Cliente> getAllClients(){
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Cliente findById(@PathVariable int id){
        return clienteService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente){
        Cliente clientee = clienteService.save(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientee);
    }

    @PutMapping("/{id}")
    public Cliente updaCliente(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable int id){
        clienteService.deleteById(id);
    }

    @GetMapping("/email/{email}")
    public Optional<Cliente> findByEmail(@PathVariable String email){
        return clienteService.findByEmail(email);
    }
}
