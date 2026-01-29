package Java.I_Fundamentos_Do_Java.exercicios.iRede;

import java.util.Locale;
import java.util.Scanner;
/**
 * Recado ao corretor:
 * os identificadores das resoluções estão em inglês com o intuito de
 * praticar a lingua inglesa em contexto de desenvolvimento. Caso não esteja claro
 * deixei alguns comentários nos pontos mais importantes da lógica das soluções.
 */

public class Lista1_FranciscoHarlanPaivaBeserraFilho {

    public static void q1(){
        //1. Escreva um programa Java que use os operadores lógicos para vericar se um
        //número está entre 10 e 20 (inclusive). Use int numero = 15;.

        System.out.println("--------- Question 1 -----------");
        int number = 15;


        if(number >= 10 && number <= 20) System.out.printf("o número %d está entre 10 e 20!", number);
        else System.out.printf("o número %d não está entre 10 e 20!", number);
    }

    public static void q2(){
        //2. Escreva um programa que mostre na tela os tipos de dados primitivos em Java
        //com seus valores atribuídos.

        System.out.println("\n--------- Question 2 -----------");

        //caractere:                     ponto flutuante:
        char a = 'a';                   float f = 1.65f;
        double g = 1.85;

        //inteiros:                     booleanos:
        byte b = -128;                  boolean False = true, True = false;
        short c = 128;                  // uma pequena brincadeira. ;) Não é uma boa prática induzir
        int d = 1000;                   // a confusão entre identificadores e literais.
        long e = 1000;

        System.out.println("\n char:  " + a +
                " \n byte: " + b +
                "\n short: " + c +
                "\n int: " + d +
                "\n long: " + e +
                "\n float: " + f +
                "\n double: " + g +
                "\n boolean verdadeiro: " + False +
                "\n boolean falso: " + True );
    }

