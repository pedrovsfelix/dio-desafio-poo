import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descrição do curso JS");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Backend JAVA");
        mentoria.setDescricao("Mentoria em Backend");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java");
        bootcamp.setDescricao("Descricao do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Conteúdos incritos " + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());
    }
}
