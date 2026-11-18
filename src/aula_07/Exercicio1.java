package aula_07;
import java.util.Scanner;
public class Exercicio1 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = entrada.nextInt();

            soma += numeros[i];
        }

        System.out.println("A soma dos numeros e: " + soma);

        entrada.close();
    }
}