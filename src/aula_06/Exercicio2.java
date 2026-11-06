package aula_06;

public class Exercicio2 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;

        while (numero <= 100) {
            if (numero % 2 == 0) {
                soma += numero;
            }
            numero++;
        }
        System.out.println("A soma de todos os números pares de 1 a 100 é: " + soma);
    }
}