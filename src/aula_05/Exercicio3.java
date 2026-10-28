package aula_05;
import java.util.Scanner;
public class Exercicio3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("|=======================|");
        System.out.println("|=- Escolha uma opção -=|");
        System.out.println("|=======================|");
        System.out.println("|=- 1. Eletronicos    -=|");
        System.out.println("|=- 2. Alimentos      -=|");
        System.out.println("|=- 3. Vestuario      -=|");
        System.out.println("|=======================|");
        System.out.println("Digite sua Escolha: ");
        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                System.out.println("|=================|");
                System.out.println("|=- Eletronicos -=|");
                System.out.println("|=================|");
                break;

            case 2:
                System.out.println("|===============|");
                System.out.println("|=- Alimentos -=|");
                System.out.println("|===============|");
                break;

            case 3:
                System.out.println("|===============|");
                System.out.println("|=- Vestuario -=|");
                System.out.println("|===============|");
                break;

            default:
                System.out.println("Escolha Inexistente!");
                break;
        }
        scanner.close();
    }
}
