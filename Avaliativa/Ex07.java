package estudos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author usuario
 */
public class Ex07 {

    private static final String TITULO = "7. Média da Turma com Vetores";

    public Ex07() {
        tarefa();
    }

    public static void tarefa() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(TITULO);
            calculo(sc);

        }
    }

    private static void calculo(Scanner sc) {
        Map<String, List<Double>> alunos = new HashMap<>();
        Random random = new Random();
        int cont = 1;

        while (cont <= 5) {
            try {
                System.out.println("Digite o nome do %dº: ".formatted(cont));
                String nome = Entrada.texto(sc);
                Validador.validaStringVazia(nome, "O nome não pode estar vazio");
                alunos.put(nome, new LinkedList<>());
                cont++;
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }
        }

        alunos.keySet().stream().forEach((k) -> {
            for (int i = 0; i < 5; i++) {
                double nota = Math.round(random.nextDouble(0.0, 10.1));
                alunos.get(k).add(nota);
            }
        });

        Map<String, Double> alunosMediaNotas = alunos.entrySet().stream().collect(
                Collectors.toMap(e -> e.getKey(), e -> e.getValue().stream().mapToDouble(n -> n).average().orElse(0.0))
        );

        double alunosMedia = alunos.values().stream().flatMap(notas -> notas.stream()).mapToDouble(n -> n).average().orElse(0.0);
        alunosMediaNotas.entrySet().forEach((e) -> {
            if (e.getValue() >= alunosMedia) {
                System.out.println("O aluno %s está acima da média com %.2f que é %.2f".formatted(e.getKey(), e.getValue(), alunosMedia));
            } else {
                System.out.println("O aluno %s está abaixo da média com %.2f que é %.2f".formatted(e.getKey(), e.getValue(), alunosMedia));
            }
        });

    }
}