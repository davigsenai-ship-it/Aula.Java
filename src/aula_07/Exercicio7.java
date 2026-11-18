package aula_07;
import java.util.Scanner;

public class Exercicio7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = scanner.nextInt();

                soma += matriz[i][j];
            }
        }

        System.out.println("A soma dos valores e: " + soma);

        scanner.close();
    }
}
