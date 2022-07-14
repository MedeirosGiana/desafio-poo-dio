package br.com.dio.desafio.dominio;

public abstract class Conteudo {//uma classe abstract não pode ser instanciada
    protected static final double XP_PADRAO = 10d;//para declarar uma constante

    private String titulo;
    private String descricao;

    public abstract double calcularXp();//abstract não consegue criar/instanciar um conteudo/classe conteúdo.

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
