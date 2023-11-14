/*
Desenvolva um algoritmo que receba três números. O algoritmo deve imprimir "Condição satisfeita",
na tela, caso o primeiro dado inserido seja maior do que os outros dois (o primeiro não pode ser igual a nenhum).
Caso contrário, deve ser impressa a mensagem: "Erro".
 */

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double secondNumber = scanner.nextDouble();

        System.out.println("Insira o terceiro número:");
        double thirdNumber = scanner.nextDouble();

        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
    }
}
