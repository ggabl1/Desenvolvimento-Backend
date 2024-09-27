package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;

@Service
public class ProdutoService {
private ProdutoRepository repository;
@Autowired
public  ProdutoService(ProdutoRepository repository){
    this.repository = repository;
}

public List<Produto> obterTodosProdutos(){
    return repository.findAll();
}
public Produto obterProdutosPeloId(int id){
    Optional<Produto> optional = repository.findById(id);
    if(optional.isPresent()){
        return optional.get();
    }
    throw new RuntimeException("Produto nao encontrado");
}

public Produto cadastrarProduto(Produto produto){
    return repository.save(produto);
}

public Produto deletarProduto(int id){
    Optional<Produto> optional = repository.findById(id);
    if(optional.isPresent()){
        repository.deleteById(id);
        return optional.get();
    }
    return null;
}
}