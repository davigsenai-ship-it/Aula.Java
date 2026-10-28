package aula_05;
import java.util.Scanner;

public class Exercicio7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite outro numero: ");
        double numero2 = scanner.nextDouble();

        System.out.println("|===========================|");
        System.out.println("|=- Operações Matematicas -=|");
        System.out.println("|===========================|");
        System.out.println("|=-   1. Soma             -=|");
        System.out.println("|=-   2. Subtração        -=|");
        System.out.println("|=-   3. Multiplicação    -=|");
        System.out.println("|=-   4. Divisão          -=|");
        System.out.println("|===========================|");
        System.out.println("Digite qual Operação você deseja: ");
        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                double total_som = numero1 + numero2;
                System.out.println("O Resultado é: " + total_som);
                break;

            case 2:
                double total_sub = numero1 - numero2;
                System.out.println("O Resultado é: " + total_sub);
                break;

            case 3:
                double total_mul = numero1 * numero2;
                System.out.println("O Resultado é: " + total_mul);
                break;

            case 4:
                double total_div = numero1 / numero2;
                System.out.println("O Resultado é: " + total_div);
                break;

            default:
                System.out.println("Opção Invalida");
                break;
        }
        scanner.close();
    }
}
