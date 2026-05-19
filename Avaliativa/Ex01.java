package estudos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ex01 {

    private static final String TITULO = "1. Lista de Convidados";

    public Ex01() {
        tarefa();
    }

    public static void tarefa() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(TITULO);
            calculo(sc);
        }
    }

    private static void calculo(Scanner sc) {
        String[] nomes = new String[5];
        int cont = 0;
        while (cont < 5) {
            try {
                System.out.println("Digite o nome do %d° amigo: ".formatted(cont + 1));
                String nome = Entrada.texto(sc);
                Validador.validaStringVazia(nome, "O nome não pode estar vazio");
                nomes[cont] = nome;
                cont++;
            } catch (NumberFormatException e) {
                System.err.println("Entrada inválida");
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }
        }
        iterarVetor(nomes);
    }

    private static void iterarVetor(String[] vetor) {
        for (String n : vetor) {
            System.out.println(n);
        }
    }
}