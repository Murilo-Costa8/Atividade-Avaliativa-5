package estudos;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ex08 {

    private static final String TITULO = "8. Gerador de Múltiplos";

    public Ex08() {
        tarefa();
    }

    public static void tarefa() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(TITULO);
            calculo(sc);

        }
    }

    private static void calculo(Scanner sc) {

        while (true) {
            try {
                System.out.println("Digite o número:");
                int numero = Entrada.inteiro(sc);
                System.out.println("Entre a quantidade múltiplos desse número que deseja ver:");
                int qtdMultiplos = Entrada.inteiro(sc);
                List<Integer> numeros = new LinkedList<>();
                for (int i = 1; i <= qtdMultiplos; i++) {
                    numeros.add(i * numero);
                }
                System.out.println("""
                    %d múltiplos de %d abaixo:
                    %s
                    """.formatted(qtdMultiplos, numero, numeros.toString()));
            } catch (RuntimeException e) {
            }
        }
    }
}