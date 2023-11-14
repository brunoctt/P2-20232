/*
Desenvolva um algoritmo que receba dois números, calcule e mostre a multiplicação entre eles, se ambos forem iguais.
Caso o primeiro seja maior que o segundo, mostre a subtração do primeiro pelo segundo.
Caso contrário, mostre a soma entre os dois.
 */

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro valor:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Insira o segundo valor:");
        double secondNumber = scanner.nextDouble();

        if (firstNumber == secondNumber) {
            System.out.println("Multiplicação: " + firstNumber * secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println("Subtração: " + (firstNumber - secondNumber));
        } else {
            System.out.println("Soma: " + (firstNumber + secondNumber));
        }

    }
}
