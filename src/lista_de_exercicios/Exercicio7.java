package lista_de_exercicios;

public class Exercicio7 {
    public static void main(String[] args) {
        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;

        boolean resultadoAnd = cond1 && cond3;
        boolean resultadoOr = cond1 || cond2;
        boolean resultadoMisto = (cond1 && cond2) || cond3;

        System.out.println("cond1 && cond3: " + resultadoAnd);
        System.out.println("cond1 || cond2: " + resultadoOr);
        System.out.println("(cond1 && cond2) || cond3: " + resultadoMisto);
    }
}