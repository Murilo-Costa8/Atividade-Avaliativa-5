package estudos;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ex05 {

    private static final String TITULO = "5. Onde está o Wally? (Busca Linear)";

    public Ex05() {
        tarefa();
    }

    public static void tarefa() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(TITULO);
            calculo(sc);
        }
    }

    private static void calculo(Scanner sc) {
        List<String> frutas = List.of("banana", "maçã", "pera", "manga", "melancia");
        System.out.println(frutas.toString());
        while (true) {
            try {
                System.out.println("Digite o nome do fruto buscado");
                String fruta = Entrada.texto(sc);
                Validador.validaStringVazia(fruta, "O nome da fruta não pode estar vazia");
                int pos = frutas.indexOf(fruta);
                if (pos != -1) {
                    System.out.println("A posição da fruta %s está na posição %d".formatted(fruta, pos));
                } else {
                    System.out.println("A fruta %s não está na lista".formatted(fruta));
                }
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }
        }

    }
}