package Java.capacitaIrede2025.iRede.MiniProjeto.service;

import Java.capacitaIrede2025.iRede.MiniProjeto.model.Livro;
import Java.capacitaIrede2025.iRede.MiniProjeto.model.Usuario;
import Java.capacitaIrede2025.iRede.MiniProjeto.exceptions.LivroIndisponivelException;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaService {

    private List<Livro> livros = new ArrayList<>();


    public void adicionarLivro(Livro livro) {

        livros.add(livro);

    }


    public void listarLivrosDisponiveis() {

        System.out.println("\n📚 Livros disponíveis:");

        for (Livro livro : livros) {

            if (livro.isDisponivel()) {

                System.out.println(livro.getTitulo() +
                        " - " +
                        livro.getAutor());

            }

        }

    }


    public void emprestarLivro(Livro livro, Usuario usuario)
            throws LivroIndisponivelException {

        if (!livro.isDisponivel()) {

            throw new LivroIndisponivelException(
                    "O livro '" +
                            livro.getTitulo() +
                            "' não está disponível."
            );

        }

        livro.emprestar();

        System.out.println(
                usuario.getNome() +
                        " pegou o livro: " +
                        livro.getTitulo()
        );

    }


    public void devolverLivro(Livro livro, Usuario usuario) {

        livro.devolver();

        System.out.println(
                usuario.getNome() +
                        " devolveu o livro: " +
                        livro.getTitulo()
        );

    }

}

