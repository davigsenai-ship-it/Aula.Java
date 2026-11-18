package aula_07;
import java.util.Scanner;

public class Exercicio6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Valores da matriz:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
