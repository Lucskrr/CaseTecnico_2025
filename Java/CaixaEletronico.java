import java.util.*;

public class CaixaEletronico {
    public static Map<Integer, Integer> menorNumeroNotas(int valor, int[] cedulas) {
        Map<Integer, Integer> resultado = new HashMap<>();

        Arrays.sort(cedulas);
        for (int i = cedulas.length - 1; i >= 0; i--) {
            int cedula = cedulas[i];
            if (valor >= cedula) {
                int count = valor / cedula;
                valor %= cedula;
                resultado.put(cedula, count);
            }
        }

        if (valor > 0) {
            System.out.println("Não foi possível sacar o valor exato.");
        }

        return resultado;
    }
}
