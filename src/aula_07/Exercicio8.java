package aula_07;
import java.util.Scanner;

public class Exercicio8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um numero decimal: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 2; i++) {
            double soma = 0;

            for (int j = 0; j < 2; j++) {
                soma += matriz[i][j];
            }

            System.out.println("Soma da linha " + (i + 1) + ": " + soma);
        }

        scanner.close();
    }
}