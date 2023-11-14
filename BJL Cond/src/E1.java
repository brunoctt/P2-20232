/*
Faça um programa que receba dois números e mostre o maior deles. Caso eles sejam iguais,
deve-se mostrar a mensagem "Os números são iguais".
 */

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double secondNumber = scanner.nextDouble();

        if (firstNumber > secondNumber){
            System.out.println("O maior é: " + firstNumber);
        } else if (secondNumber > firstNumber){
            System.out.println("O maior é: " + secondNumber);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
