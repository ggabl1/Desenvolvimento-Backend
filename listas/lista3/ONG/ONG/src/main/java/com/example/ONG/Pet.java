package com.example.ONG;

public class Pet {
    private int id;
    private String nome;
    private String especie;
    private boolean jaFoiAdotado;

    public Pet(){

    }

    public Pet(int id, String nome, String especie, boolean jaFoiAdotado) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.jaFoiAdotado = jaFoiAdotado;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public boolean isJaFoiAdotado() {
        return jaFoiAdotado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setJaFoiAdotado(boolean jaFoiAdotado) {
        this.jaFoiAdotado = jaFoiAdotado;
    }

    
}
