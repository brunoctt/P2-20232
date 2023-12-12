/*
Desenvolva um algoritmo que receba um número N e informe se N é um número primo, ou não.
A saber: um número primo é um inteiro positivo que só pode ser dividido por ele mesmo e por um, apenas.
*/


import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número:");
        int number = scanner.nextInt();

        if (isPrime(number)){
            System.out.printf("%d é primo.", number);
        } else {
            System.out.printf("%d não é primo.", number);
        }

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
