package com.example.demo.controller;

import java.io.Serial;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Produto;
import com.example.demo.service.ProdutoService;
@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")

public class ProdutoController {
    private ProdutoService service;
    
    @Autowired
    public ProdutoController(ProdutoService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<com.example.demo.model.Produto>> getAll(){
        List<com.example.demo.model.Produto> produtos = service.obterTodosProdutos();
        return ResponseEntity.status(HttpStatus.OK.value()).body(produtos); 
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK.value()).body(service.obterProdutosPeloId(id));
    }

    @PostMapping
    public ResponseEntity<com.example.demo.model.Produto> cadstrar(com.example.demo.model.Produto produto){
        com.example.demo.model.Produto produtoCadastrado = service.cadastrarProduto(produto);
        return ResponseEntity.status(HttpStatus.CREATED.value()).body(produtoCadastrado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<com.example.demo.model.Produto> deletarProduto(@PathVariable("id") int id){
        return ResponseEntity.status(HttpStatus.OK.value()).body(service.deletarProduto(id));
    }
}