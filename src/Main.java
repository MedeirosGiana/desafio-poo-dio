import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();//para instanciar uma classe
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Paradigma Orientado a Objeto");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();//para instanciar uma classe, usa-se new.
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Introdução a Java Script");
        curso2.setCargaHoraria(6);

        //Conteudo conteudo = new Curso();->polimorfismo(tudo que tem em conteúdo tem na classe curso, mais nem tudo que tem na classe curso tem em conteúdo).


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java ");
        mentoria.setDescricao("POO ");
        mentoria.setCargaHoraria(LocalDate.now());

       /* System.out.println(curso1 + "\n" + curso2);
        System.out.println(mentoria);*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dveloper");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devGiana = new Dev();
        devGiana.setNome("Giana");
        devGiana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Giana: \n" + devGiana.getConteudosIncritos());

        devGiana.progredir();
        devGiana.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Giana: \n" + devGiana.getConteudosIncritos());

        System.out.println("-");
        System.out.println("Conteudo concluído Giana: \n" + devGiana.getConteudosConcluidos());
        System.out.println("XP: " + devGiana.calcularTotalXp());

        System.out.println(" ---------------- ");

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos Daniel: \n" + devDaniel.getConteudosIncritos());

        devDaniel.progredir();
        devDaniel.progredir();
        devDaniel.progredir();
        System.out.println("-");
        System.out.println("Conteudo inscritos Daniel: \n" + devDaniel.getConteudosIncritos());

        System.out.println("-");
        System.out.println("Conteudo concluídos Daniel: \n" + devDaniel.getConteudosConcluidos());
        System.out.println("XP: " + devDaniel.calcularTotalXp());
    }
}
