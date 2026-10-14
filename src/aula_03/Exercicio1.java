package aula_03;
import java.util.Scanner;

public class Exercicio1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("Acesso Liberado");
        } else {
            System.out.println("Acesso Negado");
        }
        scanner.close();
    }
}
