package flamingo.aprendendo.faccat;

import java.util.Scanner;

public class Exercicio07 {
    //Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
    //dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

    static void main(String[] args) {
       byte ano, meses, dias;
       int idadeDias;

       Scanner sc = new Scanner(System.in);

       System.out.println("Vamos calcular quantos anos você já viveu!!! \nPor favor, informe quantos anos você tem: ");
       ano = sc.nextByte();

       System.out.println("Há quantos meses você fez aniversário?");
       meses = sc.nextByte();

        System.out.println("E quantos dias?");
        dias = sc.nextByte();

        idadeDias = (ano * 365) + (meses * 30) + dias;

        System.out.printf("Você já viveu %d dias!", idadeDias);

        sc.close();
    }

}
