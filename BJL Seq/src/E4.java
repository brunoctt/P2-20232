/*
Faça um programa que calcule e mostre a área de um triângulo.
Sabe-se que: Área = (base * altura)/2.
 */

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a base:");
        float base = scanner.nextFloat();

        System.out.println("Insira a altura:");
        float height = scanner.nextFloat();

        float area = (base * height) / 2.0f;
        System.out.println("Area do triangulo: " + area);
    }
}
