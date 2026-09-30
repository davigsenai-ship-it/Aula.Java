package aula;

import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite seu nome: ");
        scanner.nextLine();
        String nome = scanner.nextLine();

        System.out.println("Seu nome é: "+ nome);
    }
}