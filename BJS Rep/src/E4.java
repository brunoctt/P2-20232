/*
Desenvolva um algoritmo que peça ao usuário que insira dois números inteiros positivos A e B,
no qual A deve ser menor que B (supõe-se que o usuário irá respeitar esse enunciado).
O algoritmo deve mostrar, na tela, todos os números ímpares compreendidos entre A e B (inclusive).
*/


import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int a = scanner.nextInt();
        System.out.println("Insira o valor de B:");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++){
            if (i % 2 == 1){
                System.out.printf("É ímpar: %d\n", i);
            }
        }

    }
}
