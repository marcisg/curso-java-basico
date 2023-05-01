package Exercicios.aula13;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Total em metros: ");
        int metro = scan.nextInt();
        int resultado = metro * 100;
        System.out.println("Em " + metro + "m" + " temos " + resultado + "cm.");

    }
}
