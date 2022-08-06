import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
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

        Conteudo conteudo = new Curso();
        System.out.println("curso:" + curso);
    }
}
