package aula_07;
import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;
        double media;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota: ");
            notas[i] = entrada.nextDouble();

            soma += notas[i];
        }

        media = soma / 4;

        System.out.println("A media das notas e: " + media);

        entrada.close();
    }
}