/*
 Faça um programa que receba um número inteiro e verifique se esse número é par ou ímpar.
 */

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " é par.");
        } else {
            System.out.println(number + " é impar.");
        }

    }
}
