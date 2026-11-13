package aula_08;
import java.util.Scanner;

public class Exercicio4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um Valor em Celsius: ");
        double celsius  = scanner.nextDouble();

        System.out.println("Valor em Fahrenheit: "+converterCelsiusParaFahrenheit(celsius));
    }
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
}
