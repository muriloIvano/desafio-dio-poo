package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BootCamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private List<Devs> listaDeDevs = new ArrayList<>();
    private List<Conteudos> conteudos = new ArrayList<>();

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
