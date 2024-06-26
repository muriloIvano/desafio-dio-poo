import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Cursos curso01 = new Cursos();
    curso01.setTitulo("Curso para virar um Javeiro");
    curso01.setDescricao("Este curso irá fazer com que você vire um desevolvedor java por completo");
    curso01.setCargaHoraria(10);

    Cursos curso02 = new Cursos();
    curso02.setTitulo("Curso Banco de dados não relacionais");
    curso02.setDescricao("Curso para aprender sobre banco de dados não relacionais");
    curso02.setCargaHoraria(5);

    Mentorias mentoria01 = new Mentorias();
    mentoria01.setTitulo("Carreira no desenvolvimento");
    mentoria01.setDescricao("Iremos tirar suas duvidas e te de dar um norte sobre a carreira no desenvolvimento");
    mentoria01.setDataDaMentoria(LocalDate.now().plusDays(5));

    Mentorias mentoria02 = new Mentorias();
    mentoria02.setTitulo("Mentoria 02");
    mentoria02.setDescricao("Descricao Mentoria 02");
    mentoria02.setDataDaMentoria(LocalDate.now().plusDays(10));

    BootCamp bootcamp = new BootCamp("Bootcamp Java", "Descricao");
    bootcamp.adicionarConteudo(curso02);
    bootcamp.adicionarConteudo(mentoria01);
    bootcamp.adicionarConteudo(mentoria02);
    bootcamp.adicionarConteudo(curso01);

    BootCamp bootcampFullstack = new BootCamp("Bootcamp FULLSTACK", "Iremos aprender BACK-END com JAVA e FRONT-END com Angular");

    bootcampFullstack.adicionarConteudo(curso01);
    Devs dev01 = new Devs();
    dev01.setNome("Murilo DEV");
    dev01.inscreverBootcamp(bootcamp);
    dev01.inscreverBootcamp(bootcampFullstack);
    dev01.progredir();
    dev01.calcularTotalXp();
    dev01.exibirBootcamps();

    Devs dev02 = new Devs();
    dev02.setNome("Joaquim");
    dev02.exibirBootcamps();




        System.out.println(bootcamp);
        System.out.println(bootcampFullstack);
        System.out.println();
        dev01.exibirPerfil();

    }
}
