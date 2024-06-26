package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BootCamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFinal = dataInicial.plusDays(10);
    private List<Devs> listaDeDevs = new ArrayList<>();
    private List<Conteudos> conteudos = new ArrayList<>();

    public BootCamp(String nome, String descricao, Conteudos conteudo) {
        this.nome = nome;
        this.descricao = descricao;

        this.conteudos.add(conteudo);
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Conteudos> getConteudos() {
        return conteudos;
    }

    public void setConteudos(List<Conteudos> conteudos) {
        this.conteudos = conteudos;
    }

    public List<Devs> getListaDeDevs() {
        return listaDeDevs;
    }

    public void setListaDeDevs(List<Devs> listaDeDevs) {
        this.listaDeDevs = listaDeDevs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(nome, bootCamp.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public void adicionarConteudo (Conteudos conteudo){
        conteudos.add(conteudo);
    }

    @Override
    public String toString() {
        return "BootCamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", listaDeDevs=" + listaDeDevs +
                ", conteudos=" + conteudos +
                '}';
    }
}
