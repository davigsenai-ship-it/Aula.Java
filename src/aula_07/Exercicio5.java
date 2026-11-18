package aula_07;
import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Qual nome deseja procurar? ");
        String busca = scanner.nextLine();

        boolean encontrou = false;

        for (int i = 0; i < 3; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                encontrou = true;
            }
        }

        if (encontrou) {
            System.out.println("Nome encontrado!");
        } else {
            System.out.println("Nome nao encontrado!");
        }

        scanner.close();
    }
}