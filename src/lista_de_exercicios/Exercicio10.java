package lista_de_exercicios;

public class Exercicio10 {
    public static void main(String[] args) {
        short valorShort = 100;

        int valorInt = valorShort;

        byte valorByte = (byte) valorShort;

        System.out.println("Valor Short: " + valorShort);
        System.out.println("Valor Int (Casting Implícito): " + valorInt);
        System.out.println("Valor Byte (Casting Explícito): " + valorByte);
    }
}