/*
Faça um programa que receba dois números maiores que zero,
calcule e mostre um elevado ao outro.
 */

import java.lang.Math;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double base = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double power = scanner.nextDouble();

        double exponentiation = Math.pow(base, power);
        System.out.println("Resultado: " + exponentiation);
    }
}