    public static void q3() {
        //3. Implemente um programa que exiba um menu com 3 opções:
        //1 - Somar dois números
        //2 - Subtrair dois números
        //3 - Sair
        //O programa deve usar switch para executar a operação escolhida.

        System.out.println("\n--------- Question 3 -----------");


        int option = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //estou usando o package util.Locale só por questão de estética e rigor
        //matemático, conferindo uma imersão maior com o modelo americano de pontuação.

        while (option != 3) {
            double x, y;


            System.out.println("\n options: \n 1. add two numbers \n 2. subtract two numbers \n 3. exit");
            System.out.print("Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter a value for x: ");
                    x = scanner.nextDouble();
                    System.out.println("Enter a value for y: ");
                    y = scanner.nextDouble();

                    double sum = (x + y);
                    System.out.printf(Locale.US, "The sum is: %.2f%n", sum);
                    break;

                case 2:
                    System.out.println("Enter a value for x: ");
                    x = scanner.nextDouble();
                    System.out.println("Enter a value for y: ");
                    y = scanner.nextDouble();

                    double diff = (x - y);
                    System.out.printf(Locale.US, "The difference is: %.2f%n", diff);
                    break;

                case 3:
                    break;
                default:
                    System.out.println("invalid option, enter again");
                    continue;

            }
        }
    }

    public static void q4(){
        //4. Crie um programa que leia um número inteiro do usuário e imprima a tabuada
        //desse número (de 1 a 10), usando um laço for.

        System.out.println("\n--------- Question 4 -----------");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter a integer number:  ");
        int n = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {

            String quotient;
            if (i == 0) quotient = "-∞,∞";
            else quotient = "" + (double) n / i;

            //Quis adicionar a tabuada das quatro operações básicas
            System.out.printf(Locale.US, " %d + %d = %d | %d - %d = %d | %d * %d = %d | %d / %d = %.4s%n",
                    n, i, (n + i),
                    n, i, (n - i),
                    n, i, (n * i),
                    n, i, quotient
            );
        }
    }

    public static void q5(){
        //5. Faça um programa que leia uma string e substitua todas as ocorrências da letra "e"
        //por "*".

        System.out.println("\n--------- Question 5 -----------");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter a new String: ");
        String string = scanner.nextLine().trim();

        String newString = string.replace('e','*');

        System.out.println(string + " now is " + newString);
    }

    public static void q6(){
        //6. Crie um array com os seguintes nomes: "Maria", "João", "Carlos", "Ana", "Beatriz". Em
        //seguida, peça um nome ao usuário e diga se ele está ou não no array.

        System.out.println("\n--------- Question 6 -----------");

        String names[] = {"Maria", "João", "Carlos", "Ana", "Beatriz"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.next();

        int flag = -1, index = 0;

        for(String searchName : names){
            if(name.trim().equalsIgnoreCase(searchName.trim())) {
                //aqui optei por usar o equalIgnoreCase para ignorar o camelCase do equals padrão
                // (não diferenciar chars maiúsculos de minúsculos)
                flag = index;
                break;
            }
            index++;
        }

        if(flag != -1) System.out.println("name '" + name + "' found in index: " + flag);
        else System.out.println("name '" + name + "' not found");
    }

    public static void q7(){
        //7. Crie um programa que leia um número inteiro não-negativo e calcule seu fatorial
        //utilizando o laço for.
        //Exemplo: Entrada = 5 Saída = 120

        System.out.println("\n--------- Question 7 -----------");

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter a integer number for calculate the factorial or enter a negative number for break: ");
            int n = scanner.nextInt();

            // n! = n * (n - 1) * (n - 2) * (n - 3) * ... * (n - (n - 1))

            long fat;

            if(n > 0) {
                fat = n;
                for (int i = 1; i < n; i++) {
                    fat *= n - i;
                }
            } else if (n < 0){
                System.out.println("number " + n + " is invalid, try again");
                break;
            } else {
                fat = 1;
            }

            System.out.println("factorial of " + n + " is: " + fat);
        }
    }

    public static void q8(){
        //8. Crie um programa que exiba um menu repetitivo com as opções:
        //1 - Dizer "Olá"
        //2 - Dizer "Tchau"
        //3 - Encerrar
        //O menu deve continuar aparecendo até que o usuário escolha a opção 3.

        System.out.println("\n--------- Question 8 -----------");

        int option = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (option != 3) {

            System.out.println("\n options: \n 1. Say 'hello' \n 2. Say 'Bye' \n 3. exit");

            System.out.print("Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Hello, user! ");
                    break;
                case 2:
                    System.out.println("Bye, user! ");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("invalid option, enter again");
            }
        }
    }

    public static void q9(){
        //9. Faça um programa que leia o nome completo de uma pessoa e mostre o primeiro
        //nome e o último nome separadamente.

        System.out.println("\n--------- Question 9 -----------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a complete name: ");
        String fullName = scanner.nextLine().trim();

        if(fullName.isBlank()){
            System.out.println("Name is empty!");
            return;
        }

        String[] names = fullName.split("\\s+");

        if(names.length == 1){
            System.out.println(names[0]);
            return;
        }

        System.out.println("lenght " + names.length);

        String firstName = names[0], lastName = names[(names.length-1)];

        System.out.println(firstName+ " " + lastName);
    }

    public static void q10(){
        //10. Escreva um programa que leia uma frase e conte quantas palavras ela possui
        //(considere as palavras separadas por espaços).

        System.out.println("\n--------- Question 10 -----------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String phrase = scanner.nextLine().trim();

        if(phrase.isBlank()){
            System.out.println("Numbers of words in the phrase is: " + 0);
            return;
        }

        String[] wordsInPhrase = phrase.split("\\s+");

        System.out.println("Numbers of words in the phrase is: " + wordsInPhrase.length);
    }

    public static void main(String[] args){
        q1(); q2(); q3(); q4(); q5(); q6(); q7(); q8(); q9(); q10();
    }




}