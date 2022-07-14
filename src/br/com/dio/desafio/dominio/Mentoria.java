package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data; //classe localdate para trabalhar com datas

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    //getter and setter: usado para trabalhar om os atributos
    public LocalDate getCargaHoraria() {
        return data;
    }

    public void setCargaHoraria(LocalDate cargaHoraria) {
        this.data    = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + data +
                '}';
    }
}
