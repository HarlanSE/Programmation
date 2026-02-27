package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap4.parte2;

public class Main {

    public static void verificarIdade(int idade) throws IdadeInvalidaException {

        if (idade < 18) {
            throw new IdadeInvalidaException("Idade inválida! É necessário ter 18 anos ou mais.");
        }

        System.out.println("Idade válida. Acesso permitido.");
    }

    public static void main(String[] args) {

        try {
            verificarIdade(16);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Programa finalizado.");
    }
}
