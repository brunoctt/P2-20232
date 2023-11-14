/*
Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário,
sabendo-se que este sofreu um aumento de 25%.
 */

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o salário:");
        float salary = scanner.nextFloat();

        // Increasing salary
        salary = salary * 1.25f;

        System.out.println("Novo salário: " + salary);

        scanner.close();
    }
}
