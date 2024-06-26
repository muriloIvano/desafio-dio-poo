package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Devs {
    private String nome;
    private double pontuacao;
    private List<Conteudos> conteudosInscritos = new ArrayList<>();
    private List<Conteudos> conteudosConcluido = new ArrayList<>();
    private List<BootCamp> listaDeBootcamps = new ArrayList<>();

    public List<Conteudos> getConteudosInscritos() {
        return conteudosInscritos;
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

    public void inscreverBootcamp(BootCamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getListaDeDevs().add(this);
        listaDeBootcamps.add(bootcamp);
    }
    public void progredir(){
        if(!conteudosInscritos.isEmpty()){
            this.conteudosConcluido.addAll(conteudosInscritos);
            this.conteudosInscritos.removeAll(conteudosConcluido);
            } else {
            System.out.println("Não há nenhum conteúdo inscrito!");
        }
    }
    public void exibirPerfil(){
        System.out.print(nome);
        System.out.print(", "+ pontuacao + " XP");
    }
    public void calcularTotalXp() {
        Iterator<Conteudos> iterator = this.conteudosConcluido.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calcularXp();
            soma += next;
        }
        pontuacao = soma;
    }

    public void exibirBootcamps(){
        if(!listaDeBootcamps.isEmpty()) {
            System.out.println("DEV: " + nome + ", BOOTCAMPs inscritos:");
            for(BootCamp b : listaDeBootcamps){

                System.out.println(b.getNome() + ", descrição: " + b.getDescricao());
                System.out.println();
            }
        } else {
                System.out.println("DEV: " + nome + ", não há inscrição em nenhum BOOTCAMP!");
            }
    }


    @Override
    public String toString() {
        return "Dev{ nome" + nome + ", pontuacao=" + pontuacao + '}';
    }
}
