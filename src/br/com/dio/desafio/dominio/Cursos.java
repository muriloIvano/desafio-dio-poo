package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Cursos extends Conteudos{
    private int cargaHoraria;


    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Cursos{ titulo: "+ getTitulo() +", descrição: "+ getDescricao() +", carga horária:" + cargaHoraria +
                '}';
    }
}
