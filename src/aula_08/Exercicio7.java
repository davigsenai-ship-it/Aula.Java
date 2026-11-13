package aula_08;
import java.util.Scanner;

public class Exercicio7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro Numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite outro Numero: ");
        int num3 = scanner.nextInt();

        System.out.println("O maior numero é: "+maiorNumero(num1,num2,num3));
    }

    static int maiorNumero(int num1, int num2, int num3) {
        int maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        return maior;
    }
}