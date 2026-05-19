package estudos;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

/**
 *
 * @author usuario
 */
public class Ex04 {

    private static final String TITULO = "4. Filtrando os Pares";

    public Ex04() {
        tarefa();
    }

    public static void tarefa() {

        System.out.println(TITULO);
        calculo();

    }

    private static void calculo() {
        Random random = new Random();
        List<Integer> numeros = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(1, 10000));
        }
        Predicate<Integer> filterNumeroPar = (n) -> n % 2 == 0;
        List<Integer> numerosPares = numeros.stream().filter(filterNumeroPar::test).toList();
        System.out.println("""
                %s
                %s
                """.formatted(numeros.toString(), numerosPares.toString()));
    }
}