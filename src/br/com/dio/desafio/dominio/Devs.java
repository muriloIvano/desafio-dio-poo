package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Devs {
    private String nome;
    private List<Conteudos> conteudosInscritos = new ArrayList<>();
    private List<Conteudos> conteudosConcluido = new ArrayList<>();

    public List<Conteudos> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(List<Conteudos> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public List<Conteudos> getConteudosConcluido() {
        return conteudosConcluido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
