package estudos;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ex10 {

    private static final String TITULO = "10. Limpando os Repetidos";

    public Ex10() {
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

        v1.stream().forEach((n) -> {
            if (!v2.contains(n)) {
                v2.add(n);
            }
        });
        System.out.println(v1.toString());
        System.out.println(v2.toString());
    }

    private static void lotarVetor(List<Integer> vetor) {
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            vetor.add(random.nextInt(1, 5));
        }
    }
}