package aula_05;
import java.util.Scanner;

public class Exercicio5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas horas trabalhadas: ");
        double horas_trabalhadas = scanner.nextDouble();

        System.out.println("Digite o valor pago por hora: ");
        double valor_hora = scanner.nextDouble();

        if (horas_trabalhadas > 40){
            double horas_extras = horas_trabalhadas - 40;

            double valor_hora_extra = valor_hora * 1.5;
            double total_pago_extras = horas_extras * valor_hora_extra;

            System.out.printf("\nO funcionário trabalhou %.1f hora(s) extra(s).\n", horas_extras);
            System.out.printf("O valor a ser pago pelas horas extras é de: R$ %.2f\n", total_pago_extras);
        } else {
            System.out.println("O funcionario não trabalhou mais do que 40 Horas");
        }

        scanner.close();
    }
}
