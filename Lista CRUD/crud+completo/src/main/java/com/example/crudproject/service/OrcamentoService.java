package com.example.crudproject.service;

import com.example.crudproject.controller.OrcamentoRequest;
import com.example.crudproject.exception.ValidacaoException;
import com.example.crudproject.model.Orcamento;
import com.example.crudproject.model.Produto;
import com.example.crudproject.model.StatusOrcamento;
import com.example.crudproject.repository.ClienteRepository;
import com.example.crudproject.repository.OrcamentoRepository;
import com.example.crudproject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrcamentoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    private OrcamentoRepository orcamentoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    OrcamentoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Orcamento insertOrcamento(OrcamentoRequest orcamentoRequest){
        Orcamento orcamento = new Orcamento();
        orcamento.setCliente(clienteRepository.findById(orcamentoRequest.clienteId()));
        orcamento.setDescricao(orcamentoRequest.descricao());
        orcamento.setValor(orcamentoRequest.valor());
        List<Long> prodIds = orcamentoRequest.produtoIds();
        List<Produto> prods = new ArrayList<>();
        for (Long id : prodIds) {
            prods.add(produtoRepository.findById(id).orElse(null));
        }
        orcamento.setProdutos(prods);
        if (orcamento.getCliente() != null){
            return orcamentoRepository.save(orcamento);
        }
        else{
            throw new RuntimeException("Deve haver Cliente");
        }
    }

    public List<Orcamento> selectAllOrcamento(){
        return orcamentoRepository.findAll();
    }

    
    public List<Orcamento> findByAprovado(){
        return orcamentoRepository.findByStatus(StatusOrcamento.APROVADO);
    }
    
    public List<Orcamento> findByReprovado(){
        return orcamentoRepository.findByStatus(StatusOrcamento.REJEITADO);
    }
    
    public List<Orcamento> findByPendente(){
        return orcamentoRepository.findByStatus(StatusOrcamento.PENDENTE);
    }

    // select * from orcamento where "id"=id
    public Orcamento selectOrcamentoById(int id){
        Optional<Orcamento> oc = orcamentoRepository.findById(id);
        if(oc.isPresent()){
            return oc.get();
        }else{
            throw new ValidacaoException("Orcamento nao encotrado.");
        }
    }

    // status Pendente -> Aprovado

    public Orcamento aprovarOrcamento(int id){
        Orcamento oc = selectOrcamentoById(id);
        oc.aprovar();
        return orcamentoRepository.save(oc);
    }

    public Orcamento rejeitarOrcamento(int id){
        Orcamento oc = selectOrcamentoById(id);
        oc.rejeitar();
        return orcamentoRepository.save(oc);
    }

    public void deletarOrcamento(int id){
        orcamentoRepository.deleteById(id);
    }
}
