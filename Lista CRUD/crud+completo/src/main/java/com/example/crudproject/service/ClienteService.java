package com.example.crudproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudproject.model.Cliente;
import com.example.crudproject.repository.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente){
        if (cliente.getEmail() != null && cliente.getNome() != null){
            return clienteRepository.save(cliente);
        }
        else{
            throw new RuntimeException("Cliente Invalido");
        }
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Cliente findById(int id){
        return clienteRepository.findById(id).orElse(null);
    }

    public void deleteById(int id){
        clienteRepository.deleteById(id);
    }

    public Optional<Cliente> findByEmail(String email){
        return clienteRepository.findByEmail(email);
    } 
}
