package Java.capacitaIrede2025.iRede.MiniProjeto;

import Java.capacitaIrede2025.iRede.MiniProjeto.model.*;
import Java.capacitaIrede2025.iRede.MiniProjeto.service.BibliotecaService;
import Java.capacitaIrede2025.iRede.MiniProjeto.exceptions.LivroIndisponivelException;

public class Main {

    public static void main(String[] args) {

        BibliotecaService biblioteca =
                new BibliotecaService();


        Livro livro1 =
                new Livro(
                        "Java para Iniciantes",
                        "Herbert Schildt"
                );

        Livro livro2 =
                new Livro(
                        "Gramática para concursos",
                        "Fernando Pestana"
                );


        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);


        Aluno aluno =
                new Aluno(
                        "Sung Un",
                        "song@email.com"
                );

        Professor professor =
                new Professor(
                        "Ana Júlia",
                        "Naju@email.com"
                );


        biblioteca.listarLivrosDisponiveis();


        try {

            biblioteca.emprestarLivro(livro1, aluno);


            biblioteca.emprestarLivro(livro1, professor);

        }
        catch (LivroIndisponivelException e) {

            System.out.println("\nERRO: " +
                    e.getMessage());

        }


        biblioteca.devolverLivro(livro1, aluno);


        biblioteca.listarLivrosDisponiveis();

    }

}