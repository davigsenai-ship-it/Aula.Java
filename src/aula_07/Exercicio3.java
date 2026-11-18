package aula_07;
import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean[] valores = new boolean[8];
        int contador = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite true ou false: ");
            valores[i] = entrada.nextBoolean();

            if (valores[i] == true) {
                contador++;
            }
        }

        System.out.println("Quantidade de valores true: " + contador);

        entrada.close();
    }
}