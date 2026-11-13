package aula_08;
import java.util.Scanner;

public class Exercicio1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        imprimirSaudacao(nome);
    }
    static void imprimirSaudacao(String nome){
        System.out.println(nome+", Bem-vindo ao sistema!");
    }
}
