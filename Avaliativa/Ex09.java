package estudos;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ex09 {

    private static final String TITULO = "9. Juntando as Peças (Concatenação)";

    public Ex09() {
        tarefa();
    }

    public static void tarefa() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(TITULO);
            calculo(sc);

        }
    }

    private static void calculo(Scanner sc) {
        List<Integer> v1 = new LinkedList<>();
        lotarVetor(v1);
        List<Integer> v2 = new LinkedList<>();
        lotarVetor(v2);
        List<Integer> v3 = new LinkedList<>();
        v3.addAll(v1);
        v3.addAll(v2);
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
    }

    private static void lotarVetor(List<Integer> vetor) {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            vetor.add(random.nextInt(1, 10000));
        }
    }
}