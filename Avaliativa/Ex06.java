package estudos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ex06 {

    private static final String TITULO = "6. De Trás para Frente";

    public Ex06() {
        tarefa();
    }

    public static void tarefa() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(TITULO);
            calculo(sc);

        }
    }

    private static void calculo(Scanner sc) {
        List<Integer> numeros = new LinkedList<>();
        int cont = 1;
        while (cont <= 5) {
            try {
                System.out.println("Digite o %dº nome ".formatted(cont));
                Integer numero = Entrada.inteiro(sc);
                numeros.add(numero);
                cont++;
            } catch (NumberFormatException e) {
                System.err.println("Entrada não é um número");
            }
        }
        System.out.println(numeros.toString());
        Collections.reverse(numeros);
        System.out.println(numeros.toString());
    }
}