package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap4.parte4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void abrirArquivo(String caminho) {

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha;

            System.out.println("Conteúdo do arquivo:");

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        abrirArquivo("arquivo.txt");
    }
}
