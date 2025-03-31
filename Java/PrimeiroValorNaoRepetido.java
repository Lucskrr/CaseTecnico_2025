import java.util.HashMap;

public class PrimeiroValorNaoRepetido {
    public static int primeiroValorNaoRepetido(int[] array) {
        HashMap<Integer, Integer> contador = new HashMap<>();

        for (int num : array) {
            contador.put(num, contador.getOrDefault(num, 0) + 1);
        }

        for (int num : array) {
            if (contador.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }
}
