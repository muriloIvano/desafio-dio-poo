package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorias extends Conteudos{
    private LocalDate dataDaMentoria;

    public double calcularXp() {
        return XP_PADRAO;
    }

    public LocalDate getDataDaMentoria() {
        return dataDaMentoria;
    }

    public void setDataDaMentoria(LocalDate dataDaMentoria) {
        this.dataDaMentoria = dataDaMentoria;
    }

    public String toString() {
        return "Mentorias{ titulo: " + getTitulo() + ", descricao: "+getDescricao() +", data da mentoria:" + dataDaMentoria +
                '}';
    }
}
