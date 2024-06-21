package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;
    private String nivel; // Novo atributo para o nível do curso
    private String professor; // Novo atributo para o professor do curso

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public Curso(String titulo, String descricao, int cargaHoraria, String nivel, String professor) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.professor = professor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", nivel='" + nivel + '\'' +
                ", professor='" + professor + '\'' +
                '}';
    }
}
