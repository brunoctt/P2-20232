/*
Desenvolva um algoritmo que some todos os números inteiros compreendidos entre 1 e 10 (inclusive).
*/


public class E1 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 10; i++){
            soma += i;
        }

        System.out.printf("Soma de 1 a 10: %d", soma);

    }
}
