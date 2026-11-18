package aula_07;
import java.util.Scanner;

public class Exercicio9 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int contador = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    contador++;
                }
            }
        }

        System.out.println("Quantidade de numeros pares: " + contador);

        scanner.close();
    }
}
