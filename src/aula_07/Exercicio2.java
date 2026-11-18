package aula_07;
import java.util.Scanner;

public class Exercicio2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] letras = new String[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite uma letra: ");
            letras[i] = scanner.next();
        }

        System.out.print("Digite a letra que deseja procurar: ");
        String busca = scanner.next();

        boolean encontrou = false;

        for (int i = 0; i < 6; i++) {
            if (letras[i].equalsIgnoreCase(busca)) {
                System.out.println("Letra encontrada na posicao: " + (i + 1));
                encontrou = true;
            }
        }

        if (encontrou != true) {
            System.out.println("Letra nao encontrada!");
        }
        scanner.close();
    }
}