package aula_08;
import java.util.Scanner;

public class Exercicio6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Par ou Impar (Par = True, Impar = False) )");
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        System.out.print("Numero é: "+verificarPar(numero));
        scanner.close();
    }

    static boolean verificarPar(int numero){
        if(numero%2==0){
            return true;
        } else {
            return false;
        }
    }
}