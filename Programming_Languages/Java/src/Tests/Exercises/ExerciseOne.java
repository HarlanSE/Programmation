package Tests.Exercises;

import java.util.Scanner;
/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

public class ExerciseOne{
    private int years;
    private int months;
    private int days;

    // generic constructor
    public ExerciseOne(){

        Scanner collect = new Scanner(System.in);

        System.out.print("Year: ");
        int year = collect.nextInt();

        System.out.print("Month: ");
        int month = collect.nextInt();

        System.out.print("Day :");
        int day = collect.nextInt();

        this.years = year;
        this.months = month;
        this.days = day;
    }

    public void printInformations(){
        System.out.printf("%d years, %d months, %d days \n",this.years, this.months, this.days);
    }

    public void printDateInDays(){
        int date = (this.years * 365 + this.months * 30 + this.days);
        System.out.printf("%d days \n",date);
    }
    
}