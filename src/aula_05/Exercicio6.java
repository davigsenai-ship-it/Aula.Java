package aula_05;
import java.util.Scanner;

public class Exercicio6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua Nota: ");
        int nota = scanner.nextInt();

        if (nota >= 7){
            System.out.println("Você foi Aprovado");
        } else if (nota <= 5) {
            System.out.println("Você esta de recuperação");
        } else {
            System.out.println("Você foi reprovado");
        }
        scanner.close();
    }
}
