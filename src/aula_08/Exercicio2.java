package aula_08;
import java.util.Scanner;

public class Exercicio2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite outro numero inteiro: ");
        int numero2 = scanner.nextInt();

        somar(numero1, numero2);
    }
    static void somar(int numero1, int numero2){
        int soma = numero1 + numero2;
        System.out.println("Numero dobrado: "+soma);
    }
}