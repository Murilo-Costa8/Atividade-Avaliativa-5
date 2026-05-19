package estudos;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ex02 {

    private static final String TITULO = "2. A Soma de Tudo";

    public Ex02() {
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
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            numeros.add(random.nextInt(1, 10000));
        }
        Integer soma = numeros.stream().reduce(0, (subtotal, numero) -> subtotal + numero);
        System.out.println("A soma dos valores " + numeros.toString() + " é " + soma);
    }
}