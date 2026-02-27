package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte4;

public class Main {
    public static void main(String[] args) {

        // Alunos existem independentemente
        Aluno a1 = new Aluno("Maria");
        Aluno a2 = new Aluno("João");

        // Criando curso
        Curso curso = new Curso("Java Orientado a Objetos");

        // Adicionando alunos ao curso
        curso.adicionarAluno(a1);
        curso.adicionarAluno(a2);

        curso.listarAlunos();

        System.out.println("\nRemovendo João do curso...\n");

        curso.removerAluno(a2);

        curso.listarAlunos();

        // João ainda existe mesmo fora do curso
        System.out.println("\nJoão ainda existe no sistema:");
        a2.exibir();
    }
}
