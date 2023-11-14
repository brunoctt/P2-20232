/*
Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.
*/

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quatro números, em sequência:");

        for (int i = 0; i < 4; i++){
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Resultado da sum: " + sum);

        scanner.close();
    }
}
