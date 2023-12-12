/*
Desenvolva um algoritmo que peça para o usuário inserir vários números inteiros.
O algoritmo deverá contabilizar a quantidade de números positivos informados.
Caso o usuário digite 0, o algoritmo deve mostrar quantidade contabilizada e encerrar.
*/


import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positives = 0;
        int number = 1;

        while (number != 0){
            System.out.println("Insira um número:");
            number = scanner.nextInt();
            if (number > 0){
                positives++;
            }
        }

        System.out.printf("Quantidade de positivos: %d", positives);

    }
}
