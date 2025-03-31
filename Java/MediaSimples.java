public class MediaSimples {
    public static Object mediaSimples(int[] notas) {
        if (notas.length < 3) {
            return false;
        }

        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }

        return soma / (double) notas.length;
    }
}
