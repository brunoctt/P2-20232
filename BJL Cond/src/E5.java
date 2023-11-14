/*
Desenvolva um algoritmo que simule uma calculadora. Você deve dar a opção de o usuário escolher entre:
1 - Somar; 2 - Subtrair; 3 - Multiplicar; 4 - Dividir.
O usuário só conseguirá processar dois números inteiros por vez.
*/

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Digite 1 para somar;
                Digite 2 para subtrair;
                Digite 3 para multiplicar;
                Digite 4 para dividir;""");
        int option = scanner.nextInt();

        System.out.println("Insira o primeiro valor:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Insira o segundo valor:");
        double secondNumber = scanner.nextDouble();

        switch (option){
            case 1: System.out.println("Soma: " + (firstNumber + secondNumber)); break;
            case 2: System.out.println("Subtração: " + (firstNumber - secondNumber)); break;
            case 3: System.out.println("Multiplicação: " + (firstNumber * secondNumber)); break;
            case 4:
                if (secondNumber != 0){
                    System.out.println("Divisão: " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Divisão por zero.");
                }
                break;
            default: System.out.println("Opção inválida");
        }
    }
}
