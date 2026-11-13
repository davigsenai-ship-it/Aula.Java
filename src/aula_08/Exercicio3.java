package aula_08;
import java.util.Scanner;

public class Exercicio3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        dobrar(numero);
    }
    static void dobrar(int numero){

        System.out.println("Numero dobrado: " +  numero*2);
    }
}
