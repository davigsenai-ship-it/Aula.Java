package aula_08;
import java.util.Scanner;

public class Exercicio5 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Media das notas: "+calcularMedia(nota, nota2, nota3));
    }
    public static double calcularMedia(double nota, double nota2, double nota3) {
        double media = (nota + nota2 + nota3) / 3;
        return media;
    }
}
