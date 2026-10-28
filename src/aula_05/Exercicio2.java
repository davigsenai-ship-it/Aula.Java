package aula_05;
import java.util.Scanner;

public class Exercicio2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Valor da compra: ");
        double valor_compra = scanner.nextDouble();

        double desconto;

        if (valor_compra >= 100) {
            desconto =  valor_compra * 0.10;
            double total = (valor_compra) - (desconto) ;

            System.out.println("Valor total a ser pago: " + total);
        }
        scanner.close();
    }
}
