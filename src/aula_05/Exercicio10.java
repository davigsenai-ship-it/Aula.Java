package aula_05;

import java.util.Scanner;

public class Exercicio10 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza o valor em reais: ");
        double valorReais = scanner.nextDouble();

        System.out.println("Escolha o código da moeda:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");
        int codigo = scanner.nextInt();

        // Taxas de câmbio de exemplo (podem ser ajustadas conforme a cotação pretendida)
        double cotacaoDolar = 5.00;
        double cotacaoEuro = 5.50;
        double cotacaoLibra = 6.50;

        switch (codigo) {
            case 1:
                double valorDolar = valorReais / cotacaoDolar;
                System.out.printf("Valor convertido: %.2f Dólares[cite: 2]\n", valorDolar);
                break;
            case 2:
                double valorEuro = valorReais / cotacaoEuro;
                System.out.printf("Valor convertido: %.2f Euros[cite: 2]\n", valorEuro);
                break;
            case 3:
                double valorLibra = valorReais / cotacaoLibra;
                System.out.printf("Valor convertido: %.2f Libras[cite: 2]\n", valorLibra);
                break;
            default:
                System.out.println("Código de moeda inválido.");
        }
        scanner.close();
    }
}