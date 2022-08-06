import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();
        Curso curso2 = new Curso();
        
        curso.setTitulo("Curso Java");
        curso.setDescricao("POO Java");
        curso.setCargaHoraria(4);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("POO JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Spring Framework");
        bootcamp.setDescricao("Bootcamp introdutório de Java com Spring Framework");
        bootcamp.getConteudos().add(curso);

        Dev dev = new Dev();
        dev.setNome("Higor Souza");
        dev.inscreverBootcamp(bootcamp);

        System.out.println("conteudos Inscritos:" + dev.getConteudosInscritos());
        System.out.println("conteudos Concluidos:" + dev.getConteudosConcluidos());
        System.out.println("total xp:" + dev.calcularTotalXp());
        
        System.out.println("................");
        
        dev.progredir();
        System.out.println("conteudos Inscritos:" + dev.getConteudosInscritos());
        System.out.println("conteudos Concluidos:" + dev.getConteudosConcluidos());
        System.out.println("total xp:" + dev.calcularTotalXp());
    }
}
