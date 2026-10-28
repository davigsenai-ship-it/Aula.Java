package aula_05;
import java.util.Scanner;

public class Exercicio4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Valor de suas vendas:");
        double vendas = scanner.nextDouble();

        double comissao;

        if (vendas < 1000) {
            comissao = vendas * 0.05;
        } else if (vendas <= 5000) {
            comissao = vendas * 0.10;
        } else {
            comissao = vendas * 0.15;
        }

        System.out.printf("O valor da comissão é: R$ %.2f\n", comissao);

        double valor_total = comissao + vendas;

        System.out.printf("O Valor total é: R$ %.2f\n", valor_total);
        scanner.close();
    }
}
