package estudos;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ex03 {

    private static final String TITULO = "3. Caça ao Maior e Menor";

    public Ex03() {
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
        int cont = 0;
        while (cont < 5) {
            int numero = Entrada.inteiro(sc);
            numeros.add(numero);
            cont++;
        }
        Comparator<Integer> comparaMaiorNumero = (n1, n2) -> {
            if (n1 > n2) {
                return 1;
            }
            if (n1 < n2) {
                return -1;
            }
            return 0;
        };
        Comparator<Integer> comparaMenorNumero = (n1, n2) -> {
            if (n1 < n2) {
                return 1;
            }
            if (n1 > n2) {
                return -1;
            }
            return 0;
        };
        Integer maiorNumero = numeros.stream().max(comparaMaiorNumero).get();
        Integer menorNumero = numeros.stream().max(comparaMenorNumero).get();
        System.out.println("""
                %s
                O maior número é %d
                O menor número é %d
                """.formatted(numeros.toString(), maiorNumero, menorNumero));

    }
}