/*
Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.
*/

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        float scores = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe três notas, em sequência:");

        for (int i = 0; i < 3; i++){
            float number = scanner.nextFloat();
            scores += number;
        }

        float mean = scores / 3.0f;

        System.out.println("Média aritmética: " + mean);

        scanner.close();
    }
}
