import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando Cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        // Criando Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // Criando Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criando Devs
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        // Exibindo informações adicionais
        System.out.println("-------");
        System.out.println("Detalhes do Bootcamp:");
        System.out.println("Nome: " + bootcamp.getNome());
        System.out.println("Descrição: " + bootcamp.getDescricao());
        System.out.println("Data Inicial: " + bootcamp.getDataInicial());
        System.out.println("Data Final: " + bootcamp.getDataFinal());
        System.out.println("Devs Inscritos: " + bootcamp.getDevsInscritos());
        System.out.println("Conteúdos do Bootcamp: " + bootcamp.getConteudos());

        System.out.println("-------");
        System.out.println("Detalhes do Curso 1:");
        System.out.println("Título: " + curso1.getTitulo());
        System.out.println("Descrição: " + curso1.getDescricao());
        System.out.println("Carga Horária: " + curso1.getCargaHoraria());
        System.out.println("XP do Curso 1: " + curso1.calcularXp());

        System.out.println("-------");
        System.out.println("Detalhes do Curso 2:");
        System.out.println("Título: " + curso2.getTitulo());
        System.out.println("Descrição: " + curso2.getDescricao());
        System.out.println("Carga Horária: " + curso2.getCargaHoraria());
        System.out.println("XP do Curso 2: " + curso2.calcularXp());

        System.out.println("-------");
        System.out.println("Detalhes da Mentoria:");
        System.out.println("Título: " + mentoria.getTitulo());
        System.out.println("Descrição: " + mentoria.getDescricao());
        System.out.println("Data: " + mentoria.getData());
        System.out.println("XP da Mentoria: " + mentoria.calcularXp());
    }
}
