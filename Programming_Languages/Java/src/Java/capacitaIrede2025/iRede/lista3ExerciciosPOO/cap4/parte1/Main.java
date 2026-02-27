package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap4.parte1;

import java.util.Scanner;

public class Main {

    public static int lerNumeroInteiro() {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print("Digite um número inteiro: ");

            try {
                numero = Integer.parseInt(scanner.nextLine());
                valido = true; // entrada válida
            } catch (NumberFormatException e) {
                System.out.println("Erro: você deve digitar um número inteiro válido.");
            }
        }

        return numero;
    }

    public static void main(String[] args) {
        int valor = lerNumeroInteiro();
        System.out.println("Número digitado: " + valor);
    }
}