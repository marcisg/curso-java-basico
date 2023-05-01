package Exercicios.aula13;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o valor de um dos lado do quadrado? ");
        double lado = scan.nextDouble();
        double resultado = (Math.pow(lado, lado)) * 2;
        System.out.println("O dobro da área do quadrado é " + resultado);


    }
}
