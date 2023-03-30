package com.example.ac1_parte2.model;

public class Album {

    public String banda;
    public int ano;
    public String saibamais;
    public String fotografo;
    public int imagem;

    public Album() {
    }

    public Album(String banda, int ano, String saibamais, String fotografo, int imagem) {
        this.banda = banda;
        this.ano = ano;
        this.saibamais = saibamais;
        this.fotografo = fotografo;
        this.imagem = imagem;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSaibamais() {
        return saibamais;
    }

    public void setSaibamais(String saibamais) {
        this.saibamais = saibamais;
    }

    public String getFotografo() {
        return fotografo;
    }

    public void setFotografo(String fotografo) {
        this.fotografo = fotografo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
