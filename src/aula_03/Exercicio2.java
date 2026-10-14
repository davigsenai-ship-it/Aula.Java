package aula_03;
import java.util.Scanner;

public class Exercicio2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Valor da compra: ");
        int valor_compra = scanner.nextInt();

        if (valor_compra >= 100) {
            valor_compra = valor_compra -  10;
            System.out.println("Valor total a ser para: " + valor_compra);
        }




        scanner.close();
    }
}
