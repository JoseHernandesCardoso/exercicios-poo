package com.example.crudproject.controller;


import com.example.crudproject.model.Cliente;
import com.example.crudproject.model.Orcamento;
import com.example.crudproject.repository.ClienteRepository;
import com.example.crudproject.service.OrcamentoService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orcamento")
public class OrcamentoController {

    private final ClienteRepository clienteRepository;
    @Autowired
    private OrcamentoService orcamentoService;

    OrcamentoController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    public ResponseEntity<Orcamento> criarOrcamento(@RequestBody OrcamentoRequest orcamentoRequest){
        Orcamento orcamento = orcamentoService.insertOrcamento(orcamentoRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(orcamento);
    }

    @GetMapping
    public List<Orcamento> listarOrcamento(){
        return orcamentoService.selectAllOrcamento();
    }

    @GetMapping("/status/APROVADO")
    public List<Orcamento> findByAprovado(){
        return orcamentoService.findByAprovado();
    }
    @GetMapping("/status/REPROVADO")
    public List<Orcamento> findByReprovado(){
        return orcamentoService.findByReprovado();
    }
    @GetMapping("/status/PENDENTE")
    public List<Orcamento> findByPendente(){
        return orcamentoService.findByPendente();
    }

    @PutMapping("/{id}/aprovar")
    public Orcamento aprovarOrcamento(@PathVariable int id){
        return orcamentoService.aprovarOrcamento(id);
    }
    @PutMapping("/{id}/rejeitar")
    public Orcamento rejeitarOrcamento(int id){
        return orcamentoService.rejeitarOrcamento(id);
    }

    @GetMapping("/{id}")
    public Orcamento buscarById(@PathVariable int id){
        return orcamentoService.selectOrcamentoById(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        orcamentoService.deletarOrcamento(id);
    }
}
