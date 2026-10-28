package aula_05;

import java.util.Scanner;

public class Exercicio8 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Avalie o Funcionario com uma nota de 1 a 5: ");
        int avaliacao = scanner.nextInt();

        switch (avaliacao){
            case 1:
                System.out.println("Precisa Melhorar");
                break;

            case 2:
                System.out.println("Abaixo da Media");
                break;

            case 3:
                System.out.println("Media");
                break;

            case 4:
                System.out.println("Acima da Media");
                break;

            case 5:
                System.out.println("Excelente");
                break;

            default:
                System.out.println("Opção Invalida!");
                break;
        }
        scanner.close();
    }
}
