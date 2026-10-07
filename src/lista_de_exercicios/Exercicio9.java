package lista_de_exercicios;

public class Exercicio9 {
    public static void main(String[] args) {
        float valorFloat = 9.87f;

        long valorLong = (long) valorFloat;

        double valorDouble = valorLong;

        System.out.println("Valor Float original: " + valorFloat);
        System.out.println("Valor Long (Casting Explícito): " + valorLong);
        System.out.println("Valor Double (Casting Implícito): " + valorDouble);
    }
}
