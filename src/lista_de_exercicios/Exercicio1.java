package lista_de_exercicios;

import java.util.Scanner;

public class Exercicio1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura: ");
        float altura = scanner.nextFloat();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
    }
}