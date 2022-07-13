import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("POO");
        mentoria.setCargaHoraria(LocalDate.now());

        System.out.println(curso1 + "\n" + curso2);
        System.out.println(mentoria);
    }
}
