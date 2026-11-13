package aula_08;
import java.util.Scanner;

public class Exemplo {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva seus Dados");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.println("Idade: ");
        int idade = scanner.nextInt();

        imprimeDadosPessoais(idade,nome);
    }
    public static void imprimeDadosPessoais(int idade, String nome){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }
}