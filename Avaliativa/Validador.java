package estudos;

import java.math.BigDecimal;

/**
 *
 * @author usuario
 */
public class Validador {

    public static void validaIntegerPositivo(int n, String msg) {
        if (n <= 0) {
            throw new RuntimeException(msg);
        }
    }

    public static void validaIntegerPositivoUm(int n, String msg) {
        if (n < 1) {
            throw new RuntimeException(msg);
        }
    }

    public static void validaDoublePositivo(double n, String msg) {
        if (n <= 0.0) {
            throw new RuntimeException(msg);
        }
    }

    public static void validaIntegerPositivoComLimite(int n, int limite, String msg) {
        if (n > limite) {
            throw new RuntimeException(msg);
        }
    }

    public static void validaStringVazia(String valor, String msg) {
        if (valor == null || valor.isBlank()) {
            throw new RuntimeException(msg);
        }
    }

    public static void validarBigDecimalPositivo(BigDecimal valor, String msg) {
        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException(msg);
        }
    }

}